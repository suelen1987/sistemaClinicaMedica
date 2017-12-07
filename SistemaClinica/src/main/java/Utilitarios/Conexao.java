/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Conexao {

//    Variaveis de Pesquisa
//    STM
//    RS
    public Statement stm;
    public ResultSet rs;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost/clinica?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static Connection conn = null;

    public void Conexao() {
        Conectar();
    }

    private Connection Conectar() {
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
//            JOptionPane.showMessageDialog(null, "Conectado com sucesso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar: " + e);

        }
        return null;
    }
    //CONCUR_READ_ONLY = Percorre tanto do inicio para o fim como do fim para o inico
    // TYPE_SCROLL_INSENSITIVE = diferencia letra maiuscula de letra minuscula

    public void executaSql(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar: " + e);
        }
    }
}
