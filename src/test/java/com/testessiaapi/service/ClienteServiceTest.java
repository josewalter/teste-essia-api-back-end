package com.testessiaapi.service;

import com.testessiaapi.domain.Cliente;
import com.testessiaapi.dto.request.ClienteRecordDto;
import com.testessiaapi.repository.ClienteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {
/*
    @InjectMocks
    private ClienteService clienteService;

    @MockitoBean
    private ClienteRepository clienteRepository;


    @Test
    @DisplayName("Deve salvar um cliente")
    public void DeveSalvarUmCliente() {

    }

    @Test
    @DisplayName("Deve retornar uma lista com um de cliente")
    public void deveRetornarUmaListaComUmCliente () {
        Cliente cliente = new Cliente("d9046844-51b9-41a6-a8ca-f5953e5c95d8", "Maria atualizada",  "237.398.407-78", "maria@gmail.com", "(19)98572-8929");
        when(clienteRepository.findAll()).thenReturn((List<Cliente>) Collections.singletonList(cliente));
        List<Cliente> clientes = clienteService.getAll();
        System.out.println(clientes);

        Assertions.assertEquals(1, clientes.size());
    }

    @Test
    @DisplayName("Deve buscar um cliente por id")
    public void buscarClientePorId() {
        ClienteRecordDto clienteRecordDto = clienteService.getById(UUID);
        Assertions.assertNotNull(clienteRecordDto);
    }

    @Test
    void atualizarCliente() {
    }

    @Test
    void deletarCliente() {
    }

 */
}