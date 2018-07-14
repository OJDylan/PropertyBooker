package javaassignment2;

import java.sql.Time;
import java.util.Date;

public class AppointmentDetails extends Appointment{
    private Date appDate;
    private Time appTime;
    private String tenant;
    private int propertyId;
    private String propertyName;
    
    
    public AppointmentDetails(int bid, int aid) {
        super(bid, aid);
    }
    
    public void changeDate(){
        //Updates the date of appointment ONLY
    }
    
}
