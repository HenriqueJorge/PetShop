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

import br.com.cesed.bd2.petshop.DTO.Animal.AnimalLucro;
import br.com.cesed.bd2.petshop.DTO.Animal.AnimalTotalizacao;
import br.com.cesed.bd2.petshop.entity.Animal;
import br.com.cesed.bd2.petshop.service.AnimalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API REST Animal")
@Controller
@RequestMapping("/Animal")
public class AnimalController {

	@Autowired
	private AnimalService animalService;
	
	@ApiOperation(value = "Inserir com todos os dados informados")
	@PostMapping("/insert1")
	public ResponseEntity<Animal> insertAnimal1(@RequestBody Animal animal) throws SQLException{
		animalService.insertAnimal1(animal);;
		return new ResponseEntity<Animal>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem preso,altura e data da ultima medicao")
	@PostMapping("/insert2")
	public ResponseEntity<Animal> insertAnimal2(@RequestBody Animal animal) throws SQLException{
		animalService.insertAnimal2(animal);
		return new ResponseEntity<Animal>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem preco venda")
	@PostMapping("/insert3")
	public ResponseEntity<Animal> insertAnimal3(@RequestBody Animal animal) throws SQLException{
		animalService.insertAnimal3(animal);
		return new ResponseEntity<Animal>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem preco compra")
	@PostMapping("/insert4")
	public ResponseEntity<Animal> insertAnimal4(@RequestBody Animal animal) throws SQLException{
		animalService.insertAnimal4(animal);
		return new ResponseEntity<Animal>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Inserir sem preco compra e nem venda")
	@PostMapping("/insert5")
	public ResponseEntity<Animal> insertAnimal5(@RequestBody Animal animal) throws SQLException{
		animalService.insertAnimal5(animal);
		return new ResponseEntity<Animal>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Inserir sem dara de nascimento")
	@PostMapping("/insert6")
	public ResponseEntity<Animal> insertAnimal6(@RequestBody Animal animal) throws SQLException{
		animalService.insertAnimal6(animal);
		return new ResponseEntity<Animal>(HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Alterar peso,altura e data da ultima medicao(Usando registro)")
	@PutMapping("/update1")
	public ResponseEntity<Animal> updateAnimal1(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal1(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar peso e data da última atualização(Usando registro)")
	@PutMapping("/update2")
	public ResponseEntity<Animal> updateAnimal2(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal2(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar altura e data da última medição(Usando registro)")
	@PutMapping("/update3")
	public ResponseEntity<Animal> updateAnimal3(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal3(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar o preço de venda(Usando registro)")
	@PutMapping("/update4")
	public ResponseEntity<Animal> updateAnimal4(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal4(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar o preço de compra(Usando registro)")
	@PutMapping("/update5")
	public ResponseEntity<Animal> updateAnimal5(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal5(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar  preço de compra e o de venda(Usando registro)")
	@PutMapping("/update6")
	public ResponseEntity<Animal> updateAnimal6(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal6(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar tipo(Usando registro)")
	@PutMapping("/update7")
	public ResponseEntity<Animal> updateAnimal7(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal7(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar raça(Usando registro)")
	@PutMapping("/update8")
	public ResponseEntity<Animal> updateAnimal8(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal8(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar tipo e raça(Usando registro)")
	@PutMapping("/update9")
	public ResponseEntity<Animal> updateAnimal9(@RequestBody Animal animal) throws SQLException{
		animalService.updateAnimal9(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deletar um anima sabendo seu Registro")
	@DeleteMapping("/delete1")
	public ResponseEntity<Animal> deleteAnimal1(@RequestBody Animal animal) throws SQLException{
		animalService.deletaAnimal1(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deletar todos os animais de um mesmo tipo")
	@DeleteMapping("/delete2")
	public ResponseEntity<Animal> deleteAnimal2(@RequestBody Animal animal) throws SQLException{
		animalService.deletaAnimal2(animal);
		return new ResponseEntity<Animal>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Traz todos os registro dos animais")
	@GetMapping("/todosAnimais")
	public ResponseEntity<List<Animal>> getTodosAnimais() throws SQLException{
		return new ResponseEntity<List<Animal>>(animalService.todosAnimais(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Traz todos os registro de animais por tipo")
	@GetMapping("/todosAnimaisTipo/{tipo}")
	public ResponseEntity<List<Animal>> getTodosAnimaisTipo(@PathVariable(name = "tipo") String tipo) throws SQLException{
		Animal animal = new Animal();
		System.out.println(tipo);
		animal.setTipo((String)(tipo));
		return new ResponseEntity<List<Animal>>(animalService.todosAnimalTipo(animal),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostrar animais por PreçoVenda menor ou igual")
	@GetMapping("/todosAnimaisPrecoVenda/{precoVenda}")
	public ResponseEntity<List<Animal>> getTodosAnimaisPrecoVenda(@PathVariable(name = "precoVenda") double precoVenda) throws SQLException{
		Animal animal = new Animal();
		animal.setPrecoVenda(precoVenda);
		return new ResponseEntity<List<Animal>>(animalService.todosAnimalPrecoVenda(animal),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostra uma totalizacao dos animais")
	@GetMapping("/todosAnimaisTotalizacao")
	public ResponseEntity<List<AnimalTotalizacao>> getTodosAnimaisTotalizacao() throws SQLException{
		return new ResponseEntity<List<AnimalTotalizacao>>(animalService.todosAnimalTotalizacao(),HttpStatus.OK);
	}
	
	@ApiOperation(value = "Mostra o lucro dos animais")
	@GetMapping("/todosAnimaisLucro")
	public ResponseEntity<List<AnimalLucro>> getTodosAnimaisLucro() throws SQLException{
		return new ResponseEntity<List<AnimalLucro>>(animalService.todosAnimaisLucro(),HttpStatus.OK);
	}
	
}
