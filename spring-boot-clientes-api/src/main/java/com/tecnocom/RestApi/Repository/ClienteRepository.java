package com.tecnocom.RestApi.Repository;

import com.tecnocom.RestApi.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByUsername(String username);
    Cliente findByEmail(String email);
    List<Cliente> findByProvincia(String provincia);
    List<Cliente> findByComunidad(String comunidad);

}
