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
    
    public void verifyLogin(String name, String pass){
        try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql = "SELECT * FROM BUYER";
                ResultSet rs = s.executeQuery(sql);
            
                while(rs.next()) {
                    if (rs.getString("USERNAME").equals(name)) {
                        if(rs.getString("PASSWORD").equals(pass)){
                            PropertyPage property = new PropertyPage();
                            property.run();
                        }
                        // Have some error message if username or password doesn't exist
                    }    
                }
            } catch (SQLException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}