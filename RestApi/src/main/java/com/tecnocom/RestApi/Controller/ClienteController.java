package com.tecnocom.RestApi.Controller;

import com.tecnocom.RestApi.Model.Cliente;
import com.tecnocom.RestApi.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cliente/save")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @GetMapping("/clientes")
    public List<Cliente> showListClientes() {
        return clienteService.getList();
    }

    @GetMapping("/cliente/{id}")
    public Cliente showClienteId(@PathVariable Long id) {
        return clienteService.getById(id);
    }

    @GetMapping("/cliente/user/{username}")
    public Cliente showClienteUsername(@PathVariable String username) {
        return clienteService.getByUsername(username);
    }

    @GetMapping("/cliente/email/{email}")
    public Cliente showClienteEmail(@PathVariable String email) {
        return clienteService.getByEmail(email);
    }

    @GetMapping("/cliente/provincia/{provincia}")
    public List<Cliente> showClienteProvincia(@PathVariable String provincia) {
        return clienteService.getByProvincia(provincia);
    }

    @GetMapping("/cliente/comunidad/{comunidad}")
    public List<Cliente> showClienteComunidad(@PathVariable String comunidad) {
        return clienteService.getByComunidad(comunidad);
    }

    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }

    @PutMapping("/cliente/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {

        Cliente clienteUpdate = clienteService.getById(id);

        clienteUpdate.setUsername(cliente.getUsername());
        clienteUpdate.setPassword(cliente.getPassword());
        clienteUpdate.setEmail(cliente.getEmail());
        clienteUpdate.setDireccion(cliente.getDireccion());
        clienteUpdate.setTelefono(cliente.getTelefono());
        clienteUpdate.setComunidad(cliente.getComunidad());
        clienteUpdate.setProvincia(cliente.getProvincia());
        clienteUpdate.setCiudad(cliente.getCiudad());

        return clienteService.saveCliente(clienteUpdate);

    }

}
