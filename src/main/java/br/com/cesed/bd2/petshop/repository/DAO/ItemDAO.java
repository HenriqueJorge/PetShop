package br.com.cesed.bd2.petshop.repository.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cesed.bd2.petshop.DTO.Item.ItemLucro;
import br.com.cesed.bd2.petshop.entity.Item;
import br.com.cesed.bd2.petshop.repository.Conexao;

public class ItemDAO {

	private Connection con;

	public ItemDAO() throws ClassNotFoundException, SQLException {
		con = Conexao.criarConecao();
	}

	public void insertItem1(Item i) throws SQLException {
		String sql = "insert into item values(?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, i.getDescricao());
		preparador.setString(2, i.getTipo());
		preparador.setDouble(3, i.getPrecoFornecedor());
		preparador.setDouble(4, i.getPrecoLoja());
		preparador.setDate(5, i.getValidade());
		preparador.setInt(6, i.getQuantidade());
		preparador.execute();
		preparador.close();
	}
	
	public void insertItem2(Item i) throws SQLException {
		String sql = "insert into item(descricao,tipo,precofornecedor,precoloja,quantidade) "
				+ "values(?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, i.getDescricao());
		preparador.setString(2, i.getTipo());
		preparador.setDouble(3, i.getPrecoFornecedor());
		preparador.setDouble(4, i.getPrecoLoja());
		preparador.setInt(5, i.getQuantidade());
		preparador.execute();
		preparador.close();
	}
	
	public void insertItem3(Item i) throws SQLException {
		String sql = "insert into item(descricao,tipo,precofornecedor,validade,quantidade) "
				+ "values(?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, i.getDescricao());
		preparador.setString(2, i.getTipo());
		preparador.setDouble(3, i.getPrecoFornecedor());
		preparador.setDate(4, i.getValidade());
		preparador.setInt(5, i.getQuantidade());
		preparador.execute();
		preparador.close();
	}
	
	public void deleteItem1(Item i) throws SQLException {
		String sql = "delete from item where codigo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, i.getCodigo());
		preparador.execute();
		preparador.close();
	}
	
	public void updateItem1(Item i) throws SQLException {
		String sql = "update item set precofornecedor = ? where codigo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, i.getPrecoFornecedor());
		preparador.setInt(2, i.getCodigo());
		preparador.execute();
		preparador.close();
	}
	
	public void updateItem2(Item i) throws SQLException {
		String sql = "update item set precoloja = ? where codigo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, i.getPrecoLoja());
		preparador.setInt(2, i.getCodigo());
		preparador.execute();
		preparador.close();
	}
	
	public void updateItem3(Item i) throws SQLException {
		String sql = "update item set precofornecedor = ? , precoloja = ? where codigo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, i.getPrecoFornecedor());
		preparador.setDouble(2, i.getPrecoLoja());
		preparador.setInt(3, i.getCodigo());
		preparador.execute();
		preparador.close();
	}
	
	public void updateItem4(Item i) throws SQLException {
		String sql = "update item set descricao = ? , tipo = ? where codigo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, i.getDescricao());
		preparador.setString(2, i.getTipo());
		preparador.setInt(3, i.getCodigo());
		preparador.execute();
		preparador.close();
	}
	
	public List<Item> todos() throws SQLException{
		String sql = "select codigo,descricao,tipo,precofornecedor,precoloja,validade,quantidade from item";
		PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet r = preparador.executeQuery();
		ArrayList<Item> il = new ArrayList<Item>();
		while(r.next()) {
			Item i = new Item();
			i.setCodigo(r.getInt("codigo"));
			i.setDescricao(r.getString("descricao"));
			i.setTipo(r.getString("tipo"));
			i.setPrecoFornecedor(r.getDouble("precofornecedor"));
			i.setPrecoLoja(r.getDouble("precoloja"));
			i.setValidade(r.getDate("validade"));
			i.setQuantidade(r.getInt("quantidade"));
			il.add(i);			
		}
		return il;
	}
	
	public List<Item> getItem(Item ii) throws SQLException{
		String sql = "select codigo,descricao,tipo,precofornecedor,precoloja,validade,quantidade from item where descricao = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, ii.getDescricao());
		ResultSet r = preparador.executeQuery();
		ArrayList<Item> il = new ArrayList<Item>();
		while(r.next()) {
			Item i = new Item();
			i.setCodigo(r.getInt("codigo"));
			i.setDescricao(r.getString("descricao"));
			i.setTipo(r.getString("tipo"));
			i.setPrecoFornecedor(r.getDouble("precofornecedor"));
			i.setPrecoLoja(r.getDouble("precoloja"));
			i.setQuantidade(r.getInt("quantidade"));
			il.add(i);
		}
		return il;
	}
	
	public List<Item> getItensTipo(Item ii) throws SQLException{
		String sql = "select codigo,descricao,tipo,precofornecedor,precoloja,validade,quantidade from item where tipo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, ii.getTipo());
		ResultSet r = preparador.executeQuery();
		ArrayList<Item> il = new ArrayList<Item>();
		while(r.next()) {
			Item i = new Item();
			i.setCodigo(r.getInt("codigo"));
			i.setDescricao(r.getString("descricao"));
			i.setTipo(r.getString("tipo"));
			i.setPrecoFornecedor(r.getDouble("precofornecedor"));
			i.setPrecoLoja(r.getDouble("precoloja"));
			i.setQuantidade(r.getInt("quantidade"));
			il.add(i);
		}
		return il;
	}
	
	public List<ItemLucro> getItemLucro() throws SQLException {
		String sql = "select codigo,(precoloja - precofornecedor) as lucro from item";
		PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet r = preparador.executeQuery();
		ArrayList<ItemLucro> ill = new ArrayList<ItemLucro>();
		while(r.next()) {
			ItemLucro il = new ItemLucro();
			il.setCodigo(r.getInt("codigo"));
			il.setLucro(r.getDouble("lucro"));
			ill.add(il);
		}
		return ill;
	}
		
	

}
