package com.nttdata.mst1alumnado.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.mst1alumnado.persistence.Alumnado;
import com.nttdata.mst1alumnado.services.AlumnadoServiceI;

/**
 * 
 * @author Alexandra Rodríguez
 *
 */
@RestController("getStudentsInfo")
public class AlumnadoController {
	
	private AlumnadoServiceI alumnadoService;
	
	@Autowired()
	public Alumnado sendAppDataInfo() {
		
		// Llamamos al servicio
		return alumnadoService.getStudentsInfo();
	}
	

}
