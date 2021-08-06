package com.example.demo.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.exceptions.DatosNoEncontradosException;
import com.example.demo.model.Facturas;
import com.example.demo.repository.ProcedimientosRepository;

@Component
public class ProcedimientosRepo {
	@Autowired
	private ProcedimientosRepository repository;
	
	public List<Facturas> BuscarNomina(){
		List<Facturas> listar = null;
		try {
			listar = repository.findByNomina();
		}catch (Exception e) {
			throw new DatosNoEncontradosException("409", " ERROR AL LISTAR ");
		}
		return listar;
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
