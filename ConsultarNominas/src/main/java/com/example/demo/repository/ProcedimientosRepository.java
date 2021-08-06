package com.example.demo.repository;
import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Empresas;
import com.example.demo.model.Facturas;
import com.example.demo.model.Pagos;

public interface ProcedimientosRepository extends JpaRepository<Facturas, Integer>{

	@Query( " SELECT e FROM Empresas e WHERE e.id =?1")
    Empresas findByNomina(Integer empresa);
	
	@Query( "SELECT p FROM Pagos p WHERE p.formapago =?1")
	Pagos findByFormaPagos(String pagos);
	
	@Query( "SELECT f FROM Facturas f WHERE f.fecha =?1")
	Facturas findByFechas(Date fecha);
}