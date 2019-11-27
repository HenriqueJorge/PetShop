CREATE OR REPLACE FUNCTION decrementarItem()
RETURNS trigger AS $decrementItem$
Begin
	update item set quantidade = quantidade - 1 where codigo = new.ItemCod;
end;
$decrementItem$ language plpgsql;

create trigger tgr_insertVenda
before insert on VendaItem
for each row
execute procedure decrementarItem();
