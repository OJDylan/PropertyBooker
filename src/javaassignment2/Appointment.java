//Class called from AppointmentReport class

package javaassignment2;

public class Appointment extends Buyer{
    public int appId;
    public int agentId;
    
    public Appointment(int apid, int aid){
        //Get from counter
        appId = apid;
        //Get from database?
        agentId = aid;
    }
    
    public void confirmAppointment(){
        //updates to SQL
        
    }
    
}