package Grupo_Marvin_Burgos_Seccion_1B.eventosprestige.api.modules.eventos.model.entity;

import jakarta.persistence.*;

@Entity@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_cliente")
    private String id_cliente;

    @Column(name = "id_salon")
    private String id_salon;

    @Column(name = "nombre_evento")
    private String nombre_evento;

    @Column(name = "fecha_evento")
    private String fecha_evento;

    @Column(name = "cantidad_personas")
    private String cantidad_personas;

    @Column(name = "cantidad_horas")
    private String cantidad_horas;

    @Column(name = "estado")
    private String estado;

    @Column(name = "total_pago")
    private String total_pago;
}
