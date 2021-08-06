package com.example.demo.repo;

import java.sql.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.example.demo.exceptions.DatosNoEncontradosException;
import com.example.demo.model.Empresas;
import com.example.demo.model.Facturas;
import com.example.demo.model.Pagos;
import com.example.demo.repository.ProcedimientosRepository;

@Component
public class ProcedimientosRepo {
	@Autowired
	private ProcedimientosRepository repository;
	
	public Empresas BuscarNomina(Integer empresa){
		Empresas emp = null;
		try {
			emp = repository.findByNomina(empresa);
			 if(emp==null) {
	               throw new DatosNoEncontradosException("Datos no encontrados");
			 }
		}catch (Exception e) {
			throw new DatosNoEncontradosException("409", " ERROR AL LISTAR ");
		}
		return emp;
	}
	
	
	public Pagos BuscarFormaPagos(String pagos){
		Pagos p = null;
		try {
			 p = repository.findByFormaPagos(pagos);
			 if(p==null) {
	               throw new DatosNoEncontradosException("Datos no encontrados");
			 }
		}catch (Exception e) {
			throw new DatosNoEncontradosException("409", " ERROR AL LISTAR ");
		}
		return p;
	}
	
	public Facturas buscarFecha(Date fecha){
		Facturas f = null;
		try {
			 f = repository.findByFechas(fecha);
			 if(f==null) {
	               throw new DatosNoEncontradosException("Datos no encontrados");
			 }
		}catch (Exception e) {
			throw new DatosNoEncontradosException("409", " ERROR AL LISTAR ");
		}
		return f;
	}

	public Optional<Facturas> findById(Integer id){
		Optional<Facturas> listid = null;
		try {
			listid = repository.findById(id);
		}catch (Exception e) {
			throw new DatosNoEncontradosException("409", "ERROR AL EXTRAR DATOS POR ID ");
		}
		return listid;
	}
}
