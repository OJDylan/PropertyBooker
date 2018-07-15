package javaassignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class User{
    public String userName;
    public String userPass;
    
    public boolean verifyUserLogin(String uname, String upass){
        try {
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM BUYER";
            ResultSet rs = s.executeQuery(sql);

            while(rs.next()) {
                if (rs.getString("USERNAME").equals(uname)) {
                    if(rs.getString("PASSWORD").equals(upass)){
                        return true;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUILogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean verifyAdminLogin(String aname, String apass){
        try {
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM AGENT";
            ResultSet rs = s.executeQuery(sql);

            while(rs.next()) {
                if (rs.getString("AGENT_NAME").equals(aname)){
                    if(rs.getString("AGENT_PASSWORD").equals(apass)){
                        return true;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUILogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Overloaded methods
    //Manual register
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
}