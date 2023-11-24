package br.g12.duque.cassiano.gestor;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 08087
 */
public class Conexao {
    public static final String USERNAME = "root"; // CONSTANTE
    public static final String PASSWORD = "usbw";
    public static final String DBNAME = "gestor";
    public static final String SERVER = "jdbc:mysql://localhost:3306";
    public static final String DRIVER = "";
    
        // Método que realiza a conexão com o banco de dados
    public static Connection getConnection(){
        Connection conn = null;
        String message = "";
        //tratamento  de execuçoes em java 
        try{
            conn = DriverManager.getConnection(SERVER + "/" + DBNAME, USERNAME, PASSWORD );
            message = "Conexão feita";
        }catch(SQLException ex){
            System.out.print("Erro ao conectar com o banco ");
            message = "Conexão não feita";
            ex.printStackTrace();
        }
        
        System.out.println(message);
        return conn;
        
    }

    
}
