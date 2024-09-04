/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.dao.LoginDAO;
import com.mycompany.dao.EventoDAO;
import com.mycompany.dao.ModConexao;
import com.mycompany.telas.TelaCadastro;
import com.mycompany.telas.TelaCadastroEvento;
import com.mycompany.telas.TelaInicial;
import com.mycompany.telas.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author rafae
 */
public class Controller {

    public void cadastroUsuario(TelaCadastro view) throws SQLException{
        
        Connection conexao = new ModConexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getTxtCadastroUsuario().getText(),view.getTxtCadastroIdade().getText(),view.getTxtCadastroGenero().getText(),view.getTxtCadastroEmail().getText(),view.getTxtCadastroCpf().getText(), view.getTxtCadastroSenha().getText());  
    }
    
     public void loginUsuario(TelaLogin view) throws SQLException{
        
        Connection conexao = new ModConexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.Login(view.getTxtUsuario().getText(), view.getTxtSenha().getText());
    }

    public void cadastroEvento(TelaCadastroEvento view) throws SQLException {
       Connection conexao = new ModConexao().getConnection();
       EventoDAO cadastro = new EventoDAO();
       cadastro.cadastrarEvento(view.getTxtCadastroEmpresa().getText(), view.getTxtCadastroData_evento().getText(), view.getTxtCadastroHorario_inicio().getText(), view.getTxtCadastroHorario_termino().getText(), view.getTxtCadastroDesc_evento().getText());
    }
    
    public void visualizarEvento(TelaInicial view) throws SQLException{
       Connection conexao = new ModConexao().getConnection();
       EventoDAO visualizar = new EventoDAO();
    }
}
