package com.example.demo.service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.commons.AppConstans;
import com.example.demo.exceptions.DatosNoEncontradosException;
import com.example.demo.model.Empresas;
import com.example.demo.model.Facturas;
import com.example.demo.model.Pagos;
import com.example.demo.repository.ProcedimientosRepository;
@Service
public class ProcedimientoService{
	
	@Autowired
	private Environment env;
	@Autowired
	private ProcedimientosRepository repository;

	public Empresas BuscarNomina(Integer empresa) {
		Empresas f = null;
		try {
			if(empresa <= 0 || empresa.equals(null)) {
				throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_CAMPOVACIO_COD),
						env.getProperty(AppConstans.ERROR_NUMPOSITIVOS_MSG));
			}
			f = repository.findByNomina(empresa);
		}catch (DatosNoEncontradosException exc ) {
			throw exc;
		}catch (Exception e) {
			e.printStackTrace();
			throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
					env.getProperty(AppConstans.ERROR_SERVICENOMINAS_MSG));
		}
		return f;
	}
	
	
	
	public Pagos BuscarFormaPago(String pagos) {
		Pagos p = null;
		try {
			if(pagos.isEmpty() || pagos.equals(null)) {
				throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_CAMPOVACIO_COD),
						env.getProperty(AppConstans.ERROR_NUMPOSITIVOS_MSG));
			}
			p = repository.findByFormaPagos(pagos);
		}catch (DatosNoEncontradosException exc ) {
			throw exc;
		}catch (Exception e) {
			e.printStackTrace();
			throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
					env.getProperty(AppConstans.ERROR_SERVICEPAGOS_MSG));
		}
		return p;
	}
	
	
	
	public Facturas BuscarFecha(Date fecha) {
		Facturas f = null;
		try {
			if(fecha.equals(null)) {
				throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_CAMPOVACIO_COD),
						env.getProperty(AppConstans.ERROR_NUMPOSITIVOS_MSG));
			}
			f = repository.findByFechas(fecha);
		}catch (DatosNoEncontradosException exc ) {
			throw exc;
		}catch (Exception e) {
			e.printStackTrace();
			throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
					env.getProperty(AppConstans.ERROR_SERVICEFECHAS_MSG));
		}
		return f;
	}
}