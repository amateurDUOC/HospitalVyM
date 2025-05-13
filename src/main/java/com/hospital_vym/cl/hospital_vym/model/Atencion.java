package com.hospital_vym.cl.hospital_vym.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "atencion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date fecha_atencion;
    @Column(nullable = false)
    private Date hora_atencion;
    @Column(nullable = false)
    private Float costo;
    @Column(nullable = true)
    private String comentario;
    
}
