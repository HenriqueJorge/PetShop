package br.com.cesed.bd2.petshop.repository.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoObje;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalFaturamento;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalFuncAnimal;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalRelatorioFuncionario;
import br.com.cesed.bd2.petshop.entity.Animal;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.entity.VendaAnimal;
import br.com.cesed.bd2.petshop.repository.Conexao;

public class VendaAnimalDAO {
	
	private Connection con;
	
	public VendaAnimalDAO()  {
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
	
	public void insertVendaAnimal1(VendaAnimal va) throws SQLException {
		String sql = "insert into vendaanimal(reganimal,matfunc,dia,mes,ano,comissaoa,desconto) values(?,?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, va.getRegAnimal());
		preparador.setInt(2, va.getRegFunc());
		preparador.setInt(3, va.getDia());
		preparador.setInt(4, va.getMes());
		preparador.setInt(5, va.getAno());
		preparador.setDouble(6, va.getComissaoA());
		preparador.setDouble(7, va.getDesconto());
		preparador.execute();
		preparador.close();
	}
	
	public void insertVendaAnimal2(VendaAnimal va) throws SQLException {
		String sql = "insert into vendaanimal(reganimal,matfunc,dia,mes,ano,comissaoa) values(?,?,?,?,?,?)";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, va.getRegAnimal());
		preparador.setInt(2, va.getRegFunc());
		preparador.setInt(3, va.getDia());
		preparador.setInt(4, va.getMes());
		preparador.setInt(5, va.getAno());
		preparador.setDouble(6, va.getComissaoA());
		preparador.execute();
		preparador.close();
	}
	
