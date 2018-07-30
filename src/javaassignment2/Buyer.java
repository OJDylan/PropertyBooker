package javaassignment2;

import javaassignment2.GUIForms.GUILogIn;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

public class Buyer extends User{
    public String buyerFName;
    public String buyerLName;
    private String hpNum;
    private String email;
    
    //Constructor to call class
    public Buyer(){
        
    }
    
    //Overloaded constructor to initialize values when called
    public Buyer(String fname, String lname, String uname, String pass, String hpnum, String em){
        buyerFName = fname;
        buyerLName = lname;
        hpNum = hpnum;
        email = em;
        super.userName = uname;
        super.userPass = pass;
    }
    
    //Register from register page
    public void register(){
        try {
            //Create statement to connect to the database
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            
            //Variable for SQL command
            String update ="INSERT INTO BUYER " + "VALUES(" +
                        "'" + super.userName + "'" + "," +
                        "'" + super.userPass + "'" + "," +
                        "'" + buyerFName + "'" + "," +
                        "'" + buyerLName + "'" + "," +
                        "'" + hpNum + "'" + "," +
                        "'" + email + "'" + ")";
            
            //Executes sql satement
            s.executeUpdate(update);
            
            //Shows register successful message
            JOptionPane.showMessageDialog(null, "Account successfully created!");
            
        } catch (SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Username already exists, please try again.");
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed to create account, please try again");
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            
        } catch (SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Username already exists, please try again.");
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed to create account, please try again");
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void login(){
        GUILogIn li = new GUILogIn();
        li.run();
    }
    
}