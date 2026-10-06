package Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.service;

import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.model.entity.Cliente;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.dnd.DragGestureEvent;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    //create
    public Cliente guardar(Cliente cliente){
        return repository.save(cliente);
    }

    //read all
   public List<Cliente> obtenerTodos(){
        return repository.findAll();
   }

   //read por id
    public Cliente obtenerPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

//    //update
//    public Cliente actualizar(Long id, Cliente detalles){
//        Cliente cliente = obtenerPorId(id);
//        cliente.setNombre(detalles.getNombre());
//        cliente.setApellido(detalles.getApellido());
//        cliente.setTelefono(detalles.getTelefono());
//        cliente.setEmail(detalles.getEmail());
//        cliente.setDireccion(detalles.getDireccion());
//        return repository.save(cliente);
//
//    }

    //delete
    public void eliminar(Long id){
        Cliente cliente = obtenerPorId(id);
        repository.delete(cliente);
    }
}
