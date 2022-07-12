package io.github.greenizer.dto;

import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class RendaDTO {

    private String nome;

    private String descricao;

    private BigDecimal valor;

    private LocalDate dataInicio;

    private LocalDate dataFinal;

    private LocalDate periodoPagamento;

}
