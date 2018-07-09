package javaassignment2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class User {
    public String userName;
    public String userPass;
    
    //Hard-coded register
    public void register(String fname, String lname, String uname, String pass, String hpnum, String em){
        try {
            //Create statement to connect to the database
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            
            //Variable for SQL command
            String update ="INSERT INTO BUYER " + "VALUES(" +
                        "'" + uname + "'" + "," +
                        "'" + pass + "'" + "," +
                        "'" + fname + "'" + "," +
                        "'" + lname + "'" + "," +
                        "'" + hpnum + "'" + "," +
                        "'" + em + "'" + ")";
            
            //Executes sql satement
            s.executeUpdate(update);
            
            //Shows register successful message
            JOptionPane.showMessageDialog(null, "Account successfully created!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed to create account, please try again");
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void verifyLogin(){
        
    }
    
}