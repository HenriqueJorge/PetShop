create or replace function comissaoTrigA()
returns trigger as $inserircomissao$
begin

insert into vendaanimal values(new.reganimal,new.matfunc,new.dia,new.mes,new.ano,
							   ComissaoCalc((select precovenda * (precovenda * new.desconto/100) from animal where registro = new.reganimal),'A'),new.desconto,
							   (select precovenda * (precovenda * new.desconto/100) from animal where registro = new.reganimal));

end;
$inserircomissao$ language plpgsql;

create trigger tgr_insertComissaoAnimal
before insert on vendaanimal
for each row
execute procedure comissaoTrigA()

