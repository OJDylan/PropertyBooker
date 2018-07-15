package javaassignment2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Property {
    public int propertyId;
    private String propertyName;
    private String propertyType;
    private boolean propertyStatus;
    private String propertyPrice;
    private char propertyTenure;
    
    public Property(int id, String name, String type, boolean status, String price, char tenure){
        propertyId = id;
        propertyName = name;
        propertyType = type;
        propertyStatus = status;
        propertyPrice = price;
        propertyTenure = tenure;
    }
    
    public Property(String name, String price, boolean status){
        propertyName = name;
        propertyStatus = status;
        propertyPrice = price;
    }
    
    public void updateProperty(){
        //SQL statement to update existing properties
//        try {
//            //Create statement to connect to the database
//            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
//            
//            //Variable for SQL command
//            String update ="INSERT INTO BUYER " + "VALUES(" +
//                    "'" + super.userName + "'" + "," +
//                    "'" + super.userPass + "'" + "," +
//                    "'" + buyerFName + "'" + "," +
//                    "'" + buyerLName + "'" + "," +
//                    "'" + hpNum + "'" + "," +
//                    "'" + email + "'" + ")";
//            
//            //Executes sql satement
//            s.executeUpdate(update);
//            
//            //Shows register successful message
//            JOptionPane.showMessageDialog(null, "Account successfully created!");
//        } catch (SQLException ex) {
//            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
//        }    
    }
    
}
