package com.testessiaapi.service;

import com.testessiaapi.domain.Cliente;
import com.testessiaapi.exception.EntityInUseException;
import com.testessiaapi.exception.EntityNotFoundException;
import com.testessiaapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente){
        if(cliente != null){
            clienteRepository.save(cliente);
            System.out.println("O cliente,  " + cliente + ", foi salvo com sucesso!!");

        }else{
            System.out.println("O cliente já existe!!!");

        }
        return cliente;
    }

    public List<Cliente> getAll(){

        return (clienteRepository.findAll());
    }

    public Optional<Cliente> getById(UUID idCliente){

        return clienteRepository.findById(idCliente);
    }

    public Cliente atualizarCliente(UUID idCliente) {

        return clienteRepository.getReferenceById(idCliente);
    }

    public void deletarCliente (UUID idCliente) throws EntityInUseException {
        try {
            clienteRepository.deleteById(idCliente);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException(String.format("Não há registro de cliente com código %d", idCliente));
        } catch (DataIntegrityViolationException e) {
            throw  new EntityInUseException(String.format("O cliente do código %d não pode ser removido porque está em uso ", idCliente));
        }
    }
}
