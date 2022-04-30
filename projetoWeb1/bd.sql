drop TABLE cliente
drop TABLE listaProdutos
drop TABLE lojista


CREATE TABLE lojista
(
    id_lojista int NOT NULL primary key generated always as identity,
    nome varchar (60) NOT NULL,
	email varchar (60) NOT NULL,
	senha varchar(20) NOT NULL
);

CREATE TABLE cliente(
	id_cliente int NOT NULL PRIMARY KEY generated always as identity,
	nome varchar (60) NOT NULL,
	email varchar (60) NOT NULL,
	senha varchar(60) NOT NULL
);

CREATE TABLE listaProdutos(
	id_listaProdutos int NOT NULL PRIMARY KEY generated always as identity,
	id_lojista int not null,
	nome varchar (60) NOT NULL,
	descricao varchar (300) NOT NULL,
	preco float NOT NULL,
	estoque int	NOT NULL,
	carrinho Boolean,
	FOREIGN KEY (id_lojista) REFERENCES lojista(id_lojista)
);

INSERT INTO lojista (nome, email, senha) values ('João do caminhão', 'joao@gmail.com', 'joao123');

INSERT INTO cliente (nome, email, senha) values ('Jorge', 'jorge@gmail.com', 'jorge123');

select *from lojista

INSERT INTO listaProdutos 
(id_lojista, nome, descricao, preco, estoque, carrinho) 
values  (1, 'mesa', 'mesa de compuatdor', 10, 0, true);

INSERT INTO listaProdutos 
(id_lojista, nome, descricao, preco, estoque, carrinho) 
values (1,'caneta', 'caneta azul bic', 7, 1, false);

select *from listaProdutos
