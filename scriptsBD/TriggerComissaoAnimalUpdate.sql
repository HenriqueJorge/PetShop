create or replace function atualizaFinalA()
returns trigger as $atualizarfinala$
begin

	update vandaanimal set valorF = (select precovenda * (precovenda * new.desconto/100) from animal where registro = new.reganimal),
							comissaoa = ComissaoCalc((select precovenda * (precovenda * new.desconto/100) from animal where registro = new.reganimal),'A')
							where notafiscal = new.notafiscal;

end;
$atualizarfinala$ language plpgsql;

Create trigger tgr_AtualizarDesconto
Before Update of desconto on VendaAnimal
For Each Row
Execute procedure atualizaFinalA()