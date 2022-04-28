package com.letscode.Conta.model;

import com.letscode.Conta.dto.ContaRequest;
import com.letscode.Conta.model.enums.TipoConta;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String agencia;
    private TipoConta tipoConta;
    private BigDecimal saldo;
    private Long userId;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public Conta(ContaRequest contaRequest) {
        this.numero = contaRequest.getNumero();
        this.agencia = contaRequest.getAgencia();
        this.tipoConta = contaRequest.getTipoConta();
        this.saldo = contaRequest.getSaldo();
    }
}
