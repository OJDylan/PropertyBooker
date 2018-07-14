package javaassignment2;

public class Agent extends User{
    public String agentId;
    public String agentName;
    
    public Agent(){
        
    }
    
    //Constructor with 1 parameter
    public Agent(String name){
        agentName = name;
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
        System.out.print(agentName);
    }
    
}