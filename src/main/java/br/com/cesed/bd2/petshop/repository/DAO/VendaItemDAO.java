package br.com.cesed.bd2.petshop.repository.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemFuncionarioItem;
import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemMesDescricao;
import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemTotalizacao;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.entity.Item;
import br.com.cesed.bd2.petshop.entity.VendaItem;
import br.com.cesed.bd2.petshop.repository.Conexao;

public class VendaItemDAO {
	
	private Connection con;
	
	public VendaItemDAO() throws ClassNotFoundException, SQLException {
		con = Conexao.criarConecao();
	}
	
	public void insertVendaItem1(VendaItem vi) throws SQLException {
		String sql = "insert into ventaitem(itemcod,funcmat,dia,mes,ano,comissaoi,desconto)"
				+ " values(?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vi.getItemCod());
		preparador.setInt(2, vi.getFuncMat());
		preparador.setInt(3, vi.getDia());
		preparador.setInt(4, vi.getMes());
		preparador.setInt(5, vi.getAno());
		preparador.setDouble(6, vi.getComissaoI());
		preparador.setDouble(7, vi.getDesconto());
		preparador.execute();
		preparador.close();
	}
	
	public void insertVendaItem2(VendaItem vi) throws SQLException {
		String sql = "insert into ventaitem(itemcod,funcmat,dia,mes,ano,comissaoi) values(?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vi.getItemCod());
		preparador.setInt(2, vi.getFuncMat());
		preparador.setInt(3, vi.getDia());
		preparador.setInt(4, vi.getMes());
		preparador.setInt(5, vi.getAno());
		preparador.setDouble(6, vi.getComissaoI());
		preparador.execute();
		preparador.close();	
	}
	
