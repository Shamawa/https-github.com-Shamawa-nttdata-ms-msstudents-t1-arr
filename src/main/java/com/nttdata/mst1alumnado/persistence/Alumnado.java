package com.nttdata.mst1alumnado.persistence;

/**
 * 
 * @author Alexandra Rodríguez
 *
 */

public class Alumnado {

	private String alumnadoName;

	private String port;

	public String getAlumnadoName() {
		return alumnadoName;
	}

	public void setAlumnadoName(String alumnadoName) {
		this.alumnadoName = alumnadoName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Alumnado [alumnadoName=" + alumnadoName + ", port=" + port + "]";
	}

	public Alumnado(String alumnadoName, String port) {
		super();
		this.alumnadoName = alumnadoName;
		this.port = port;
	}
	
	

}
