/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Utilitarios.Metodos;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ModeloMedico implements Metodos {

    Conexao conec = new Conexao();
    Medico medico = new Medico();

    @Override
    public String salvar(Object ob) {
        Medico med = (Medico) ob;
        conec.Conexao();
        try {
            PreparedStatement pst = conec.conn.prepareStatement("INSERT INTO medicos(nome,sobrenome,endereco,dataNascimento,telefone,crm,especializacao) values(?,?,?,?,?,?,?)");
            pst.setString(1, med.getNome());

            pst.setString(2, med.getSobrenome());
            pst.setString(3, med.getEndereco());
            pst.setString(4, med.getDataNascimento());
            pst.setString(5, med.getTelefone());
            pst.setString(6, med.getCrm());
            pst.setString(7, med.getEspecialização());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Inserido com sucesso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir medico" + e);
        }
        conec.desconectar();
        return null;
    }

    @Override
    public String buscar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String editar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