	public void deleteVendaAnimal1(VendaAnimal va) throws SQLException {
		String sql = "delete from vendaanimal where notafiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, va.getNotaFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public void updateVendaAnimal2(VendaAnimal va) throws SQLException {
		String sql = "update vendaanimal set reganimal = ? where notafiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, va.getRegAnimal());
		preparador.setInt(2, va.getNotaFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public void updateVendaAnimal3(VendaAnimal va) throws SQLException {
		String sql = "update vendaAnimal set matfunc = ? where notafiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, va.getRegFunc());
		preparador.setInt(2, va.getNotaFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public void updateVendaAnimal4(VendaAnimal va) throws SQLException {
		String sql = "update vendaanimal set dia = ?,mes = ?,ano = ? where notafiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, va.getDia());
		preparador.setInt(2, va.getMes());
		preparador.setInt(3, va.getAno());
		preparador.setInt(4, va.getNotaFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public void updateVendaAnimal5(VendaAnimal va) throws SQLException {
		String sql = "update vendaanimal set desconto = ? where notafiscal = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setDouble(1, va.getDesconto());
		preparador.setInt(2, va.getNotaFiscal());
		preparador.execute();
		preparador.close();
	}
	
	public List<VendaAnimal> todos() throws SQLException{
		String sql = "select notafiscal,reganimal,matfunc,dia,mes,ano,comissaoa,desconto,valorfinal from vendaAnimal";
		PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet r = preparador.executeQuery();
		ArrayList<VendaAnimal> val = new ArrayList<VendaAnimal>();
		while(r.next()) {
			VendaAnimal va = new VendaAnimal();
			va.setNotaFiscal(r.getInt("notafiscal"));
			va.setRegAnimal(r.getInt("reganimal"));
			va.setRegFunc(r.getInt("matfunc"));
			va.setDia(r.getInt("dia"));
			va.setMes(r.getInt("mes"));
			va.setAno(r.getInt("ano"));
			va.setComissaoA(r.getDouble("comissaoa"));
			va.setDesconto(r.getDouble("desconto"));
			va.setValorFinal(r.getDouble("valorfinal"));
			val.add(va);
		}
		return val;
	}
	
	public List<VendaAnimal> todasVendaAnimalTipo(Animal a) throws SQLException{
		String sql = "select v.notafiscal,v.reganimal,v.matfunc,v.dia,v.mes,v.ano,v.comissaoa,v.desconto,v.valorfinal" + 
				"from vendaAnimal v inner join animal as a on a.registro = v.reganimal where a.tipo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, a.getTipo());
		ResultSet r = preparador.executeQuery();
		ArrayList<VendaAnimal> val = new ArrayList<VendaAnimal>();
		while(r.next()) {
			VendaAnimal va = new VendaAnimal();
			va.setNotaFiscal(r.getInt("notafiscal"));
			va.setRegAnimal(r.getInt("reganimal"));
			va.setRegFunc(r.getInt("matfunc"));
			va.setDia(r.getInt("dia"));
			va.setMes(r.getInt("mes"));
			va.setAno(r.getInt("ano"));
			va.setComissaoA(r.getDouble("comissaoa"));
			va.setDesconto(r.getDouble("desconto"));
			va.setValorFinal(r.getDouble("valorfinal"));
			val.add(va);
		}
		return val;
	}
	
	public List<VendaAnimal> todasVendaAnimalNome(Funcionario f) throws SQLException{
		String sql = "select v.notafiscal,v.reganimal,v.matfunc,v.dia,v.mes,v.ano,v.comissaoa,v.desconto,v.valorfinal" + 
				"from vendaAnimal v inner join funcionario f on v.matfunc = f.matricula where f.nome = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, f.getNome());
		ResultSet r = preparador.executeQuery();
		ArrayList<VendaAnimal> val = new ArrayList<VendaAnimal>();
		while(r.next()) {
			VendaAnimal va = new VendaAnimal();
			va.setNotaFiscal(r.getInt("notafiscal"));
			va.setRegAnimal(r.getInt("reganimal"));
			va.setRegFunc(r.getInt("matfunc"));
			va.setDia(r.getInt("dia"));
			va.setMes(r.getInt("mes"));
			va.setAno(r.getInt("ano"));
			va.setComissaoA(r.getDouble("comissaoa"));
			va.setDesconto(r.getDouble("desconto"));
			va.setValorFinal(r.getDouble("valorfinal"));
			val.add(va);
		}
		
		return val;
	}

	public List<VendaAnimal> todasVendaAnimalTipoMes(VendaAnimalRelatorioFuncionario varf) throws SQLException{
		String sql = "select v.notafiscal,v.reganimal,v.matfunc,v.dia,v.mes,v.ano,v.comissaoa,v.desconto,v.valorfinal" + 
				"from vendaAnimal v inner join animal as a on a.registro = v.reganimal where a.tipo = ? and v.mes = ? and v.ano = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, varf.getTipo());
		preparador.setInt(2, varf.getMes());
		preparador.setInt(3, varf.getAno());
		ResultSet r = preparador.executeQuery();
		ArrayList<VendaAnimal> val = new ArrayList<VendaAnimal>();
		while(r.next()) {
			VendaAnimal va = new VendaAnimal();
			va.setNotaFiscal(r.getInt("notafiscal"));
			va.setRegAnimal(r.getInt("reganimal"));
			va.setRegFunc(r.getInt("matfunc"));
			va.setDia(r.getInt("dia"));
			va.setMes(r.getInt("mes"));
			va.setAno(r.getInt("ano"));
			va.setComissaoA(r.getDouble("comissaoa"));
			va.setDesconto(r.getDouble("desconto"));
			va.setValorFinal(r.getDouble("valorfinal"));
			val.add(va);
		}
		return val;
	}
	
	public List<VendaAnimal> getVendasPorFunc(VendaAnimalFuncAnimal vafa) throws SQLException{
		String sql = "select v.notafiscal,v.reganimal,v.matfunc,v.dia,v.mes,v.ano,v.comissaoa,v.desconto,v.valorfinal " + 
				"from vendaAnimal v inner join funcionario f on v.matfunc = f.matricula " + 
				"inner join animal a on a.registro = v.reganimal where f.matricula = ? and a.tipo = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, vafa.getMatricula());
		preparador.setString(2, vafa.getTipo());
		ResultSet r = preparador.executeQuery();
		ArrayList<VendaAnimal> val = new ArrayList<VendaAnimal>();
		while(r.next()) {
			VendaAnimal va = new VendaAnimal();
			va.setNotaFiscal(r.getInt("notafiscal"));
			va.setRegAnimal(r.getInt("reganimal"));
			va.setRegFunc(r.getInt("matfunc"));
			va.setDia(r.getInt("dia"));
			va.setMes(r.getInt("mes"));
			va.setAno(r.getInt("ano"));
			va.setComissaoA(r.getDouble("comissaoa"));
			va.setDesconto(r.getDouble("desconto"));
			va.setValorFinal(r.getDouble("valorfinal"));
			val.add(va);
		}
		return val;
	}
	
	public List<VendaAnimalFaturamento> getFaturamento() throws SQLException{
		String sql = "select v.reganimal,a.tipo,v.matfunc,count(*) as quantidade,sum(v.valorfinal) as faturamento " + 
				"from vendaAnimal v inner join funcionario f on v.matfunc = f.matricula " + 
				"inner join animal a on a.registro = v.reganimal group by a.tipo,v.matfunc,v.reganimal";
		PreparedStatement preparador = con.prepareStatement(sql);
		ResultSet r = preparador.executeQuery();
		ArrayList<VendaAnimalFaturamento> vafl = new ArrayList<VendaAnimalFaturamento>();
		while(r.next()) {
			VendaAnimalFaturamento vaf = new VendaAnimalFaturamento();
			vaf.setReganimal(r.getInt("reganimal"));
			vaf.setTipo(r.getString("tipo"));
			vaf.setMatfunc(r.getInt("matfunc"));
			vaf.setQuantidade(r.getInt("quantidade"));
			vaf.setFaturamento(r.getDouble("faturamento"));
			vafl.add(vaf);
		}
		return vafl;
	}
	
	public List<VendaAnimalFaturamento> getFaturamentoFunc(FuncionarioComissaoObje fco) throws SQLException{
		String sql = "select v.reganimal,a.tipo,v.matfunc,count(*) as quantidade,sum(v.valorfinal) as faturamento " + 
				"from vendaAnimal v inner join funcionario f on v.matfunc = f.matricula " + 
				"inner join animal a on a.registro = v.reganimal group by a.tipo,v.matfunc,v.reganimal "
				+ "where f.matricula = ? and v.mes = ? and v.ano = ?";
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setInt(1, fco.getMatricula());
		preparador.setInt(2, fco.getMes());
		preparador.setInt(3, fco.getAno());
		ResultSet r = preparador.executeQuery();
		ArrayList<VendaAnimalFaturamento> vafl = new ArrayList<VendaAnimalFaturamento>();
		while(r.next()) {
			VendaAnimalFaturamento vaf = new VendaAnimalFaturamento();
			vaf.setReganimal(r.getInt("reganimal"));
			vaf.setTipo(r.getString("tipo"));
			vaf.setMatfunc(r.getInt("matfunc"));
			vaf.setQuantidade(r.getInt("quantidade"));
			vaf.setFaturamento(r.getDouble("faturamento"));
			vafl.add(vaf);
		}
		return vafl;
	}
	
	
	
}
