 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SPCIS
 */
import java.sql.Array;
import java.sql.*;
import javax.swing.*;


public class Connect {
 Connection con = null; 
    ResultSet rs = null;
    PreparedStatement pst = null;

    public static Connection ConnectDB(){
        
   try
   {
       Connection con = DriverManager.getConnection("jdbc:ucanaccess://DB.accdb");
       return con;
   }
   catch (Exception e)
   {
        JOptionPane.showMessageDialog(null, e);
   }
   return null;
    }
}
