package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.DatosNoEncontradosException;
import com.example.demo.model.Facturas;
import com.example.demo.repository.ProcedimientosRepository;
@Service
@Component
public class ProcedimientoService{
	@Autowired
	private ProcedimientosRepository repository;

	public Facturas BuscarNomina(Integer empresa) {
		Facturas f = null;
		try {
			if(empresa <= 0 || empresa.equals(null)) {
				throw new DatosNoEncontradosException("400","ERROR debe ingresar numeros positivos");
			}
		f = repository.findByNomina(empresa);
		}catch (DatosNoEncontradosException exc ) {
			throw exc;
		}catch (Exception e) {
			e.printStackTrace();
			throw new DatosNoEncontradosException("409", "Error en el servicio optener nominas");
		}
		return f;
	}
	
	public Optional<Facturas> findById(Integer id) {
		Optional<Facturas> listp = null;
		try {
			if(id <= 0 || id.equals(null)) {
				throw new DatosNoEncontradosException("400","ERROR debe ingresar numeros positivos");
			}
			listp = repository.findById(id);
		}
		catch (DatosNoEncontradosException exc ) {
			throw exc;
		}catch (Exception e) {
			e.printStackTrace();
			throw new DatosNoEncontradosException("409", "Error en el servicio buscar por ID");
		}
		return listp;
	}
}