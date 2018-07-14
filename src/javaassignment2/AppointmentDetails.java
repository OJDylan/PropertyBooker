package javaassignment2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AppointmentDetails extends Appointment{
    private Date appDate;
    private String tenant;
    private int propertyId;
    private String propertyName;
    
    public AppointmentDetails(int appid, Date date, String ten, int pid, String pname){
        appDate = date;
        tenant = ten;
        propertyId = pid;
        propertyName = pname;
        super.appId = appid;
    }
    
    //Updates to SQL database
    public void confirmAppointment(){
        try {
            //Create statement to connect to the database
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            
            //Variable for SQL command
            String update ="INSERT INTO APPOINTMENT " + "VALUES(" +
                    "'" + super.appId + "'" + "," +
                    "'" + super.agentId + "'" + "," +
                    "'" + super.agentId + "'" + "," +
                    "'" + tenant + "'" + "," +
                    "'" + propertyId + "'" + "," +
                    "'" + propertyName + "'" + "," +
                    "'" + appDate + "'" + ")";
            
            //Executes sql satement
            s.executeUpdate(update);
            
            //Shows register successful message
            JOptionPane.showMessageDialog(null, "Report Created!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "FAILED!");
            Logger.getLogger(AppointmentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}