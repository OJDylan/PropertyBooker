package javaassignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agent extends User{
    public String agentId = null;
    private String agentName = null;
    
    //Constructor without parameters
    public Agent(){
        
    }
    
    //Constructor with 1 parameter
    public Agent(String name){
        agentName = name;
        try {
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM AGENT WHERE AGENT_NAME = " + "'" + agentName + "'";
            ResultSet rs = s.executeQuery(sql);

            while(rs.next()) {
                agentId = rs.getString("AGENT_ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUILogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void login(){
        GUIAdminPage ap = new GUIAdminPage();
        ap.run();
    }
    
    public void createReport(){
        GUIAppointmentReport ar = new GUIAppointmentReport();
        ar.run();
    }
     
    public void editProperty(){
        
    }
    
    //Test
    public void display(){
        System.out.println(agentName);
        System.out.println(agentId);
    }
    
}