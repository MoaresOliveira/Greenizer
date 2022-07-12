package io.github.greenizer.dto;


import io.github.greenizer.enums.StatusDividaEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DividasDTO {

    private Integer id;
    private String decricao;
    private BigDecimal valorTotal;
    private int quantidade;
    private String nome;
    private StatusDividaEnum status;


}
