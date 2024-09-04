/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.*;

/**
 * @author rafae
 */

public class ModConexao {
   public Connection getConnection() throws SQLException{
       Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_BITFLY", "root", "admin");
       return conexao;
   }   
}