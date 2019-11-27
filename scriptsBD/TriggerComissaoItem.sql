create or replace function comissaoTrigITem()
returns trigger as $inserircomissaoI$
begin

insert into vendaItem values(new.itemcod,new.funcmat,new.dia,new.mes,new.ano,
							   ComissaoCalc((select precoloja * (precoloja * new.desconto/100) from item where codigo = new.itemcod),'I'),new.desconto,
							   (select precoloja * (precoloja * new.desconto/100) from item where codigo = new.itemcod));

end;
$inserircomissaoI$ language plpgsql;

create trigger tgr_insertComissaoAnimal
before insert on vendaitem
for each row
execute procedure comissaoTrigItem()

