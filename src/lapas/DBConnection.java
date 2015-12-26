/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP14
 */
public class DBConnection {
    private static Connection DBConnection;
    public static Connection koneksiDB() throws SQLException{
        if(DBConnection==null){
            try{
                String url="jdbc:mysql://localhost:3306/lapas";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                DBConnection = (Connection) DriverManager.getConnection(url,user,pass);
                JOptionPane.showMessageDialog(null, "YES!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return DBConnection;
        }
        
    
    
}
