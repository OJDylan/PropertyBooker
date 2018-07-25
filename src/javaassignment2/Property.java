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
    private String propertySR;
    
    public Property(int id, String name, String type, boolean status, String price, char tenure){
        propertyId = id;
        propertyName = name;
        propertyType = type;
        propertyStatus = status;
        propertyPrice = price;
        propertyTenure = tenure;
    }
    
    public Property(int id, String name, String price, boolean status, String sor){
        propertyId = id;
        propertyName = name;
        propertyStatus = status;
        propertyPrice = price;
        propertySR = sor;
    }
    
    public void updateProperty(){
        //SQL statement to update existing properties
        System.out.println(propertyId);
        try {
            //Create statement to connect to the database
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            
            //Variable for SQL command
            String update ="UPDATE PROPERTY " + "SET " +
                           "PROPERTY_NAME = " + "'" + propertyName + "'" + "," +
                           "PROPERTY_PRICE = " + Double.parseDouble(propertyPrice) + "," +
                           "PROPERTY_STATUS = " + propertyStatus + "," +
                           "SALE_RENT = " + "'" + propertySR + "'" + " " +
                           "WHERE PROPERTY_ID = " + propertyId;
            
            //Executes sql satement
            s.executeUpdate(update);
            
            //Shows register successful message
            JOptionPane.showMessageDialog(null, "Update successful!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Failed");
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
}
