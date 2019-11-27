Create table Animal(Registro serial primary key,
				   Tipo varchar(30) default '',
				   Peso decimal default 0,
				   Altura decimal default 0,
				   DtUltMed date default 0,
				   Raca varchar(30) default '',
				   PrecoCompra decimal default 0,
				   PrecoVenda decimal default 0,
				   DtNasc date default '1900-01-01';
				   
Create table Funcionario(Matricula serial primary key,
						Nome varchar(80) default '',
						Cpf varchar(11) default '',
						Endereco varchar(100) default '',
						Telefone varchar(20) default '',
						Salario decimal default 0,
						DtNasc date default '1900-01-01',
						DtAdm date default '1900-01-01',
						Funcao varchar(30) default '',
						DtDemi date default '1900-01-01');
						
Create table Item(Codigo serial primary key,
				 Descricao varchar(80),
				 Tipo varchar(30) default '',
				 PrecoFornecedor decimal default 0,
				 PrecoLoja decimal default 0,
				 Validade date default '1900-01-01',
				 Quantidade int default 0);
				 
Create table VendaAnimal(NotaFiscal serial primary key,
						RegAnimal int default 0,
						MatFunc int default 0,
						Dia int default 0,
						Mes int default 0,
						Ano int default 0,
						ComissaoA decimal default 0,
						Desconto decimal default 0,
						ValorFinal decimal default 0);
						
Create table VendaItem(NtFiscal serial primary key,
					  ItemCod int default 0,
					  FuncMat int default 0,
					  Dia int default 0,
					  Mes int default 0,
					  Ano int default 0,
					  ComissaoI decimal default 0,
					  Desconto decimal default 0,
					  ValorF decimal default 0);