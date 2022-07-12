package io.github.greenizer.entity;

import io.github.greenizer.enums.StatusParcelaEnum;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "parcelas_renda")
public class ParcelaRendaEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "situacao")
    @Enumerated(EnumType.STRING)
    private StatusParcelaEnum situacao;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "renda_id")
    private RendaEntity renda;

}
