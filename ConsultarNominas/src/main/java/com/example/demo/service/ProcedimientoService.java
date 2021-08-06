package com.example.demo.service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.DatosNoEncontradosException;
import com.example.demo.model.Empresas;
import com.example.demo.model.Facturas;
import com.example.demo.model.Pagos;
import com.example.demo.repository.ProcedimientosRepository;
@Service
public class ProcedimientoService{
	@Autowired
	private ProcedimientosRepository repository;

	public Empresas BuscarNomina(Integer empresa) {
		Empresas f = null;
		try {
			if(empresa <= 0 || empresa.equals(null)) {
				throw new DatosNoEncontradosException("400","ERROR debe ingresar numeros positivos");
			}
			f = repository.findByNomina(empresa);
		}catch (DatosNoEncontradosException exc ) {
			throw exc;
		}catch (Exception e) {
			e.printStackTrace();
			throw new DatosNoEncontradosException("409", "Error en el servicio optener nominas Service");
		}
		return f;
	}
	
	public Pagos BuscarFormaPago(String pagos) {
		Pagos p = null;
		try {
			if(pagos.isEmpty() || pagos.equals(null)) {
				throw new DatosNoEncontradosException("400","ERROR debe ingresar numeros positivos");
			}
			p = repository.findByFormaPagos(pagos);
		}catch (DatosNoEncontradosException exc ) {
			throw exc;
		}catch (Exception e) {
			e.printStackTrace();
			throw new DatosNoEncontradosException("409", "Error en el servicio optener nominas Service");
		}
		return p;
	}
	
	public Facturas BuscarFecha(Date fecha) {
		Facturas f = null;
		try {
			if(fecha.equals(null)) {
				throw new DatosNoEncontradosException("400","ERROR debe ingresar numeros positivos");
			}
			f = repository.findByFechas(fecha);
		}catch (DatosNoEncontradosException exc ) {
			throw exc;
		}catch (Exception e) {
			e.printStackTrace();
			throw new DatosNoEncontradosException("409", "Error en el servicio optener nominas Service");
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