	public void deleteVendaItem1(VendaItem vi) throws SQLException {
		String sql = "delete from vendaitem where ntfiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vi.getNtFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public void updateVendaItem2(VendaItem vi) throws SQLException {
		String sql = "update vendaitem set itemcod = ? where ntfiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vi.getItemCod());
		preparador.setInt(2, vi.getNtFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public void updateVendaItem3(VendaItem vi) throws SQLException {
		String sql = "update vendaitem set funcmat = ? where ntfiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vi.getFuncMat());
		preparador.setInt(2, vi.getNtFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public void updateVendaItem4(VendaItem vi) throws SQLException {
		String sql = "update vendaitem set dia = ?,mes = ?,ano = ? where ntfiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vi.getDia());
		preparador.setInt(2, vi.getMes());
		preparador.setInt(3, vi.getAno());
		preparador.setInt(4, vi.getNtFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public void updateVendaItem5(VendaItem vi) throws SQLException {
		String sql = "update vendaItem set desconto = ? where ntfiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, vi.getDesconto());
		preparador.setInt(2, vi.getNtFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public List<VendaItem> todos() throws SQLException{
		String sql = "select ntfiscal,itemcod,funcmat,dia,mes,ano,comissaoi,desconto,valorf from vendaitem";
		PreparedStatement preparador = con.prepareStatement(sql);
	    ResultSet r = preparador.executeQuery();
	    ArrayList<VendaItem> vil = new ArrayList<VendaItem>();
	    while(r.next()) {
	    	VendaItem vi = new VendaItem();
	    	vi.setNtFiscal(r.getInt("ntfiscal"));
	    	vi.setItemCod(r.getInt("itemcod"));
	    	vi.setFuncMat(r.getInt("funcmat"));
	    	vi.setDia(r.getInt("dia"));
	    	vi.setMes(r.getInt("mes"));
	    	vi.setAno(r.getInt("ano"));
	    	vi.setComissaoI(r.getDouble("comissaoi"));
	    	vi.setDesconto(r.getDouble("desconto"));
	    	vi.setValorF(r.getDouble("valorf"));
	    	vil.add(vi);
	    }
	    return vil;
	}
	
	public List<VendaItem> getVendaItemDescricao(Item i) throws SQLException{
		String sql = "select v.ntfiscal,v.itemcod,v.funcmat,v.dia,v.mes,v.ano,v.comissaoi,v.desconto,v.valorf from vendaitem " + 
				"inner join item i on v.itemcod = i.codigo where i.descricao = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, i.getDescricao());
	    ResultSet r = preparador.executeQuery();
	    ArrayList<VendaItem> vil = new ArrayList<VendaItem>();
	    while(r.next()) {
	    	VendaItem vi = new VendaItem();
	    	vi.setNtFiscal(r.getInt("ntfiscal"));
	    	vi.setItemCod(r.getInt("itemcod"));
	    	vi.setFuncMat(r.getInt("funcmat"));
	    	vi.setDia(r.getInt("dia"));
	    	vi.setMes(r.getInt("mes"));
	    	vi.setAno(r.getInt("ano"));
	    	vi.setComissaoI(r.getDouble("comissaoi"));
	    	vi.setDesconto(r.getDouble("desconto"));
	    	vi.setValorF(r.getDouble("valorf"));
	    	vil.add(vi);
	    }
	    return vil;
	}
	
	public List<VendaItem> getVendaItemFuncionario(Funcionario f) throws SQLException{
		String sql = "select v.ntfiscal,v.itemcod,v.funcmat,v.dia,v.mes,v.ano,v.comissaoi,v.desconto,v.valorf from vendaitem " + 
				"inner join funcionario f on v.funcmat = f.matricula where f.nome = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getNome());
	    ResultSet r = preparador.executeQuery();
	    ArrayList<VendaItem> vil = new ArrayList<VendaItem>();
	    while(r.next()) {
	    	VendaItem vi = new VendaItem();
	    	vi.setNtFiscal(r.getInt("ntfiscal"));
	    	vi.setItemCod(r.getInt("itemcod"));
	    	vi.setFuncMat(r.getInt("funcmat"));
	    	vi.setDia(r.getInt("dia"));
	    	vi.setMes(r.getInt("mes"));
	    	vi.setAno(r.getInt("ano"));
	    	vi.setComissaoI(r.getDouble("comissaoi"));
	    	vi.setDesconto(r.getDouble("desconto"));
	    	vi.setValorF(r.getDouble("valorf"));
	    	vil.add(vi);
	    }
	    return vil;
	}
	
	public List<VendaItem> getVendaItemMesDescricao(VendaItemMesDescricao i) throws SQLException{
		String sql = "select v.ntfiscal,v.itemcod,v.funcmat,v.dia,v.mes,v.ano,v.comissaoi,v.desconto,v.valorf from vendaitem " + 
				"inner join item i on v.itemcod = i.codigo where i.descricao = ? and v.mes = ? and v.ano = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, i.getDescricao());
		preparador.setInt(2, i.getMes());
		preparador.setInt(3, i.getAno());
	    ResultSet r = preparador.executeQuery();
	    ArrayList<VendaItem> vil = new ArrayList<VendaItem>();
	    while(r.next()) {
	    	VendaItem vi = new VendaItem();
	    	vi.setNtFiscal(r.getInt("ntfiscal"));
	    	vi.setItemCod(r.getInt("itemcod"));
	    	vi.setFuncMat(r.getInt("funcmat"));
	    	vi.setDia(r.getInt("dia"));
	    	vi.setMes(r.getInt("mes"));
	    	vi.setAno(r.getInt("ano"));
	    	vi.setComissaoI(r.getDouble("comissaoi"));
	    	vi.setDesconto(r.getDouble("desconto"));
	    	vi.setValorF(r.getDouble("valorf"));
	    	vil.add(vi);
	    }
	    return vil;
	}
	
	public List<VendaItem> getVendaItemFuncionarioItem(VendaItemFuncionarioItem vifi) throws SQLException{
		String sql = "select v.ntfiscal,v.itemcod,v.funcmat,v.dia,v.mes,v.ano,v.comissaoi,v.desconto,v.valorf from vendaitem " + 
				"inner join item i on v.itemcod = i.codigo " + 
				"inner join funcionario f on v.funcmat = f.matricula where f.matricula = ? and i.codigo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vifi.getMatricula());
		preparador.setInt(2, vifi.getCodigo());
	    ResultSet r = preparador.executeQuery();
	    ArrayList<VendaItem> vil = new ArrayList<VendaItem>();
	    while(r.next()) {
	    	VendaItem vi = new VendaItem();
	    	vi.setNtFiscal(r.getInt("ntfiscal"));
	    	vi.setItemCod(r.getInt("itemcod"));
	    	vi.setFuncMat(r.getInt("funcmat"));
	    	vi.setDia(r.getInt("dia"));
	    	vi.setMes(r.getInt("mes"));
	    	vi.setAno(r.getInt("ano"));
	    	vi.setComissaoI(r.getDouble("comissaoi"));
	    	vi.setDesconto(r.getDouble("desconto"));
	    	vi.setValorF(r.getDouble("valorf"));
	    	vil.add(vi);
	    }
	    return vil;
	}
	
	public List<VendaItemTotalizacao> getVendaItemFaturamento() throws SQLException{
		String sql = "select v.funcmat,i.tipo,count(*) as quantidade,sum(valorf) as faturamento from vendaitem " + 
				"inner join item i on v.itemcod = i.codigo " + 
				"inner join funcionario f on v.funcmat = f.matricula group by v.funcmat,i.tipo";
		PreparedStatement preparador = con.prepareStatement(sql);
	    ResultSet r = preparador.executeQuery();
	    ArrayList<VendaItemTotalizacao> vil = new ArrayList<VendaItemTotalizacao>();
	    while(r.next()) {
	    	VendaItemTotalizacao vi = new VendaItemTotalizacao();
	    	vi.setFuncMat(r.getInt("funcmat"));
	    	vi.setTipo(r.getString("tipo"));
	    	vi.setQuantidade(r.getInt("quantidade"));
	    	vi.setFaturamento(r.getDouble("faturamento"));
	    	vil.add(vi);
	    }
	    return vil;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
