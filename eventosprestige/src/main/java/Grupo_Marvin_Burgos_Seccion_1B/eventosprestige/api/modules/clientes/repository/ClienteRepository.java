package Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.repository;

import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    //metodo personalizado
    Optional<Cliente> findByCorreo(String correo);
}
