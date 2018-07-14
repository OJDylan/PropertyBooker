package javaassignment2;

import java.sql.Time;
import java.util.Date;

public class AppointmentDetails extends Appointment{
    private Date appDate;
    private Time appTime;
    private String tenant;
    private int propertyId;
    private String propertyName;
    
    public AppointmentDetails(int appid, int agentid,Date date, Time time, String ten, int pid, String pname){
        appDate = date; 
        appTime = time; 
        tenant = ten;
        propertyId = pid;
        propertyName = pname;
        super.agentId = agentid;
        super.appId = appid;
    }
    
    public void confirmAppointment(){
        //Updates to SQL database
        
    }
    
}