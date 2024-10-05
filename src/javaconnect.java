/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyPC
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;//means the reference to connection object is deleted
    public static Connection ConnecrDb()
    {
         try
         {
             Class.forName("org.sqlite.JDBC");
             Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\man93\\Documents\\NetBeansProjects\\Bank_managment_system\\Bank.db");
             return conn;
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         }
         return null;
    }
    
}
