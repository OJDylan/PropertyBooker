package javaassignment2;

public class Agent extends User{
    private int agentId;
    private String agentName;
    
    public Agent(){
        
    }
    
    public Agent(int id, String name){
        agentId = id;
        agentName = name;
    }
    
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
        
    }
    
}