create or replace function atualizaFinalItem()
returns trigger as $atualizarfinalaItem$
begin

	update vandaitem set valorF = (select precoloja * (precoloja * new.desconto/100) from item where codigo = new.itemcod),
							comissaoI = ComissaoCalc((select precoloja * (precoloja * new.desconto/100) from item where codigo = new.itemcodigo),'I')
							where ntfiscal = new.ntfiscal;

end;
$atualizarfinalaItem$ language plpgsql;

Create trigger tgr_AtualizarDescontoItem
Before Update of desconto on VendaItem
For Each Row
Execute procedure atualizaFinalItem()