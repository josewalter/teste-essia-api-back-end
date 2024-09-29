package com.testessiaapi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
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

   public Cliente(UUID uuid, String carmem, String s, String mail, String s1, Instant now, Object o) {
    }
}
