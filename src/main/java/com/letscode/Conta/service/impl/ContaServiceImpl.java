package com.letscode.Conta.service.impl;

import com.letscode.Conta.clients.ContaUsuarioClient;
import com.letscode.Conta.dto.ContaRequest;
import com.letscode.Conta.dto.ContaResponse;
import com.letscode.Conta.dto.client.UsuarioInfo;
import com.letscode.Conta.model.Conta;
import com.letscode.Conta.repository.ContaRepository;
import com.letscode.Conta.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContaServiceImpl implements ContaService {

    private final ContaRepository contaRepository;
    private final ContaUsuarioClient contaUsuarioClient;

    @Override
    public ContaResponse create(ContaRequest contaRequest, Long id) {
        UsuarioInfo usuarioInfo = contaUsuarioClient.execute(id);

        Conta conta  = new Conta(contaRequest);
        conta.setUserId(id);
        Conta contaSalva = contaRepository.save(conta);
        return new ContaResponse(contaSalva);
    }

    @Override
    public ContaResponse findById(Long id) {
        Conta conta = contaRepository.findById(id).orElseThrow();
        return new ContaResponse(conta);
    }
}
