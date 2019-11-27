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

import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoObje;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalFaturamento;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalFuncAnimal;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalRelatorioFuncionario;
import br.com.cesed.bd2.petshop.entity.Animal;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.entity.VendaAnimal;
import br.com.cesed.bd2.petshop.service.VendaAnimalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST VendaAnimal")
@Controller
@RequestMapping("/VendaAnimal")
public class VendaAnimalController {
	
	@Autowired
	private VendaAnimalService vendaAnimalService;

	@ApiOperation(value = "Inserir sabendo todos os dados")
	@PostMapping("/insert1")
	public ResponseEntity<VendaAnimal> insertVendaAnimal1(@RequestBody VendaAnimal VendaAnimal) throws SQLException{
		vendaAnimalService.insertVendaAnimal1(VendaAnimal);
		return new ResponseEntity<VendaAnimal>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o desconto")
	@PostMapping("/insert2")
	public ResponseEntity<VendaAnimal> insertVendaAnimal2(@RequestBody VendaAnimal VendaAnimal) throws SQLException{
		vendaAnimalService.insertVendaAnimal2(VendaAnimal);
		return new ResponseEntity<VendaAnimal>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Deletar uma venda sabendo a nota fiscal")
	@DeleteMapping("/delete1")
	public ResponseEntity<VendaAnimal> deleteVendaAnimal1(@RequestBody VendaAnimal vendaAnimal) throws SQLException{
		vendaAnimalService.deleteVendaAnimal1(vendaAnimal);
		return new ResponseEntity<VendaAnimal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar RegAnimal sabendo a nota fiscal")
	@PutMapping("/update2")
	public ResponseEntity<VendaAnimal> updateVendaAnimal2(@RequestBody VendaAnimal vendaAnimal) throws SQLException{
		vendaAnimalService.updateVendaAnimal2(vendaAnimal);
		return new ResponseEntity<VendaAnimal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar MatFunc sabendo a nota fiscal")
	@PutMapping("/update3")
	public ResponseEntity<VendaAnimal> updateVendaAnimal3(@RequestBody VendaAnimal vendaAnimal) throws SQLException{
		vendaAnimalService.updateVendaAnimal3(vendaAnimal);
		return new ResponseEntity<VendaAnimal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar dia, mês e ano sabendo a nota fiscal")
	@PutMapping("/update4")
	public ResponseEntity<VendaAnimal> updateVendaAnimal4(@RequestBody VendaAnimal vendaAnimal) throws SQLException{
		vendaAnimalService.updateVendaAnimal4(vendaAnimal);
		return new ResponseEntity<VendaAnimal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar desconto(Usando notaFiscal)")
	@PutMapping("/update5")
	public ResponseEntity<VendaAnimal> updateVendaAnimal5(@RequestBody VendaAnimal vendaAnimal) throws SQLException{
		vendaAnimalService.updateVendaAnimal5(vendaAnimal);
		return new ResponseEntity<VendaAnimal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Traz todas as vendas de animais")
	@GetMapping("/getTodos")
	public ResponseEntity<List<VendaAnimal>> getTodos() throws SQLException{
		return new ResponseEntity<List<VendaAnimal>>(vendaAnimalService.todos(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar as vendas de um animal sabendo o tipo do animal")
	@GetMapping("/getVendaAnimalTipo/{tipo}")
	public ResponseEntity<List<VendaAnimal>> getVendaAnimalTipo(@PathVariable(name = "tipo") String tipo) throws SQLException{
		Animal animal = new Animal();
		animal.setTipo(tipo);
		return new ResponseEntity<List<VendaAnimal>>(vendaAnimalService.todasVendaAnimalTipo(animal),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar as vendas de animais sabendo o nome do vendedor")
	@GetMapping("/getVendaAnimalNome/{nome}")
	public ResponseEntity<List<VendaAnimal>> getVendaAnimalNome(@PathVariable(name = "nome") String nome) throws SQLException{
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		return new ResponseEntity<List<VendaAnimal>>(vendaAnimalService.todasVendaAnimalNome(funcionario),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar as vendas de um animal num mês e ano, sabendo o tipo do animal")
	@GetMapping("/gettodasVendaAnimalTipoMes/{tipo}/{mes}/{ano}")
	public ResponseEntity<List<VendaAnimal>> getTodasVendaAnimalTipoMes(@PathVariable(name = "tipo") String tipo,
			@PathVariable(name = "mes") int mes,@PathVariable(name = "ano") int ano) throws SQLException{
		VendaAnimalRelatorioFuncionario vendaAnimalRelatorioFuncionario = new VendaAnimalRelatorioFuncionario();
		vendaAnimalRelatorioFuncionario.setTipo(tipo);
		vendaAnimalRelatorioFuncionario.setMes(mes);
		vendaAnimalRelatorioFuncionario.setAno(ano);
		return new ResponseEntity<List<VendaAnimal>>(vendaAnimalService.todasVendaAnimalTipoMes(vendaAnimalRelatorioFuncionario),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todas as vendas feitas pelo funcionário daquele animal")
	@GetMapping("/getVendaPorFunc/{matricula}/{tipo}")
	public ResponseEntity<List<VendaAnimal>> getVendaPorFunc(@PathVariable(name = "matricula") int matricula,@PathVariable(name = "tipo") String tipo) throws SQLException{
		VendaAnimalFuncAnimal vendaAnimalFuncAnimal = new VendaAnimalFuncAnimal();
		vendaAnimalFuncAnimal.setMatricula(matricula);
		vendaAnimalFuncAnimal.setTipo(tipo);
		return new ResponseEntity<List<VendaAnimal>>(vendaAnimalService.getVendaPorFunc(vendaAnimalFuncAnimal),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Totalizar para cada funcionário")
	@GetMapping("/getFaturamento")
	public ResponseEntity<List<VendaAnimalFaturamento>> getFaturamento() throws SQLException{
		return new ResponseEntity<List<VendaAnimalFaturamento>>(vendaAnimalService.getFaturamento(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Totalizar para um funcionario especifico")
	@GetMapping("/getFaturamentoFunc/{matricula}/{mes}/{ano}")
	public ResponseEntity<List<VendaAnimalFaturamento>> getFaturamentoFunc(@PathVariable(name = "matricula") int matricula,@PathVariable(name = "mes") int mes,@PathVariable(name = "ano") int ano) throws SQLException{
		FuncionarioComissaoObje funcionarioComissaoObje = new FuncionarioComissaoObje();
		funcionarioComissaoObje.setMatricula(matricula);
		funcionarioComissaoObje.setMes(mes);
		funcionarioComissaoObje.setAno(ano);
		return new ResponseEntity<List<VendaAnimalFaturamento>>(vendaAnimalService.getFaturamentoFunc(funcionarioComissaoObje),HttpStatus.OK);
	}
	
	
}
