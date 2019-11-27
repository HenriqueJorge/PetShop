package br.com.cesed.bd2.petshop.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoMes;
import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoObje;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.repository.DAO.FuncionarioDAO;

@Service
public class FuncionarioService {

	private FuncionarioDAO fdao = new FuncionarioDAO();

	public void insertFuncionario1(Funcionario f) throws SQLException {
		fdao.insertFuncionario1(f);
	}

	public void insertFuncionario2(Funcionario f) throws SQLException {
		fdao.insertFuncionario2(f);
	}

	public void insertFuncionario3(Funcionario f) throws SQLException {
		fdao.insertFuncionario3(f);
	}

	public void updateFuncionario1(Funcionario f) throws SQLException {
		fdao.updateFuncionario1(f);
	}

	public void updateFuncionario2(Funcionario f) throws SQLException {
		fdao.updateFuncionario2(f);
	}

	public void updateFuncionario3(Funcionario f) throws SQLException {
		fdao.updateFuncionario3(f);
	}

	public void updateFuncionario4(Funcionario f) throws SQLException {
		fdao.updateFuncionario4(f);
	}

	public void updateFuncionario5(Funcionario f) throws SQLException {
		fdao.updateFuncionario5(f);
	}
	
	public void deleteFuncionario(Funcionario f) throws SQLException {
		fdao.deleteFuncionario1(f);
	}
	
	public List<Funcionario> todos() throws SQLException{
		return fdao.todos();
	}
	
	public List<Funcionario> todosFuncionarioNome(Funcionario ff) throws SQLException{
		return fdao.todosFuncionarioNome(ff);
	}
	
	public List<FuncionarioComissaoMes> funcionarioComissaoMes(FuncionarioComissaoObje fco) throws SQLException{
		return fdao.funcionarioComissaoMes(fco);
	}
	
	public List<FuncionarioComissaoMes> allFuncionariosComissoesMes(FuncionarioComissaoObje fco) throws SQLException{
		return fdao.funcionariosComissoesMes(fco);
	}

}
