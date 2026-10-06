package Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.salones.service;

import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.model.entity.Cliente;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.repository.ClienteRepository;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.eventos.repository.SalonRepository;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.salones.model.entity.Salon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonService {

    @Autowired
    private SalonRepository repository;

    //create
    public Salon guardar(Salon salon) {
        return repository.save(salon);
    }

    //read all
    public List<Salon> obtenerTodos() {
        return repository.find();
    }

    //read por id
    public Salon obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }


    //delete
    public void eliminar(Long id) {
        Salon salon = obtenerPorId(id);
        repository.delete(salon);
    }
}