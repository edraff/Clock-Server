package br.com.bankteste.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="relogio")
public class Relogio {
	
	@EmbeddedId
	public RelogioPK identificador;
	@Column(name="angulo")
	public int angulo;
	
	public RelogioPK getIdentificador() {
		return identificador;
	}
	public void setIdentificador(RelogioPK identificador) {
		this.identificador = identificador;
	}
	public int getAngulo() {
		return angulo;
	}
	public void setAngulo(int angulo) {
		this.angulo = angulo;
	}
}
