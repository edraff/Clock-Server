package br.com.bankteste.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RelogioPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int horas;
	public int minutos;
	
	public RelogioPK() {
		super();
	}

	public RelogioPK(int horas, int minutos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	
}
