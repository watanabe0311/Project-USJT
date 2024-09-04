CREATE DATABASE DB_BITFLY;
USE DB_BITFLY;

CREATE TABLE TB_USUARIO(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
	usuario VARCHAR(200),
    idade VARCHAR(200),
    genero VARCHAR(200),
    email VARCHAR(200),
    cpf VARCHAR(200),
    senha VARCHAR(200),
    tipo VARCHAR(200)  CHECK (tipo IN ('true', 'false'))
);

CREATE TABLE TB_EVENTOS(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
    empresa VARCHAR(200),
    data_evento VARCHAR (200),
    horario_inicio VARCHAR (200),
    horario_termino VARCHAR (200),
    desc_evento VARCHAR (200)
);

SELECT * FROM TB_USUARIO;
SELECT * FROM TB_EVENTOS;

INSERT INTO TB_USUARIO(usuario, idade, genero, email, cpf, senha) VALUES ();
INSERT INTO TB_EVENTOS(empresa, data_evento, horario_inicio, horario_termino, desc_evento) VALUES ();
 

SET GLOBAL time_zone = '-3:00'