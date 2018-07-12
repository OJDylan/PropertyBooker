package javaassignment2;

import java.sql.Time;
import java.util.Date;

public class AppointmentDetails extends Appointment{
    private Date bookingDate;
    private Time bookingTime;
    
    public AppointmentDetails(int bid, int aid) {
        super(bid, aid);
    }
    
    public void changeDate(){
        //Updates the date of appointment ONLY
    }
    
}
