create or replace function ComissaoCalc(Valor decimal, tipo char)
returns decimal as $$
begin
	if (tipo = A) then
		return valor * 0,05;
	else 
		return valor * 0,02;
	end if;
end ;
$$ language plpgsql;