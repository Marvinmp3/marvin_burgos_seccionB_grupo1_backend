package Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.controller;

import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.model.entity.Cliente;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar(){
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obtener(@PathVariable Long id){
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> crear(@RequestBody Cliente cliente){
        return new ResponseEntity<>(service.guardar(cliente), HttpStatus.CREATED);
    }

//    @PostMapping("/{id}")
//    public ResponseEntity<Cliente> actualizar(@PathVariable Long id, @RequestBody Cliente cliente){
//        return ResponseEntity.ok(service.actualizar(id, cliente));
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}
