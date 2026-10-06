package Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.salones.repository;

import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.model.entity.Cliente;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.repository.ClienteRepository;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.salones.model.entity.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalonRepository extends JpaRepository<Salon, Long>{

}
