package com.hospital_vym.cl.hospital_vym.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital_vym.cl.hospital_vym.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

    // USO JPQL
    @Query("SELECT p FROM Paciente p WHERE p.apellidos = :apellidos")
    List<Paciente> buscarPorApellidos(@Param("apellidos") String apellido);

    // USO SQL NATIVO
    @Query(value = "SELECT * FROM paciente WHERE correo = :correo", nativeQuery = true)
    Paciente buscarPorCorreo(@Param("correo") String correo);
}
