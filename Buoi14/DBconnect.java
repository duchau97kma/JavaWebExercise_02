/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Winter
 */
public class DBconnect {
    public Connection getConnection() throws SQLException {
        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String conStr = "jdbc:mysql://localhost:3307/qlythuvien";
            conn = DriverManager.getConnection(conStr, "root", "anhhaubk97");
//            if(conn!=null){
//            System.out.println("Connect successfull!");
       // }
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
        return conn;  
    }
}
