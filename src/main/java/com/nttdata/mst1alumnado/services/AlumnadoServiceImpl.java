package com.nttdata.mst1alumnado.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nttdata.mst1alumnado.persistence.Alumnado;

/**
 * 
 * @author Alexandra Rodríguez
 */
@Service
public class AlumnadoServiceImpl implements AlumnadoServiceI{
	
@Value	
private String applicationName;

@Value
private String port;

public Alumnado getStudentsInfo() {
	final Alumnado resultado = new Alumnado;
	
	resultDto.setStudentsInfo(applicatioName);
	resultDto.setPor(port);
	
	return null;
}

	

}
