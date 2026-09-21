package org.sistema.cadastro.database;

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/cadastro";
            String user = "root";
            String password = "";

            return DriverManager.getConnection(url, user, password);
        }catch (Exception e){
            throw new RuntimeException("erro na conexao" + e.getMessage());
        }
    }
}
