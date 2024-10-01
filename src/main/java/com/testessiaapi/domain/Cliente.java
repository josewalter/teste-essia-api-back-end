package com.testessiaapi.domain;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_cliente")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cliente_id")
    private UUID idCliente;

    @Column(name = "nome_cliente", length = 40, nullable = false)
    private String nomeCliente;

    @Column(name = "cpf", length = 14, nullable = false)
    private String cpf;

    @Column(name = "email", length = 45, nullable = false)
    private String email;

    @Column(name = "telefone_celular", length = 14, nullable = false)
    private String telefoneCelular;
}
