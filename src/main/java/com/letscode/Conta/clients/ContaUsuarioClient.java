package com.letscode.Conta.clients;

import com.letscode.Conta.dto.client.UsuarioInfo;
import com.letscode.Conta.exception.UsuarioNaoEncontradoException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ContaUsuarioClient {

    public UsuarioInfo execute(Long id) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        var usuarioInfoResponseEntity = restTemplate.exchange(
                "http://localhost:8080/usuario/{id}",
                HttpMethod.GET,
                entity,
                UsuarioInfo.class,
                id.toString()
        );

        if (usuarioInfoResponseEntity.getStatusCode().isError())
            throw new UsuarioNaoEncontradoException("Id não existe " + id);

        return usuarioInfoResponseEntity.getBody();
    }
}
