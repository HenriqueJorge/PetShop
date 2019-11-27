package br.com.cesed.bd2.petshop.entity;

public class Funcionario {

	private int matricula;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private double salario;
	private String dtNasc;
	private String dtAdm;
	private String funcao;
	private String dtDemi;

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

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getDtAdm() {
		return dtAdm;
	}

	public void setDtAdm(String dtAdm) {
		this.dtAdm = dtAdm;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getDtDemi() {
		return dtDemi;
	}

	public void setDtDemi(String dtDemi) {
		this.dtDemi = dtDemi;
	}

}
