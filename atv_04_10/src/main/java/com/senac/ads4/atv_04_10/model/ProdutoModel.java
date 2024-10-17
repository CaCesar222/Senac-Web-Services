package com.senac.ads4.atv_04_10.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class ProdutoModel {

    @Id
    @SequenceGenerator(name="produto_seq_gen",
            sequenceName="produto_sequence",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="produto_seq_gen")
    private Integer id;

    @Column (name = "DESCRICAO", columnDefinition = "TEXT", nullable = false, length = 100)
    private String descricao;

    @Column (name = "QUANTIDADE", nullable = false)
    private Double quantidade;

    @Column (name = "VALOR", nullable = false)
    private Double valor;
}
