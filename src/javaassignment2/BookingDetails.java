package javaassignment2;

import java.util.Date;

public class BookingDetails extends Booking{
    private Date bookingDate;
    private Date bookingTime;
    
    public BookingDetails(int bid, int aid) {
        super(bid, aid);
    }
    
    public void changeDate(){
        //Updates the date of appointment ONLY
    }
    
}
