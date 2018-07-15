package javaassignment2;

import javax.swing.JOptionPane;

public class Agent extends User{
    public String agentId;
    public String agentName;
    
    //Constructor to call only
    public Agent(){
        
    }

    //Constructor with 1 parameter
    public Agent(String name){
        agentName = name;
    }
    
    public void login(){
        JOptionPane.showMessageDialog(null, agentName);
        GUIAdminPage ap = new GUIAdminPage();
        ap.run();
    }
    
    public void createReport(){
        GUIAppointmentReport ar = new GUIAppointmentReport();
        ar.run();
    }
     
    public void editProperty(){
        GUIEditProperty ep = new GUIEditProperty();
        ep.run();
    }
    
}