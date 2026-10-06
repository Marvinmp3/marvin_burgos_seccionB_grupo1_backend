package Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.salones.model.entity;

import jakarta.persistence.*;

@Entity@Table(name = "salones")
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_salon")
    private String nombre_salon;

    @Column(name = "capacidad")
    private String capacidad;

    @Column(name = "precio_renta")
    private String precio_renta;

    @Column(name = "ubicacion")
    private String ubicacion;

    }
