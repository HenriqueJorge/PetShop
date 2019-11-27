package br.com.cesed.bd2.petshop.entity;

import java.text.ParseException;

public class Animal {

	private int registro;
	private String tipo ;
	private double peso ;
	private double altura ;
	private String dtUltMed ;
	private String raca ;
	private double precocompra;
	private double precoVenda;
	private String dtNasc;

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDtUltMed() {
		return dtUltMed;
	}

	public void setDtUltMed(String dtUltMed) {
		this.dtUltMed = dtUltMed;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getPrecocompra() {
		return precocompra;
	}

	public void setPrecocompra(double precocompra) {
		this.precocompra = precocompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getDtNasc() throws ParseException {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

}
