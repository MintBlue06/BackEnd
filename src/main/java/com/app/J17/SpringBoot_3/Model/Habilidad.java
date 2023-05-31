package com.app.J17.SpringBoot_3.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="habilidad")
//Serializable (borrar)?
//implements Serializable
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_habilidad;
    private String nombre_herramienta;
    private float nivel;

    public Habilidad(){}

    public Habilidad(int id_habilidad, String nombre_herramienta, float nivel){
        this.id_habilidad = id_habilidad;
        this.nombre_herramienta = nombre_herramienta;
        this.nivel = nivel;
    }
}
