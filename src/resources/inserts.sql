INSERT INTO rota (descricao)
VALUES ('Rota Litoral');

INSERT INTO rota (descricao)
VALUES ('Rota Centro');

INSERT INTO rota (descricao)
VALUES ('Bairro A');


INSERT INTO poste(codigo, latitude, longitude, observacao)
VALUES ('poste-01', '-49.0629788', '-26.9244749', '');

INSERT INTO poste(codigo, latitude, longitude, observacao)
VALUES ('poste-02', '-49.0629790', '-26.9244749', '');

INSERT INTO poste(codigo, latitude, longitude, observacao)
VALUES ('poste-03', '-49.0629800', '-26.9244749', '');


INSERT INTO tipo_pessoa (descricao)
VALUES ('JURIDICA');

INSERT INTO tipo_pessoa (descricao)
VALUES ('FISICA');


INSERT INTO tipo_fase (descricao)
VALUES ('MONOFASICO');

INSERT INTO tipo_fase (descricao)
VALUES ('BIFASICO');

INSERT INTO tipo_fase (descricao)
VALUES ('TRIFASICO');


INSERT INTO classe (descricao, tipo_fase_id)
VALUES ('RESIDENCIAL', 1);

INSERT INTO classe (descricao, tipo_fase_id)
VALUES ('COMERCIAL', 2);

INSERT INTO classe (descricao, tipo_fase_id)
VALUES ('INDUSTRIAL', 3);

INSERT INTO pessoa (nome, cpf, cnpj, tipo_pessoa_id)
VALUES ('USUARIO 1', '123456789', null, 2);

INSERT INTO pessoa (nome, cpf, cnpj, tipo_pessoa_id)
VALUES ('USUARIO JURIDICO 1', null, '2345678901', 1);

INSERT INTO pessoa (nome, cpf, cnpj, tipo_pessoa_id)
VALUES ('USUARIO 2', '1288888789', null, 2);

INSERT INTO cliente (num_documento, num_cliente, pessoa_id)
VALUES ('12345', '54321', 1);

INSERT INTO funcionario (codigo_funcional, pessoa_id)
VALUES ('23456', 1);

INSERT INTO medidor (descricao, rota_id, poste_id)
VALUES ('abc-1', 1, 1);

INSERT INTO tarefa_rota (observacao, data_inicio, data_fim, rota_id)
VALUES ('sem observacoes', '2018-05-10', '2018-05-13', 1);

INSERT INTO time_rota(funcionario_id, tarefa_rota_id)
VALUES (1, 1);

INSERT INTO medicao (mes, ano, data_medicao, consumo, medidor_id, time_rota_id)
VALUES ('05', '2018', '2018-05-11', '138.2', 1, 1);

INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, classe_id, cliente_id) 
VALUES ('ter11', '2015-01-01', '2015-01-01', 1, 1, 1);

INSERT INTO tarifa (taxa, classe_id, lei, data_inicio, data_fim, aliquota_ICMS)
VALUES ('0.75292', 1, '1', '2018-01-01', '2018-06-01', '0.27');

INSERT INTO cobranca (mes_referencia, ano_referencia, tarifa_id, medicao_id)
VALUES ('05', '2018', 1, 1);


----------


INSERT INTO medicao (mes, ano, data_medicao, consumo, medidor_id, time_rota_id)
VALUES ('08', '2022', '2022-08-11', '234.2', 1, 1);

INSERT INTO cobranca (mes_referencia, ano_referencia, tarifa_id, medicao_id)
VALUES ('08', '2022', 1, 2);


-----------

INSERT INTO cliente (num_documento, num_cliente, pessoa_id)
VALUES ('345333', '54111', 2);

INSERT INTO medidor (descricao, rota_id, poste_id)
VALUES ('abc-2', 2, 2);

INSERT INTO tarefa_rota (observacao, data_inicio, data_fim, rota_id)
VALUES ('sem observacoes', '2020-03-10', '2020-03-13', 2);

INSERT INTO time_rota(funcionario_id, tarefa_rota_id)
VALUES (1, 2);

INSERT INTO medicao (mes, ano, data_medicao, consumo, medidor_id, time_rota_id)
VALUES ('03', '2020', '2020-03-11', '92.7', 2, 2);

INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, classe_id, cliente_id) 
VALUES ('vopppp', '2020-01-01', '2020-01-01', 2, 1, 2);

INSERT INTO tarifa (taxa, classe_id, lei, data_inicio, data_fim, aliquota_ICMS)
VALUES ('0.medicao.insertMedicao(new Medicao(1, "05", "2018", Timestamp.valueOf("2018-05-11 00:00:00"), "138.2", 1, 1));75292', 1, '1', '2018-01-01', '2018-06-01', '0.27');

INSERT INTO cobranca (mes_referencia, ano_referencia, tarifa_id, medicao_id)
VALUES ('03', '2020', 1, 3);

-------------

INSERT INTO medicao (mes, ano, data_medicao, consumo, medidor_id, time_rota_id)
VALUES ('03', '2020', '2020-03-11', '100.28', 1, 1);

INSERT INTO cobranca (mes_referencia, ano_referencia, tarifa_id, medicao_id)
VALUES ('03', '2020', 1, 4;