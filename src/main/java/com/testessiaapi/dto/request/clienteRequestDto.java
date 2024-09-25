package com.testessiaapi.dto.request;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class clienteRequestDto {

    private String nomeCliente;

    private String cpf;

    private String email;

    private String telefoneCelular;
}
