package com.testessiaapi.dto.request;

import jakarta.validation.constraints.NotBlank;

public record ClienteResponseDto(@NotBlank String nomeCliente, @NotBlank String cpf, @NotBlank String email, @NotBlank String telefoneCelular,
                                 String s){
}
