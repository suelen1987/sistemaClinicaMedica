
CREATE DATABASE clinica;


CREATE TABLE medicos(
  id INT NOT NULL AUTO_INCREMENT ,
  nomeMedico VARCHAR(150) NOT NULL,
  Sobrenome VARCHAR(150) NOT NULL,
  DataNascimento DATE NOT NULL,
  Endereco VARCHAR(150) NOT NULL,
  Telefone VARCHAR(13) NOT NULL,
  CRM VARCHAR(45) NOT NULL, 
  Especializacao VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));



CREATE TABLE Paciente(
  id INT NOT NULL AUTO_INCREMENT,
  Nome VARCHAR(150) NOT NULL,
  Sobrenome VARCHAR(150) NOT NULL,
  Endereco VARCHAR(150) NOT NULL,
  DataNacimento DATE NOT NULL,
  Sexo VARCHAR(14) NOT NULL,
  CPF VARCHAR(14) NOT NULL,
  Telefone VARCHAR(13) NOT NULL,
  CartaoConvenio VARCHAR(13) NOT NULL,
  PRIMARY KEY (id));

INSERT into prontuario(Diagnostico,Consulta_id) VALUES('',2);



CREATE TABLE Consulta (
  id INT NOT NULL AUTO_INCREMENT,
  Data DATE NOT NULL,
  Hora TIME NOT NULL,
  Paciente_id INT NOT NULL,
  Medico_id VARCHAR(45) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (Paciente_id)REFERENCES Paciente (id),
  FOREIGN KEY (Medico_id)REFERENCES Medico (id));


CREATE TABLE Prontuario (
  id INT NOT NULL AUTO_INCREMENT,
  Diagnostico TEXT ,
  Consulta_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (Consulta_id)REFERENCES Consulta (id));


