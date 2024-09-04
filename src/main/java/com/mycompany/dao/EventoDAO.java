/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.login.VisualizarEvento;
import com.mycompany.telas.TelaInicial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class EventoDAO {
    public void cadastrarEvento(String empresa, String data_evento, String horario_inicio, String horario_termino, String desc_evento) throws SQLException {
        Connection conexao = new ModConexao().getConnection();
        String sql = "INSERT INTO TB_EVENTOS(empresa, data_evento, horario_inicio, horario_termino, desc_evento) VALUES ('"+empresa+"','"+data_evento+"','"+horario_inicio+"','"+horario_termino+"','"+desc_evento+"')";
        System.out.println(sql);
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();  
        conexao.close();  
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
     } 

    
        public VisualizarEvento[] obterEvento() throws SQLException {
        String sql = "select * from TB_EVENTOS;";
        try (Connection conexao = new ModConexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); 
                ResultSet rs = ps.executeQuery();) {
                
            int totalDeEventos = rs.last() ? rs.getRow(): 0;
            VisualizarEvento[] eventos = new VisualizarEvento[totalDeEventos];
            rs.beforeFirst();
            int contador = 0;
                while (rs.next()) {
                    
                    String empresa = rs.getString("empresa");
                    String data_evento = rs.getString("data_evento");
                    String horario_inicio = rs.getString("horario_inicio");
                    String horario_termino = rs.getString("horario_termino");
                    String desc_evento = rs.getString("desc_evento");
                    

                    eventos[contador++] = new VisualizarEvento(empresa, data_evento, horario_inicio, horario_termino, desc_evento);
                }
                 return eventos ;
            }
    }
}

