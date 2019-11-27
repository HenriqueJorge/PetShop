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

import br.com.cesed.bd2.petshop.DTO.Item.ItemLucro;
import br.com.cesed.bd2.petshop.entity.Item;
import br.com.cesed.bd2.petshop.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Item")
@Controller
@RequestMapping("/Item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@ApiOperation(value = "Inserir um item sabendo todos os campos")
	@PostMapping("/insert1")
	public ResponseEntity<Item> insertItem1(@RequestBody Item item) throws SQLException{
		itemService.insertItem1(item);
		return new ResponseEntity<Item>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir item sem validade")
	@PostMapping("/insert2")
	public ResponseEntity<Item> insertItem2(@RequestBody Item item) throws SQLException{
		itemService.insertItem2(item);
		return new ResponseEntity<Item>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir item sem PreçoLoja")
	@PostMapping("/insert3")
	public ResponseEntity<Item> insertItem3(@RequestBody Item item) throws SQLException{
		itemService.insertItem3(item);
		return new ResponseEntity<Item>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Deletar item sabendo o código")
	@DeleteMapping("/delete1")
	public ResponseEntity<Item> deleteItem1(@RequestBody Item item) throws SQLException{
		itemService.deleteItem1(item);
		return new ResponseEntity<Item>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar PreçoFornecedor sabendo o código")
	@PutMapping("/update1")
	public ResponseEntity<Item> updateItem1(@RequestBody Item item) throws SQLException{
		itemService.updateItem1(item);
		return new ResponseEntity<Item>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar PreçoLoja sabendo o código")
	@PutMapping("/update2")
	public ResponseEntity<Item> updateItem2(@RequestBody Item item) throws SQLException{
		itemService.updateItem2(item);
		return new ResponseEntity<Item>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar PreçoFornecedor e PreçoLoja sabendo o código")
	@PutMapping("/update3")
	public ResponseEntity<Item> updateItem3(@RequestBody Item item) throws SQLException{
		itemService.updateItem3(item);
		return new ResponseEntity<Item>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar descrição e tipo, sabendo o código")
	@PutMapping("/update4")
	public ResponseEntity<Item> updateItem4(@RequestBody Item item) throws SQLException{
		itemService.updateItem4(item);
		return new ResponseEntity<Item>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Mostra todos os itens")
	@GetMapping("/getTodos")
	public ResponseEntity<List<Item>> getTodos() throws SQLException{
		return new ResponseEntity<List<Item>>(itemService.todos(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostra o item sabendo a descricao")
	@GetMapping("/getItem/{descricao}")
	public ResponseEntity<List<Item>> getItem(@PathVariable(name = "descricao") String descricao) throws SQLException{
		Item item = new Item();
		item.setDescricao(descricao);
		return new ResponseEntity<List<Item>>(itemService.getItem(item),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostra todos os itens do mesmo tipo")
	@GetMapping("/getItemTipo/{tipo}")
	public ResponseEntity<List<Item>> getItemTipo(@PathVariable(name = "tipo") String tipo) throws SQLException{
		Item item = new Item();
		item.setTipo(tipo);
		return new ResponseEntity<List<Item>>(itemService.getItemTipo(item),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Traz o lucro de cada produto")
	@GetMapping("/getItemLucro")
	public ResponseEntity<List<ItemLucro>> getItemLucro() throws SQLException{
		return new ResponseEntity<List<ItemLucro>>(itemService.getItemLucro(),HttpStatus.OK);
	}
	
	

}
