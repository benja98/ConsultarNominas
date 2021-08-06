package com.example.demo.repo;

import java.sql.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.demo.commons.AppConstans;
import com.example.demo.exceptions.DatosNoEncontradosException;
import com.example.demo.model.Empresas;
import com.example.demo.model.Facturas;
import com.example.demo.model.Pagos;
import com.example.demo.repository.ProcedimientosRepository;

@Component
public class ProcedimientosRepo {
	
	@Autowired
	private Environment env;
	@Autowired
	private ProcedimientosRepository repository;
	
	
	
	public Empresas BuscarNomina(Integer empresa){
		Empresas emp = null;
		try {
			emp = repository.findByNomina(empresa);
			 if(emp==null) {
				 throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_CAMPOVACIO_COD),
		   					env.getProperty(AppConstans.ERROR_NODATOS_REPO_MSG));
			 }
		}catch (Exception e) {
			throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
   					env.getProperty(AppConstans.ERROR_BUSCARNOMINAREPO_MSG));
		}
		return emp;
	}
	
	
	
	public Pagos BuscarFormaPagos(String pagos){
		Pagos p = null;
		try {
			 p = repository.findByFormaPagos(pagos);
			 if(p==null) {
				 throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_CAMPOVACIO_COD),
		   					env.getProperty(AppConstans.ERROR_NODATOS_REPO_MSG));
			 }
		}catch (Exception e) {
			throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
   					env.getProperty(AppConstans.ERROR_BUSCARPAGOSREPO_MSG));
		}
		return p;
	}
	
	
	
	public Facturas buscarFecha(Date fecha){
		Facturas f = null;
		try {
			 f = repository.findByFechas(fecha);
			 if(f==null) {
				 throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_CAMPOVACIO_COD),
		   					env.getProperty(AppConstans.ERROR_NODATOS_REPO_MSG));
			 }
		}catch (Exception e) {
			throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
   					env.getProperty(AppConstans.ERROR_BUSCARFECHASREPO_MSG));
		}
		return f;
	}
}
