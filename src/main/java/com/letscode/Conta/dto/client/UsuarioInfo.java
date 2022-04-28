package com.letscode.Conta.dto.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UsuarioInfo {
    private Long id;
    @JsonProperty("nome")
    private String nome;
}
