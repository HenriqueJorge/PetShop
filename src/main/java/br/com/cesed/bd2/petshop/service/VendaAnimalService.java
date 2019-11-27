package br.com.cesed.bd2.petshop.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cesed.bd2.petshop.DTO.Funcionario.FuncionarioComissaoObje;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalFaturamento;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalFuncAnimal;
import br.com.cesed.bd2.petshop.DTO.VendaAnimal.VendaAnimalRelatorioFuncionario;
import br.com.cesed.bd2.petshop.entity.Animal;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.entity.VendaAnimal;
import br.com.cesed.bd2.petshop.repository.DAO.VendaAnimalDAO;

@Service
public class VendaAnimalService {
	
	private VendaAnimalDAO vadao = new VendaAnimalDAO();
	
	public void insertVendaAnimal1(VendaAnimal va) throws SQLException {
		vadao.insertVendaAnimal1(va);
	}
	
	public void insertVendaAnimal2(VendaAnimal va) throws SQLException {
		vadao.insertVendaAnimal2(va);
	}
	
	public void deleteVendaAnimal1(VendaAnimal va) throws SQLException {
		vadao.deleteVendaAnimal1(va);
	}
	
	public void updateVendaAnimal2(VendaAnimal va) throws SQLException {
		vadao.updateVendaAnimal2(va);
	}
	
	public void updateVendaAnimal3(VendaAnimal va) throws SQLException {
		vadao.updateVendaAnimal3(va);
	}
	
	public void updateVendaAnimal4(VendaAnimal va) throws SQLException {
		vadao.updateVendaAnimal4(va);
	}
	
	public void updateVendaAnimal5(VendaAnimal va) throws SQLException {
		vadao.updateVendaAnimal5(va);
	}
	
	public List<VendaAnimal> todos() throws SQLException{
		return vadao.todos();
	}
	
	public List<VendaAnimal> todasVendaAnimalTipo(Animal a) throws SQLException{
		return vadao.todasVendaAnimalTipo(a);
	}
	
	public List<VendaAnimal> todasVendaAnimalNome(Funcionario f) throws SQLException{
		return vadao.todasVendaAnimalNome(f);
	}
	
	public List<VendaAnimal> todasVendaAnimalTipoMes(VendaAnimalRelatorioFuncionario varf) throws SQLException{
		return vadao.todasVendaAnimalTipoMes(varf);
	}
	
	public List<VendaAnimal> getVendaPorFunc(VendaAnimalFuncAnimal vafa) throws SQLException{
		return vadao.getVendasPorFunc(vafa);
	}
	
	public List<VendaAnimalFaturamento> getFaturamento() throws SQLException{
		return vadao.getFaturamento();
	}
	
	public List<VendaAnimalFaturamento> getFaturamentoFunc(FuncionarioComissaoObje fco) throws SQLException{
		return vadao.getFaturamentoFunc(fco);
	}

}
