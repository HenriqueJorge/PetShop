package br.com.cesed.bd2.petshop.DTO.Animal;

public class AnimalTotalizacao {
	
	private String tipo;
	private int quantidade;
	private double maxpreco;
	private double minpreco;
	
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
	public double getMaxpreco() {
		return maxpreco;
	}
	public void setMaxpreco(double maxpreco) {
		this.maxpreco = maxpreco;
	}
	public double getMinpreco() {
		return minpreco;
	}
	public void setMinpreco(double minpreco) {
		this.minpreco = minpreco;
	}
	
	

}
