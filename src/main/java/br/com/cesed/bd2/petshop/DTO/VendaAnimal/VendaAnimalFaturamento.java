package br.com.cesed.bd2.petshop.DTO.VendaAnimal;

public class VendaAnimalFaturamento {

	private int reganimal;
	private String tipo;
	private int matfunc;
	private int quantidade;
	private double faturamento;

	public int getReganimal() {
		return reganimal;
	}

	public void setReganimal(int reganimal) {
		this.reganimal = reganimal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getMatfunc() {
		return matfunc;
	}

	public void setMatfunc(int matfunc) {
		this.matfunc = matfunc;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}

}
