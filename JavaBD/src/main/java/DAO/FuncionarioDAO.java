/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
    
    public void cadastrarFuncionario(FuncionarioDTO funcionariodto){
        String sql = "insert into tabela(nome, cidade) values(?,?)";
        
        Connection conn = new Conexao().conectaBD();
        
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionariodto.getNomeFuncionario());
            pstm.setString(2, funcionariodto.getCidadeFuncionario());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, erro);
        }
    
    }
    
    public void deletarFuncionario(FuncionarioDTO funcionariodto){
        String sql = "DELETE * FROM tabela WHERE id = ?";
        
        Connection conn = new Conexao().conectaBD();
        
        try {
           PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.setString(1,funcionariodto.getId());
           
           pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    
}
