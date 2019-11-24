package br.com.cesed.bd2.petshop.DTO.VendaItem;

public class VendaItemTotalizacao {

	private int funcMat;
	private String tipo;
	private int quantidade;
	private double faturamento;

	public int getFuncMat() {
		return funcMat;
	}

	public void setFuncMat(int funcMat) {
		this.funcMat = funcMat;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
