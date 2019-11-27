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

import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemFuncionarioItem;
import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemMesDescricao;
import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemTotalizacao;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.entity.Item;
import br.com.cesed.bd2.petshop.entity.VendaItem;
import br.com.cesed.bd2.petshop.service.VendaItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST VendaItem")
@Controller
@RequestMapping("/VendaItem")
public class VendaItemController {
	
	@Autowired
	private VendaItemService vendaItemService;
	
	@ApiOperation(value = "Inserir sabendo todos os dados")
	@PostMapping("/insert1")
	public ResponseEntity<VendaItem> insertVendaItem1(@RequestBody VendaItem vendaItem) throws SQLException{
		vendaItemService.insertVendaItem1(vendaItem);
		return new ResponseEntity<VendaItem>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem informar o desconto")
	@PostMapping("/insert2")
	public ResponseEntity<VendaItem> insertVendaItem2(@RequestBody VendaItem vendaItem) throws SQLException{
		vendaItemService.insertVendaItem2(vendaItem);
		return new ResponseEntity<VendaItem>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Deletar uma venda sabendo a nota fiscal")
	@DeleteMapping("/delete1")
	public ResponseEntity<VendaItem> deleteVendaItem1(@RequestBody VendaItem vendaItem) throws SQLException{
		vendaItemService.deleteVendaItem1(vendaItem);
		return new ResponseEntity<VendaItem>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar ItemCod sabendo a nota fiscal")
	@PutMapping("/update2")
	public ResponseEntity<VendaItem> updatetVendaItem2(@RequestBody VendaItem vendaItem) throws SQLException{
		vendaItemService.updateVendaItem2(vendaItem);
		return new ResponseEntity<VendaItem>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar FuncMat sabendo a nota fiscal")
	@PutMapping("/update3")
	public ResponseEntity<VendaItem> updatetVendaItem3(@RequestBody VendaItem vendaItem) throws SQLException{
		vendaItemService.updateVendaItem3(vendaItem);
		return new ResponseEntity<VendaItem>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar dia, mês e ano sabendo a nota fiscal")
	@PutMapping("/update4")
	public ResponseEntity<VendaItem> updatetVendaItem4(@RequestBody VendaItem vendaItem) throws SQLException{
		vendaItemService.updateVendaItem4(vendaItem);
		return new ResponseEntity<VendaItem>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar desconto(Usando nota fiscal")
	@PutMapping("/update5")
	public ResponseEntity<VendaItem> updatetVendaItem5(@RequestBody VendaItem vendaItem) throws SQLException{
		vendaItemService.updateVendaItem5(vendaItem);
		return new ResponseEntity<VendaItem>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Mostrar todas as vendas de itens")
	@GetMapping("/getTodos")
	public ResponseEntity<List<VendaItem>> getTodos() throws SQLException{
		return new ResponseEntity<List<VendaItem>>(vendaItemService.todos(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar as vendas de um item sabendo a descrição do item")
	@GetMapping("/getVendaItemDescricao/{descricao}")
	public ResponseEntity<List<VendaItem>> getVendaItemDescricao(@PathVariable(name = "descricao") String descricao) throws SQLException{
		Item item = new Item();
		item.setDescricao(descricao);
		return new ResponseEntity<List<VendaItem>>(vendaItemService.getVendaItemDescricao(item),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar as vendas de itens sabendo o nome do vendedor")
	@GetMapping("/getVendaItemFuncionario/{nome}")
	public ResponseEntity<List<VendaItem>> getVendaItemFuncionario(@PathVariable(name = "nome") String nome) throws SQLException{
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		return new ResponseEntity<List<VendaItem>>(vendaItemService.getVendaItemFuncionario(funcionario),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar as vendas de um item num mês e ano , sabendo a descrição do item")
	@GetMapping("/getVendaItemMesDescricao/{descricao}/{mes}/{ano}")
	public ResponseEntity<List<VendaItem>> getVendaItemMesDescricao(@PathVariable(name = "descricao") String descricao,@PathVariable(name = "mes") int mes,@PathVariable(name = "ano") int ano) throws SQLException{
		VendaItemMesDescricao vendaItemMesDescricao = new VendaItemMesDescricao();
		vendaItemMesDescricao.setDescricao(descricao);
		vendaItemMesDescricao.setMes(mes);
		vendaItemMesDescricao.setAno(ano);
		return new ResponseEntity<List<VendaItem>>(vendaItemService.getVendaItemMesDescricao(vendaItemMesDescricao),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar todas as vendas feitas pelo funcionário daquele item")
	@GetMapping("/getVendaItemFuncionarioItem/{matricula}/{codigo}")
	public ResponseEntity<List<VendaItem>> getVendaItemFuncionarioItem(@PathVariable(name = "matricula") int matricula,@PathVariable(name = "codigo") int codigo) throws SQLException{
		VendaItemFuncionarioItem vendaItemFuncionarioItem = new VendaItemFuncionarioItem();
		vendaItemFuncionarioItem.setMatricula(matricula);
		vendaItemFuncionarioItem.setCodigo(codigo);
		return new ResponseEntity<List<VendaItem>>(vendaItemService.getVendaItemFuncionarioItem(vendaItemFuncionarioItem),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Totalizar para cada vendedor")
	@GetMapping("/getVendaItemFaturamento")
	public ResponseEntity<List<VendaItemTotalizacao>> getVendaItemFaturamento() throws SQLException{
		return new ResponseEntity<List<VendaItemTotalizacao>>(vendaItemService.getVendaItemFaturamento(),HttpStatus.OK);
	}


}
