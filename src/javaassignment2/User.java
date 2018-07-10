package javaassignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                    // Have some error message if username or password doesn't exist
                }    
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            
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
                    // Have some error message if username or password doesn't exist
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}