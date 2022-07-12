package io.github.greenizer.dto;

import io.github.greenizer.entity.ParcelaRendaEntity;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class RendaDTO {

    private String nome;

    private String descricao;

    private BigDecimal valor;

    private LocalDate dataInicio;

    private LocalDate dataFinal;

    private LocalDate periodoPagamento;

    private List<ParcelaRendaEntity> parcelas = new ArrayList<>();

}
