package javaassignment2;

public class Agent extends User{
    public String agentId;
    public static String agentName;
    
    //Constructor to call only
    public Agent(){
        
    }

    //Constructor with 1 parameter
    public Agent(String name){
        agentName = name;
        
    }
    
    @Override
    public void login(){
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