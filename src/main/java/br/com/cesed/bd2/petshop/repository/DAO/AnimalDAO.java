package br.com.cesed.bd2.petshop.repository.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import br.com.cesed.bd2.petshop.DTO.Animal.AnimalLucro;
import br.com.cesed.bd2.petshop.DTO.Animal.AnimalTotalizacao;
import br.com.cesed.bd2.petshop.entity.Animal;
import br.com.cesed.bd2.petshop.repository.Conexao;

public class AnimalDAO {
	
	private Connection con;
	
	public AnimalDAO() {
		try {
			con = Conexao.criarConecao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertAnimal1(Animal a) throws SQLException, ParseException {
		String sql = "insert into animal(tipo,peso,altura,dtultmed,raca,precocompra,precovenda,dtnasc) values(?,?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo() );
		preparador.setDouble(2, a.getPeso());
		preparador.setDouble(3, a.getAltura());
		preparador.setString(4,  a.getDtUltMed());
		preparador.setString(5, a.getRaca());
		preparador.setDouble(6, a.getPrecocompra());
		preparador.setDouble(7, a.getPrecoVenda());
		preparador.setString(8, a.getDtNasc());
		preparador.execute();
		preparador.close();
	}
	
	public void insertAnimal2(Animal a) throws SQLException, ParseException {
		String sql = "insert into animal(tipo,raca,precocompra,precovenda,dtnasc)"
				+ " values(?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		preparador.setString(2, a.getRaca());
		preparador.setDouble(3, a.getPrecocompra());
		preparador.setDouble(4, a.getPrecoVenda());
		preparador.setString(5, a.getDtNasc());
		preparador.execute();
		preparador.close();
	}
	
	public void insertAnimal3(Animal a) throws SQLException, ParseException {
		String sql = "insert into animal(tipo,peso,altura,dtultmed,raca,precocompra,dtnasc) "
				+ "Values (?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		preparador.setDouble(2, a.getPeso());
		preparador.setDouble(3, a.getAltura());
		preparador.setString(4,  a.getDtUltMed());
		preparador.setString(5, a.getRaca());
		preparador.setDouble(6, a.getPrecocompra());
		preparador.setString(7, a.getDtNasc());
		preparador.execute();
		preparador.close();
	}
	
	public void insertAnimal4(Animal a) throws SQLException, ParseException {
		String sql = "insert into animal(tipo,peso,altura,dtultmed,race,precocompra,dtnasc) "
				+ "values (?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		preparador.setDouble(2, a.getPeso());
		preparador.setDouble(3, a.getAltura());
		preparador.setString(4,  a.getDtUltMed());
		preparador.setString(5, a.getRaca());
		preparador.setDouble(6, a.getPrecocompra());
		preparador.setString(7, a.getDtNasc());
		preparador.execute();
		preparador.close();
	}
	
	public void insertAnimal5(Animal a) throws SQLException, ParseException {
		String sql = "insert into animal(tipo,peso,altura,dtultmed,race,dtnasc) values(?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		preparador.setDouble(2, a.getPeso());
		preparador.setDouble(3, a.getAltura());
		preparador.setString(4,  a.getDtUltMed());
		preparador.setString(5, a.getRaca());
		preparador.setString(6, a.getDtNasc());
		preparador.execute();
		preparador.close();
	}
	
	public void insertAnimal6(Animal a) throws SQLException, ParseException {
		String sql = "insert into animal(tipo,peso,altura,dtultmed,race,precocompra,precovenda)"
				+ " values(?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		preparador.setDouble(2, a.getPeso());
		preparador.setDouble(3, a.getAltura());
		preparador.setString(4,  a.getDtUltMed());
		preparador.setString(5, a.getRaca());
		preparador.setDouble(6, a.getPrecocompra());
		preparador.setDouble(7, a.getPrecoVenda());
		preparador.execute();
		preparador.close();
	}
	
	public void updateAnimal1(Animal a) throws SQLException, ParseException {
		String sql = "update animal set peso = ?,altura = ?,dtultmed = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, a.getPeso());
		preparador.setDouble(2, a.getAltura());
		preparador.setString(3,  a.getDtUltMed());
		preparador.setInt(4, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void updateAnimal2(Animal a) throws SQLException, ParseException {
		String sql = "update animal set peso = ?,dtultmed = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, a.getPeso());
		preparador.setString(2,  a.getDtUltMed());
		preparador.setInt(3, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void updateAnimal3(Animal a) throws SQLException, ParseException {
		String sql = "update animal set altura = ?,dtultmed = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, a.getPeso());
		preparador.setString(2,  a.getDtUltMed());
		preparador.setInt(3, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void updateAnimal4(Animal a) throws SQLException {
		String sql = "update animal set precovenda = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, a.getPrecoVenda());
		preparador.setInt(2, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void updateAnimal5(Animal a) throws SQLException {
		String sql = "update animal set precocompra = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, a.getPrecocompra());
		preparador.setInt(2, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void updateAnimal6(Animal a) throws SQLException {
		String sql = "update animal set precocompra = ? , precovenda = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1,a.getPrecocompra());
		preparador.setDouble(2,a.getPrecoVenda());
		preparador.setInt(3, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void updateAnimal7(Animal a) throws SQLException {
		String sql = "update animal set tipo = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		preparador.setInt(2, a.getRegistro());
		preparador.execute();
		preparador.cancel();
	}
	
	public void updateAnimal8(Animal a) throws SQLException {
		String sql = "update animal set raca = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getRaca());
		preparador.setInt(2, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void updateAnimal9(Animal a) throws SQLException {
		String sql = "update animal set tipo = ? , raca = ? where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		preparador.setString(2, a.getRaca());
		preparador.setInt(3, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void deleteAnimal1(Animal a) throws SQLException {
		String sql = "delete from animal where registro = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, a.getRegistro());
		preparador.execute();
		preparador.close();
	}
	
	public void deleteAnimal2(Animal a) throws SQLException {
		String sql = "delete from animal where tipo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		preparador.execute();
		preparador.close();
	}
	
	public List<Animal> todosAnimal() throws SQLException{
		String sql = "select registro,tipo,peso,altura,dtultmed,raca,precocompra,precovenda,dtnasc from animal";
		PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet r = preparador.executeQuery();
		ArrayList<Animal> ar = new ArrayList<Animal>();
		while(r.next()) {
			Animal a = new Animal();
			a.setRegistro(r.getInt("registro"));
			a.setTipo(r.getString("tipo"));
			a.setPeso(r.getDouble("peso"));
			a.setAltura(r.getDouble("altura"));
			a.setDtUltMed(r.getString("dtultmed"));
			a.setRaca(r.getString("raca"));
			a.setPrecocompra(r.getDouble("precocompra"));
			a.setPrecoVenda(r.getDouble("precovenda"));
			a.setDtNasc(r.getString("dtnasc"));
			ar.add(a);
		}
		return ar;
	}
	
	public List<Animal> todosAnimalTipo(Animal an) throws SQLException{
		String sql = "select registro,tipo,peso,altura,dtultmed,raca,precocompra,precovenda,dtnasc from animal where tipo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, an.getTipo());
		ResultSet r = preparador.executeQuery();
		ArrayList<Animal> ar = new ArrayList<Animal>();
		while(r.next()) {
			Animal a = new Animal();
			a.setRegistro(r.getInt("registro"));
			a.setTipo(r.getString("tipo"));
			a.setPeso(r.getDouble("peso"));
			a.setAltura(r.getDouble("altura"));
			a.setDtUltMed(r.getString("dtultmed"));
			a.setRaca(r.getString("raca"));
			a.setPrecocompra(r.getDouble("precocompra"));
			a.setPrecoVenda(r.getDouble("precovenda"));
			a.setDtNasc(r.getString("dtnasc"));
			ar.add(a);
		}
		return ar;
	}
	
	public List<Animal> todosAnimalPrecoVenda(Animal an) throws SQLException{
		String sql = "select registro,tipo,peso,altura,dtultmed,raca,precocompra,precovenda,dtnasc from animal where precovenda <= ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, an.getPrecoVenda());
		ResultSet r = preparador.executeQuery();
		ArrayList<Animal> ar = new ArrayList<Animal>();
		while(r.next()) {
			Animal a = new Animal();
			a.setRegistro(r.getInt("registro"));
			a.setTipo(r.getString("tipo"));
			a.setPeso(r.getDouble("peso"));
			a.setAltura(r.getDouble("altura"));
			a.setDtUltMed(r.getString("dtultmed"));
			a.setRaca(r.getString("raca"));
			a.setPrecocompra(r.getDouble("precocompra"));
			a.setPrecoVenda(r.getDouble("precovenda"));
			a.setDtNasc(r.getString("dtnasc"));
			ar.add(a);
		}
		return ar;
	}
	
	public List<AnimalTotalizacao> todosAnimalTotalizacao() throws SQLException{
		String sql = "select tipo,count(*) as quantidade,max(Precovenda) as maxpreco,min(Precovenda) as minpreco from animal group by tipo,precovenda";
		PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet r = preparador.executeQuery();
		ArrayList<AnimalTotalizacao> atl = new ArrayList<AnimalTotalizacao>();
		while(r.next()) {
			AnimalTotalizacao at = new AnimalTotalizacao();
			at.setTipo(r.getString("tipo"));
			at.setQuantidade(r.getInt("quantidade"));
			at.setMaxpreco(r.getDouble("maxpreco"));
			at.setMinpreco(r.getDouble("minpreco"));
			atl.add(at);
		} 
		return atl;
	}
	
	public List<AnimalLucro> todosAnimaisLucro() throws SQLException{
		String sql = "select registro,(precocompra - precovenda) as lucro from animal ";
		PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet r = preparador.executeQuery();
		ArrayList<AnimalLucro> all = new ArrayList<AnimalLucro>();
		while(r.next()) {
			AnimalLucro al = new AnimalLucro();
			al.setRegistro(r.getInt("registro"));
			al.setLucro(r.getDouble("lucro"));
			all.add(al);
		}
		return all;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
