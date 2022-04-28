package com.letscode.Conta.dto;

import com.letscode.Conta.model.Conta;
import com.letscode.Conta.model.enums.TipoConta;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class ContaResponse {
    private Long id;
    private String numero;
    private String agencia;
    private TipoConta tipoConta;
    private BigDecimal saldo;

    public ContaResponse(Conta conta) {
        this.id = conta.getId();
        this.numero = conta.getNumero();
        this.agencia = conta.getAgencia();
        this.tipoConta = conta.getTipoConta();
        this.saldo = conta.getSaldo();
    }
}
