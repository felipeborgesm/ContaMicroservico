package com.letscode.Conta.dto;

import com.letscode.Conta.model.enums.TipoConta;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class ContaRequest {
    private String numero;
    private String agencia;
    private TipoConta tipoConta;
    private BigDecimal saldo;
}
