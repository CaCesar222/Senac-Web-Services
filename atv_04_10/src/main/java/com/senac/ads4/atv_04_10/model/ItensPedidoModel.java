package com.senac.ads4.atv_04_10.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "itens_pedido")
public class ItensPedidoModel {

    @Id
    @SequenceGenerator(name="itens_pedido_seq_gen",
            sequenceName="itens_pedido_sequence",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="itens_pedido_seq_gen")
    private Integer id;

    @Column (name = "QUANTIDADE_ITEM", nullable = false)
    private Double quantidadeItem;

    @Column (name = "VALOR_UNIDADE", nullable = false)
    private Double valorUnidade;
}
