package com.lucascunha.dev.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Poi implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private Integer coordenada_x;
	private Integer coordenada_y;
	
	public Poi() {
	}

	public Poi(Integer id, String nome, Integer coordenada_x, Integer coordenada_y) {
		super();
		this.id = id;
		this.nome = nome;
		this.coordenada_x=coordenada_x;
		this.coordenada_y=coordenada_y;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCoordenada_x() {
		return coordenada_x;
	}
	public void setCoordenada_x(Integer coordenada_x) {
		this.coordenada_x = coordenada_x;
	}
	public Integer getCoordenada_y() {
		return coordenada_y;
	}
	public void setCoordenada_y(Integer coordenada_y) {
		this.coordenada_y = coordenada_y;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
