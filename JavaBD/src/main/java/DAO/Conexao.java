/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Conexao {
    public Connection conectaBD(){
    
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost/banco?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException SQLe) {
            
            JOptionPane.showMessageDialog(null, SQLe.getMessage());
        }
        return conn;
    }
    
    
}
