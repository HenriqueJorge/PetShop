package br.com.cesed.bd2.petshop.entity;

import java.sql.Date;

public class Item {

	private int codigo;
	private String descricao;
	private String tipo;
	private double precoFornecedor;
	private double precoLoja;
	private Date validade;
	private int quantidade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecoFornecedor() {
		return precoFornecedor;
	}

	public void setPrecoFornecedor(double precoFornecedor) {
		this.precoFornecedor = precoFornecedor;
	}

	public double getPrecoLoja() {
		return precoLoja;
	}

	public void setPrecoLoja(double precoLoja) {
		this.precoLoja = precoLoja;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
