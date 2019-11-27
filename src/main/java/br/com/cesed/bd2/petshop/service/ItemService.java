package br.com.cesed.bd2.petshop.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cesed.bd2.petshop.DTO.Item.ItemLucro;
import br.com.cesed.bd2.petshop.entity.Item;
import br.com.cesed.bd2.petshop.repository.DAO.ItemDAO;

@Service
public class ItemService {
	
	private ItemDAO idao = new ItemDAO();

	public void insertItem1(Item i) throws SQLException {
		idao.insertItem1(i);
	}
	
	public void insertItem2(Item i) throws SQLException {
		idao.insertItem2(i);
	}
	
	public void insertItem3(Item i) throws SQLException {
		idao.insertItem3(i);
	}
	
	public void deleteItem1(Item i) throws SQLException {
		idao.deleteItem1(i);
	}
	
	public void updateItem1(Item i) throws SQLException {
		idao.updateItem1(i);
	}
	
	public void updateItem2(Item i) throws SQLException {
		idao.updateItem2(i);
	}
	
	public void updateItem3(Item i) throws SQLException {
		idao.updateItem3(i);
	}
	
	public void updateItem4(Item i) throws SQLException {
		idao.updateItem4(i);
	}
	
	public List<Item> todos() throws SQLException{
		return idao.todos();
	}
	
	public List<Item> getItem(Item ii) throws SQLException{
		return idao.getItem(ii);
	}
	
	public List<Item> getItemTipo(Item ii) throws SQLException{
		return idao.getItensTipo(ii);
	}
	
	public List<ItemLucro> getItemLucro() throws SQLException{
		return idao.getItemLucro();
	}
}
