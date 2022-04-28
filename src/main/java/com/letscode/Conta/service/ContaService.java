package com.letscode.Conta.service;

import com.letscode.Conta.dto.ContaRequest;
import com.letscode.Conta.dto.ContaResponse;

public interface ContaService {

    ContaResponse create(ContaRequest contaRequest, Long id);

    ContaResponse findById(Long id);
}
