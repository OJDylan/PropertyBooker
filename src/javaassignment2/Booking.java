package javaassignment2;

public class Booking extends Buyer{
    public int bookingId;
    public int agentId;
    
    public Booking(int bid, int aid){
        bookingId = bid;
        agentId = aid;
    }
    
    public void confirmBooking(){
        //updates to SQL
        
    }
}
