package com.SpringEventoApp.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable{

	private static final int serialVersionUID = 1;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = (int) codigo;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int codigo;
	private String nome;
	private String local;
	private String data;
	private String horario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
