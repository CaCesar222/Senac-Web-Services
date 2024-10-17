package com.senac.ads4.atv_04_10.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "pedido")
public class PedidoModel {

    @Id
    @SequenceGenerator(name="pedido_seq_gen",
            sequenceName="pedido_sequence",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pedido_seq_gen")
    private Integer id;

    @Column (name = "NUMERO", nullable = false)
    private Long numero;

    @Column(name = "DATA", nullable = false)
    private Integer data;
}
