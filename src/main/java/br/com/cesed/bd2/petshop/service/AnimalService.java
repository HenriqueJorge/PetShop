package br.com.cesed.bd2.petshop.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cesed.bd2.petshop.DTO.Animal.AnimalLucro;
import br.com.cesed.bd2.petshop.DTO.Animal.AnimalTotalizacao;
import br.com.cesed.bd2.petshop.entity.Animal;
import br.com.cesed.bd2.petshop.repository.DAO.AnimalDAO;

@Service
public class AnimalService {

	private AnimalDAO adao = new AnimalDAO();

	public void insertAnimal1(Animal a) throws SQLException {
		try {
			adao.insertAnimal1(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertAnimal2(Animal a) throws SQLException {
		try {
			adao.insertAnimal2(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertAnimal3(Animal a) throws SQLException {
		try {
			adao.insertAnimal3(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertAnimal4(Animal a) throws SQLException {
		try {
			adao.insertAnimal4(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertAnimal5(Animal a) throws SQLException {
		try {
			adao.insertAnimal5(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertAnimal6(Animal a) throws SQLException {
		try {
			adao.insertAnimal6(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateAnimal1(Animal a) throws SQLException {
		try {
			adao.updateAnimal1(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateAnimal2(Animal a) throws SQLException {
		try {
			adao.updateAnimal2(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateAnimal3(Animal a) throws SQLException {
		try {
			adao.updateAnimal3(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateAnimal4(Animal a) throws SQLException {
		adao.updateAnimal4(a);
	}

	public void updateAnimal5(Animal a) throws SQLException {
		adao.updateAnimal5(a);
	}

	public void updateAnimal6(Animal a) throws SQLException {
		adao.updateAnimal6(a);
	}

	public void updateAnimal7(Animal a) throws SQLException {
		adao.updateAnimal7(a);
	}

	public void updateAnimal8(Animal a) throws SQLException {
		adao.updateAnimal8(a);
	}

	public void updateAnimal9(Animal a) throws SQLException {
		adao.updateAnimal9(a);
	}

	public void deletaAnimal1(Animal a) throws SQLException {
		adao.deleteAnimal1(a);
	}

	public void deletaAnimal2(Animal a) throws SQLException {
		adao.deleteAnimal2(a);
	}
	
	public List<Animal> todosAnimais() throws SQLException{
		return adao.todosAnimal();
	}
	
	public List<Animal> todosAnimalTipo(Animal an) throws SQLException{
		return adao.todosAnimalTipo(an);
	}
	
	public List<Animal> todosAnimalPrecoVenda(Animal an) throws SQLException{
		return adao.todosAnimalPrecoVenda(an);
	}
	
	public List<AnimalTotalizacao> todosAnimalTotalizacao() throws SQLException{
		return adao.todosAnimalTotalizacao();
	}
	
	public List<AnimalLucro> todosAnimaisLucro() throws SQLException{
		return adao.todosAnimaisLucro();
	}

}
