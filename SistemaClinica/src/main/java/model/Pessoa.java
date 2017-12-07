/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 *
 * @author usuario
 */
public class Pessoa {

    String nome;
    String sobrenome;
    String endereco;
    String dataNascimento;
    String telefone;
    String pesquisa; //variavel para pesquisa

    public Pessoa(String nome, String sobrenome, String endereco, String dataNascimento, String telefone, String pesquisa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.pesquisa = pesquisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

}
