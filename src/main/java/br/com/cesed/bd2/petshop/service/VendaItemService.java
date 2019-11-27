package br.com.cesed.bd2.petshop.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemFuncionarioItem;
import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemMesDescricao;
import br.com.cesed.bd2.petshop.DTO.VendaItem.VendaItemTotalizacao;
import br.com.cesed.bd2.petshop.entity.Funcionario;
import br.com.cesed.bd2.petshop.entity.Item;
import br.com.cesed.bd2.petshop.entity.VendaItem;
import br.com.cesed.bd2.petshop.repository.DAO.VendaItemDAO;

@Service
public class VendaItemService {
	
	private VendaItemDAO vidao = new VendaItemDAO();
	
	public void insertVendaItem1(VendaItem vi) throws SQLException {
		vidao.insertVendaItem1(vi);
	}
	
	public void insertVendaItem2(VendaItem vi) throws SQLException {
		vidao.insertVendaItem2(vi);
	}
	
	public void deleteVendaItem1(VendaItem vi) throws SQLException {
		vidao.deleteVendaItem1(vi);
	}
	
	public void updateVendaItem2(VendaItem vi) throws SQLException {
		vidao.updateVendaItem2(vi);
	}
	
	public void updateVendaItem3(VendaItem vi) throws SQLException {
		vidao.updateVendaItem3(vi);
	}
	
	public void updateVendaItem4(VendaItem vi) throws SQLException {
		vidao.updateVendaItem4(vi);
	}
	
	public void updateVendaItem5(VendaItem vi) throws SQLException {
		vidao.updateVendaItem5(vi);
	}
	
	public List<VendaItem> todos() throws SQLException{
		return vidao.todos();
	}
	
	public List<VendaItem> getVendaItemDescricao(Item i) throws SQLException{
		return vidao.getVendaItemDescricao(i);
	}
	
	public List<VendaItem> getVendaItemFuncionario(Funcionario f) throws SQLException{
		return vidao.getVendaItemFuncionario(f);
	}
	
	public List<VendaItem> getVendaItemMesDescricao(VendaItemMesDescricao vimd) throws SQLException{
		return vidao.getVendaItemMesDescricao(vimd);
	}
	
	public List<VendaItem> getVendaItemFuncionarioItem(VendaItemFuncionarioItem vifi) throws SQLException{
		return vidao.getVendaItemFuncionarioItem(vifi);
	}
	
	public List<VendaItemTotalizacao> getVendaItemFaturamento() throws SQLException{
		return vidao.getVendaItemFaturamento();
	}

}
