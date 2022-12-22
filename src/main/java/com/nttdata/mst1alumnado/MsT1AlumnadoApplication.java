package com.nttdata.mst1alumnado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.mst1alumnado.persistence.Alumnado;

@SpringBootApplication
public class MsT1AlumnadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsT1AlumnadoApplication.class, args);
		
		Alumnado alumnado1 = new Alumnado(); 
	}

}
