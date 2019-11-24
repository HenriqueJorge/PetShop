package br.com.cesed.bd2.petshop.entity;

public class VendaItem {

	private int ntFiscal;
	private int itemCod;
	private int funcMat;
	private int dia;
	private int mes;
	private int ano;
	private double comissaoI;
	private double desconto;
	private double valorF;

	public int getNtFiscal() {
		return ntFiscal;
	}

	public void setNtFiscal(int ntFiscal) {
		this.ntFiscal = ntFiscal;
	}

	public int getItemCod() {
		return itemCod;
	}

	public void setItemCod(int itemCod) {
		this.itemCod = itemCod;
	}

	public int getFuncMat() {
		return funcMat;
	}

	public void setFuncMat(int funcMat) {
		this.funcMat = funcMat;
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

	public double getComissaoI() {
		return comissaoI;
	}

	public void setComissaoI(double comissaoI) {
		this.comissaoI = comissaoI;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValorF() {
		return valorF;
	}

	public void setValorF(double valorF) {
		this.valorF = valorF;
	}

}
