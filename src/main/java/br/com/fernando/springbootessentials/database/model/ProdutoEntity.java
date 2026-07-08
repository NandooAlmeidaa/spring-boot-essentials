package br.com.fernando.springbootessentials.database.model;

import jdk.jshell.Snippet;
import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProdutoEntity {

    private Integer id;
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;

}
