package br.com.cesed.bd2.petshop.repository.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoMes;
import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoObje;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.repository.Conexao;

public class FuncionarioDAO {
	
	private Connection con;
	
	public FuncionarioDAO() throws ClassNotFoundException, SQLException {
		con = Conexao.criarConecao();
	}
	
	public void insertFuncionario1(Funcionario f) throws SQLException {
		String sql = "insert into funcionario(nome,cpf,endereco,telefone,salario,dtnasc,dtadm,funcao) "
				+ "values(?,?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getNome());
		preparador.setString(2, f.getCpf());
		preparador.setString(3, f.getEndereco());
		preparador.setString(4, f.getTelefone());
		preparador.setDouble(5, f.getSalario());
		preparador.setDate(6, f.getDtNasc());
		preparador.setDate(7, f.getDtAdm());
		preparador.setString(8, f.getFuncao());
		preparador.execute();
		preparador.close();
	}
	
	public void insertFuncionario2(Funcionario f) throws SQLException {
		String sql = "insert into funcionario(nome,cpf,endereco,telefone,dtnasc,dtadm,funcao) "
				+ "values(?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getNome());
		preparador.setString(2, f.getCpf());
		preparador.setString(3, f.getEndereco());
		preparador.setString(4, f.getTelefone());
		preparador.setDate(5, f.getDtNasc());
		preparador.setDate(6, f.getDtAdm());
		preparador.setString(7, f.getFuncao());
		preparador.execute();
		preparador.close();
	}
	
	public void insertFuncionario3(Funcionario f) throws SQLException {
		String sql = "insert into funcionario(nome,cpf,endereco,salario,dtnasc,dtadm,funcao) "
				+ "values(?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getNome());
		preparador.setString(2, f.getCpf());
		preparador.setString(3, f.getEndereco());
		preparador.setDouble(4, f.getSalario());
		preparador.setDate(5, f.getDtNasc());
		preparador.setDate(6, f.getDtAdm());
		preparador.setString(7, f.getFuncao());
		preparador.execute();
		preparador.close();
		
	}
	
	public void updateFuncionario1(Funcionario f) throws SQLException {
		String sql = "update funcionario set nome = ? where matricula = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getNome());
		preparador.setInt(2, f.getMatricula());
		preparador.execute();
		preparador.close();
	}
	
	public void updateFuncionario2(Funcionario f) throws SQLException {
		String sql = "update funcionario set nome = ? where cpf = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getNome());
		preparador.setString(2, f.getCpf());
		preparador.execute();
		preparador.close();
	}
	
	public void updateFuncionario3(Funcionario f) throws SQLException {
		String sql = "update funcionario set endereco = ? where matricula = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getEndereco());
		preparador.setInt(2, f.getMatricula());
		preparador.execute();
		preparador.close();
	}
	
	public void updateFuncionario4(Funcionario f) throws SQLException {
		String sql = "update funcionario set funcao = ? where matricula = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getFuncao());
		preparador.setInt(2, f.getMatricula());
		preparador.execute();
		preparador.close();
	}
	
	public void updateFuncionario5(Funcionario f) throws SQLException {
		String sql = "update funcionario set dtDemi = ? where matricula = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDate(1, f.getDtDemi());
		preparador.setInt(2, f.getMatricula());
		preparador.execute();
		preparador.close();
	}
	
	public void deleteFuncionario1(Funcionario f) throws SQLException {
		String sql = "delete from funcionario where matricula = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, f.getMatricula());
		preparador.execute();
		preparador.close();
	}
	
	public List<Funcionario> todos() throws SQLException {
		String sql = "select matricula,nome,cpf,endereco,telefone,salario,dtnasc,dtadm,funcao,dtdemi from funcionario";
		PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet r = preparador.executeQuery();
		ArrayList<Funcionario> fl = new ArrayList<Funcionario>();
		while(r.next()) {
			Funcionario f = new Funcionario();
			f.setMatricula(r.getInt("matricula"));
			f.setNome(r.getString("nome"));
			f.setCpf(r.getString("cpf"));
			f.setEndereco(r.getString("endereco"));
			f.setTelefone(r.getString("telefone"));
			f.setSalario(r.getDouble("salario"));
			f.setDtNasc(r.getDate("dtnasc"));
			f.setDtAdm(r.getDate("dtadm"));
			f.setFuncao(r.getString("funcao"));
			f.setDtDemi(r.getDate("dtdemi"));
			fl.add(f);
		}
		return fl;
	}
	
	public List<Funcionario> todosFuncionarioNome(Funcionario ff) throws SQLException {
		String sql = "select matricula,nome,cpf,endereco,telefone,salario,dtnasc,dtadm,funcao,dtdemi from funcionario where nome = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, ff.getNome());
		ResultSet r = preparador.executeQuery();
		ArrayList<Funcionario> fl = new ArrayList<Funcionario>();
		while(r.next()) {
			Funcionario f = new Funcionario();
			f.setMatricula(r.getInt("matricula"));
			f.setNome(r.getString("nome"));
			f.setCpf(r.getString("cpf"));
			f.setEndereco(r.getString("endereco"));
			f.setTelefone(r.getString("telefone"));
			f.setSalario(r.getDouble("salario"));
			f.setDtNasc(r.getDate("dtnasc"));
			f.setDtAdm(r.getDate("dtadm"));
			f.setFuncao(r.getString("funcao"));
			f.setDtDemi(r.getDate("dtdemi"));
			fl.add(f);
		}
		return fl;
	}
	
	public List<FuncionarioComissaoMes> funcionarioComissaoMes(FuncionarioComissaoObje fco) throws SQLException{
		String sql = "select matricula,nome,funcionarioComi(matricula,?,?) as salario from funcionario where matricula = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, fco.getMes());
		preparador.setInt(2, fco.getAno());
		preparador.setInt(3, fco.getMatricula());
		ResultSet r = preparador.executeQuery();
		ArrayList<FuncionarioComissaoMes> fcl = new ArrayList<FuncionarioComissaoMes>();
		while(r.next()) {
			FuncionarioComissaoMes fcm = new FuncionarioComissaoMes();
			fcm.setMatricula(r.getInt("matricula"));
			fcm.setNome(r.getString("nome"));
			fcm.setSalario(r.getDouble("salario"));
			fcl.add(fcm);
		}
		return fcl;
	}
	
	public List<FuncionarioComissaoMes> funcionariosComissoesMes(FuncionarioComissaoObje fco) throws SQLException{
		String sql = "select matricula,nome,funcionarioComi(matricula,?,?) as salario from funcionario";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, fco.getMes());
		preparador.setInt(2, fco.getAno());
		ResultSet r = preparador.executeQuery();
		ArrayList<FuncionarioComissaoMes> fcl = new ArrayList<FuncionarioComissaoMes>();
		while(r.next()) {
			FuncionarioComissaoMes fcm = new FuncionarioComissaoMes();
			fcm.setMatricula(r.getInt("matricula"));
			fcm.setNome(r.getString("nome"));
			fcm.setSalario(r.getDouble("salario"));
			fcl.add(fcm);
		}
		return fcl;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
