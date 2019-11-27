package br.com.cesed.bd2.petshop.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoMes;
import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoObje;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.service.FuncionarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Funcionario")
@Controller
@RequestMapping("/Funcionario")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@ApiOperation(value = "Inserir informando todos os dados")
	@PostMapping("/insert1")
	public ResponseEntity<Funcionario> insertFuncionario1(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.insertFuncionario1(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Inserir sem informar o salário")
	@PostMapping("/insert2")
	public ResponseEntity<Funcionario> insertFuncionario2(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.insertFuncionario2(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Inserir sem informar o telefone")
	@PostMapping("/insert3")
	public ResponseEntity<Funcionario> insertFuncionario3(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.insertFuncionario3(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Alterar o nome sabendo a matrícula")
	@PutMapping("/update1")
	public ResponseEntity<Funcionario> updateFuncionario1(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.updateFuncionario1(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.OK);
	}

	@ApiOperation(value = "Alterar o nome sabendo o CPF")
	@PutMapping("/update2")
	public ResponseEntity<Funcionario> updateFuncionario2(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.updateFuncionario2(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.OK);
	}

	@ApiOperation(value = "Alterar o endereço sabendo a matrícula")
	@PutMapping("/update3")
	public ResponseEntity<Funcionario> updateFuncionario3(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.updateFuncionario3(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.OK);
	}

	@ApiOperation(value = "Alterar a função sabendo  a matrícula")
	@PutMapping("/update4")
	public ResponseEntity<Funcionario> updateFuncionario4(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.updateFuncionario4(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.OK);
	}

	@ApiOperation(value = "Alterar data de demissão sabendo a matrícula")
	@PutMapping("/update5")
	public ResponseEntity<Funcionario> updateFuncionario5(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.updateFuncionario5(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.OK);
	}

	@ApiOperation(value = "Deletar um funcionário sabendo a matrícula")
	@DeleteMapping("/delete1")
	public ResponseEntity<Funcionario> deleteFuncionario1(@RequestBody Funcionario funcionario) throws SQLException {
		funcionarioService.deleteFuncionario(funcionario);
		return new ResponseEntity<Funcionario>(HttpStatus.OK);
	}

	@ApiOperation(value = "Mostrar todos os registros")
	@GetMapping("/getTodosFuncionario")
	public ResponseEntity<List<Funcionario>> getTodosFuncionario() throws SQLException {
		return new ResponseEntity<List<Funcionario>>(funcionarioService.todos(), HttpStatus.OK);
	}

	@ApiOperation(value = "Mostrar os dados recebendo o nome")
	@GetMapping("/getTodosFuncionarioNome/{nome}")
	public ResponseEntity<List<Funcionario>> getTodosFuncionarioNome(@PathVariable(name = "nome") String nome)
			throws SQLException {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		return new ResponseEntity<List<Funcionario>>(funcionarioService.todosFuncionarioNome(funcionario),
				HttpStatus.OK);
	}

	@ApiOperation(value = "Traz a comissao gerada pelo funcionario em um mes")
	@GetMapping("/getFuncionarioComissaoMes/{matricula}/{mes}/{ano}")
	public ResponseEntity<List<FuncionarioComissaoMes>> getFuncionarioComissaoMes(
			@PathVariable(name = "matricula") int matricula, @PathVariable(name = "mes") int mes,
			@PathVariable(name = "ano") int ano) throws SQLException {
		FuncionarioComissaoObje funcionarioComissaoObje = new FuncionarioComissaoObje();
		funcionarioComissaoObje.setMatricula(matricula);
		funcionarioComissaoObje.setMes(mes);
		funcionarioComissaoObje.setAno(ano);
		return new ResponseEntity<List<FuncionarioComissaoMes>>(
				funcionarioService.funcionarioComissaoMes(funcionarioComissaoObje), HttpStatus.OK);
	}

	@ApiOperation(value = "Traz a comissao gerada pelos funcionarios em um mes")
	@GetMapping("/getFuncionariosComissaoMes/{mes}/{ano}")
	public ResponseEntity<List<FuncionarioComissaoMes>> getFuncionariosComissaoMes(
			@PathVariable(name = "mes") int mes,
			@PathVariable(name = "ano") int ano) throws SQLException {
		FuncionarioComissaoObje funcionarioComissaoObje = new FuncionarioComissaoObje();
		funcionarioComissaoObje.setMes(mes);
		funcionarioComissaoObje.setAno(ano);
		return new ResponseEntity<List<FuncionarioComissaoMes>>(
				funcionarioService.allFuncionariosComissoesMes(funcionarioComissaoObje), HttpStatus.OK);
	}

}
