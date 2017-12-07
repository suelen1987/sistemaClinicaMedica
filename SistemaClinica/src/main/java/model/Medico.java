/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Utilitarios.Pessoa;

/**
 *
 * @author usuario
 */
public class Medico extends Pessoa {

    private String crm;
    private String especialização;

    public Medico() {
        super(null, null, null, null, null, null);
    }

    public Medico(String crm, String especialização, String nome, String sobrenome, String endereco, String dataNascimento, String telefone, String pesquisa) {
        super(nome, sobrenome, endereco, dataNascimento, telefone, pesquisa);
        this.crm = crm;
        this.especialização = especialização;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }


}
