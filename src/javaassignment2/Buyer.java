package javaassignment2;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

public class Buyer extends User{
//    private int buyerId;
    private String buyerFName;
    private String buyerLName;
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
    
    public void register(){
        try {
            //Create statement to connect to the database
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            
            //Store sql statements into a variable
            String sql ="INSERT INTO BUYER " + "VALUES(" +
                        "'" + super.userName + "'" + "," +
                        "'" + super.userPass + "'" + "," +
                        "'" + buyerFName + "'" + "," +
                        "'" + buyerLName + "'" + "," +
                        "'" + hpNum + "'" + "," +
                        "'" + email + "'" + ")";        
            
            //Executes sql satement
            s.executeUpdate(sql);
            
            //Shows register successful message
            JOptionPane.showMessageDialog(null, "Account successfully created!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed to create account, please try again");
            Logger.getLogger(Buyer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void login(){
        LogIn li = new LogIn();
        li.run();
    }
    
}