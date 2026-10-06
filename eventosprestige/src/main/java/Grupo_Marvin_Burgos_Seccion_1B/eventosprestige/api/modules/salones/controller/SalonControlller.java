package Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.salones.controller;


import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.model.entity.Cliente;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.clientes.service.ClienteService;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.salones.model.entity.Salon;
import Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.salones.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController@RequestMapping("/api/salones")
public class SalonControlller{

    @Autowired
    private SalonService service;

 @GetMapping
 public ResponseEntity<List<Salon>> listar(){
     return ResponseEntity.ok(service.obtenerTodos());
 }

    @GetMapping("/{id}")
    public ResponseEntity<Salon> obtener(@PathVariable Long id){
        return ResponseEntity.ok(service.obtenerPorId(id));
    }


    @PostMapping
    public ResponseEntity<Salon> crear(@RequestBody Salon salon){
        return new ResponseEntity<>(service.guardar(salon), HttpStatus.CREATED);
    }

@PutMapping("/{id}")
public ResponseEntity<Salon> actualizar(@PathVariable Long id, @RequestBody Salon salon){
     return new ResponseEntity<>(service.guardar(salon), HttpStatus.CREATED);
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}