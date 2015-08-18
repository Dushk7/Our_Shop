/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Toshiba
 */
public class DB {
    
    static Connection c;
    public static void createMyConnection()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/newsoft", "root", "admin");
    }
    public static void iud(String sql)throws  Exception{
        if(c==null){
            createMyConnection();
        }
        c.createStatement().executeUpdate(sql);
    }
    public static ResultSet search(String sql)throws Exception{
        if(c==null){
            createMyConnection();
        }
        return c.createStatement().executeQuery(sql);
    }
    
}
