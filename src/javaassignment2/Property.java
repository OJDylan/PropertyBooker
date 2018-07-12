package javaassignment2;

public class Property {
    public int propertyId;
    private String propertyName;
    private String propertyType;
    private boolean propertyStatus;
    private double propertyPrice;
    private char propertyTenure;
    
    public Property(int id, String name, String type, boolean status, double price, char tenure){
        propertyId = id;
        propertyName = name;
        propertyType = type;
        propertyStatus = status;
        propertyPrice = price;
        propertyTenure = tenure;
    }
    
    public void updateProperty(){
        //SQL statement to update existing properties
    }
}
