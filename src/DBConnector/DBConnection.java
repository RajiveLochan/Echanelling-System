/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajive Lochchan
 */
public class DBConnection {

    Connection con;
    
    public Connection geConnection(){
    try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:RajiveDB");
    
    }catch(Exception ex){
    
    JOptionPane.showMessageDialog(null, "Error in connecting database    "+ex);
    
    
    }
    return con;
}
}
