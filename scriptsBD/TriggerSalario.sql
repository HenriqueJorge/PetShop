CREATE OR REPLACE FUNCTION funcionarioSalario()
RETURNS trigger AS $insertsalario$
BEGIN
		if (new.funcao = 'Caixa') then
			insert into funcionario values (new.nome,new.cpf,new.endereco,new.telefone,1000,new.dtnasc,new.dtadm,new.funcao,new.dtdemi);
		elsif (new.funcao = 'Cuidador') then
			insert into funcionario values (new.nome,new.cpf,new.endereco,new.telefone,1500,new.dtnasc,new.dtadm,new.funcao,new.dtdemi);
		elsif (new.funcao = 'Gerente') then
			insert into funcionario values (new.nome,new.cpf,new.endereco,new.telefone,2000,new.dtnasc,new.dtadm,new.funcao,new.dtdemi);
		elsif (new.funcao = 'Veterinario') then
			insert into funcionario values (new.nome,new.cpf,new.endereco,new.telefone,2500,new.dtnasc,new.dtadm,new.funcao,new.dtdemi);
		end if;
End;
$insertsalario$ language plpgsql;

Create trigger tgr_InserirSalario
Before Insert on Funcionario
For Each Row
Execute procedure funcionarioSalario()