package com.tecnocom.RestApi.Service;

import com.tecnocom.RestApi.Model.Cliente;
import com.tecnocom.RestApi.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getList() {
        return clienteRepository.findAll();
    }

    public Cliente getById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente getByUsername(String username) {
        return clienteRepository.findByUsername(username);
    }

    public Cliente getByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }

    public List<Cliente> getByProvincia(String provincia) {
        return clienteRepository.findByProvincia(provincia);
    }

    public List<Cliente> getByComunidad(String comunidad) {
        return clienteRepository.findByComunidad(comunidad);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

}
