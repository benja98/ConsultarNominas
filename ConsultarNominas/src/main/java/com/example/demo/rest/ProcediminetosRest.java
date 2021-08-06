package com.example.demo.rest;
import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.commons.AppConstans;
import com.example.demo.exceptions.DatosNoEncontradosException;
import com.example.demo.exceptions.ResponseEntityExceptions;
import com.example.demo.model.Empresas;
import com.example.demo.model.Facturas;
import com.example.demo.model.Pagos;
import com.example.demo.service.ProcedimientoService;

@RestController
@RequestMapping ("/finanzas")																	
public class ProcediminetosRest{
	
	@Autowired
	private Environment env;
	@Autowired																					
	ResponseEntityExceptions responseExceptions;
	@Autowired
	ProcedimientoService service;

	
	@GetMapping(value = "/nomina")
    public ResponseEntity<?> buscarnomina(@RequestParam Integer empresa){

       ResponseEntity<?> respuesta = null;
       try {
    	   Empresas f= service.BuscarNomina(empresa);
           if(f==null) {
        	   throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
   					env.getProperty(AppConstans.ERROR_NODATOS_MSG));
           }
            respuesta = responseExceptions.createOkResponse(null, "0", "ok");
      }catch(DatosNoEncontradosException a) {
           respuesta = responseExceptions.createFailResponse(null, a.getCod(), a.getMessage());
            throw a; 
       }catch(Exception exc) {
           respuesta = responseExceptions.createFailResponse(null, "409","error al buscar nomina");
       }
       return ResponseEntity.ok(service.BuscarNomina(empresa));
   }
	
	
	
	@GetMapping(value = "/pagos")
    public ResponseEntity<?> buscarnomina(@RequestParam String pagos){
       ResponseEntity<?> respuesta = null;
       try {
    	   Pagos p= service.BuscarFormaPago(pagos);
           if(p==null) {
        	   throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
      					env.getProperty(AppConstans.ERROR_NODATOS_MSG));
           }
            respuesta = responseExceptions.createOkResponse(null, "0", "ok");

      }catch(DatosNoEncontradosException a) {
           respuesta = responseExceptions.createFailResponse(null, a.getCod(), a.getMessage());
            throw a;   
       }catch(Exception exc) {
           respuesta = responseExceptions.createFailResponse(null, "409","error al buscar nomina");
       }
       return ResponseEntity.ok(service.BuscarFormaPago(pagos));
   }
	
	
	
	@GetMapping(value = "/fecha")
    public ResponseEntity<?> buscarFecha(@RequestParam Date fecha){
       ResponseEntity<?> respuesta = null;
       try {
    	   Facturas f= service.BuscarFecha(fecha);
           if(f==null) {
        	   throw new DatosNoEncontradosException(env.getProperty(AppConstans.ERROR_SERVICIOSAVE_COD),
      					env.getProperty(AppConstans.ERROR_NODATOS_MSG));
           }
            respuesta = responseExceptions.createOkResponse(null, "0", "ok");

      }catch(DatosNoEncontradosException a) {
           respuesta = responseExceptions.createFailResponse(null, a.getCod(), a.getMessage());
            throw a;   
       }catch(Exception exc) {
           respuesta = responseExceptions.createFailResponse(null, "409","error al buscar nomina");
       }
       return ResponseEntity.ok(service.BuscarFecha(fecha));
   }	
}