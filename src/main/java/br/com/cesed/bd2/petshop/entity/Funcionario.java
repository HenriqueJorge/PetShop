package br.com.cesed.bd2.petshop.entity;

import java.sql.Date;

public class Funcionario {

	private int matricula;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private double salario;
	private Date dtNasc;
	private Date dtAdm;
	private String funcao;
	private Date dtDemi;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public Date getDtAdm() {
		return dtAdm;
	}

	public void setDtAdm(Date dtAdm) {
		this.dtAdm = dtAdm;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Date getDtDemi() {
		return dtDemi;
	}

	public void setDtDemi(Date dtDemi) {
		this.dtDemi = dtDemi;
	}

}
