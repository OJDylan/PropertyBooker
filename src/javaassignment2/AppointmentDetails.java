package javaassignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AppointmentDetails extends Appointment{
    private String appDate;
    private String tenant;
    private int propertyId;
    private String propertyName;
    
    public AppointmentDetails(int appid, String date, String ten, String pname){
        appDate = date;
        tenant = ten;
        propertyName = pname;
        super.appId = appid;
    }
    
    public void getID(){
        try {
            //Create statement to connect to the database
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_NAME = " + "'" + propertyName + "'";
            ResultSet rs = s.executeQuery(sql);
   
            while(rs.next()){
                propertyId = Integer.parseInt(rs.getString("PROPERTY_ID"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Updates to SQL database
    public void confirmAppointment(){
        Agent a = new Agent();
        try {
            //Create statement to connect to the database
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            
            //Variable for SQL command
            String update ="INSERT INTO APPOINTMENT " + "VALUES(" +
                    super.appId + "," +
                    "'" + a.agentName + "'" + "," +
                    "'" + tenant + "'" + "," +
                    propertyId + "," +
                    "'" + propertyName + "'" + "," +
                    "'" + appDate + "'" + ")";
            
            //Executes sql satement
            s.executeUpdate(update);
            
            //Shows create successful message
            JOptionPane.showMessageDialog(null, "Report Created!");
        } catch(SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Appointment ID already exists, please input a different ID.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Report Creation failed. Please try again");
            Logger.getLogger(AppointmentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}