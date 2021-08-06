package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.Facturas;

public interface ProcedimientosRepository extends JpaRepository<Facturas, Integer>{

	@Query( " SELECT f FROM Facturas f WHERE f.empresa =?1")
    Facturas findByNomina(Integer empresa);
}