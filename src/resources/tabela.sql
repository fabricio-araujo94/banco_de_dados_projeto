create table tipo_fase
(
    id         SERIAL primary key,
    descricao  varchar(100) not null unique
);

create table tipo_pessoa
(
    id        SERIAL primary key,
    descricao varchar(100) not null unique
);

create table poste
(
    id         SERIAL primary key,
    codigo     varchar(50) not null unique,
    latitude   varchar(30),
    longitude  varchar(30),
    observacao varchar(255)
);

create table rota
(
    id        SERIAL primary key,
    descricao varchar(255) not null unique
);

create table medidor
(
    id        SERIAL primary key,
    descricao varchar(255) not null unique,
    poste_id  int references poste (id),
    rota_id   int references rota (id)
);

create table classe
(
    id           SERIAL primary key,
    descricao    varchar(255) not null unique,
    tipo_fase_id int references tipo_fase (id)
);

create table pessoa
(
    id             SERIAL primary key,
    nome           varchar(255) not null unique,
    cpf            varchar(11) unique,
    cnpj           varchar(14) unique,
    tipo_pessoa_id int references tipo_pessoa (id)
);

create table cliente
(
    id               SERIAL primary key,
    num_documento varchar(255) not null unique,
    num_cliente   varchar(255) not null unique,
    pessoa_id        int references pessoa (id)
);

create table contrato
(
    id          SERIAL primary key,
	descricao varchar(255),
    data_inicio TIMESTAMP not null,
    data_criacao TIMESTAMP not null,
    cliente_id  int references cliente (id),
    classe_id   int references classe (id),
    medidor_id  int references medidor (id)
);

create table funcionario (
	id serial primary key,
	codigo_funcional varchar(45),
	pessoa_id int references pessoa(id)	
);

create table tarefa_rota(
	id serial primary key,
	observacao varchar(45),
	data_inicio timestamp,
	data_fim timestamp,
	rota_id int references rota(id)
);

create table time_rota(
	id serial primary key,
	funcionario_id int references funcionario(id),
	tarefa_rota_id int references tarefa_rota(id)
);

create table medicao (
	id serial primary key,
	mes varchar(45),
	ano varchar(45),
	data_medicao timestamp,
	consumo varchar(45),
	medidor_id int references medidor(id),
	time_rota_id int references time_rota(id)
);

create table tarifa (
	id serial primary key,
	taxa varchar(45),
	lei varchar(45),
	data_inicio varchar(45),
	data_fim varchar(45),
	classe_id int references classe(id),
	aliquota_ICMS varchar(45)
);


create table cobranca (
	id serial primary key,
	mes_referencia varchar(45),
	ano_referencia varchar(45),
	tarifa_id int references tarifa(id),
	medicao_id int references medicao(id)
);

