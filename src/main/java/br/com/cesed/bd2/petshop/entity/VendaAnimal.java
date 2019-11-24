package br.com.cesed.bd2.petshop.entity;

public class VendaAnimal {

	private int notaFiscal;
	private int regAnimal;
	private int regFunc;
	private int dia;
	private int mes;
	private int ano;
	private double comissaoA;
	private double desconto;
	private double valorFinal;

	public int getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public int getRegAnimal() {
		return regAnimal;
	}

	public void setRegAnimal(int regAnimal) {
		this.regAnimal = regAnimal;
	}

	public int getRegFunc() {
		return regFunc;
	}

	public void setRegFunc(int regFunc) {
		this.regFunc = regFunc;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getComissaoA() {
		return comissaoA;
	}

	public void setComissaoA(double comissaoA) {
		this.comissaoA = comissaoA;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

}
