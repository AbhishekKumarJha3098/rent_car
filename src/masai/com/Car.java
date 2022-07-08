package masai.com;

import java.util.ArrayList;

public class Car {
	
	private int ID;
    private String Maker, Name, Colour, Type;
    int SeatingCapacity;
    String Model, Condition, RegNo;
    private int RentPerHour;
    private CarOwner carOwner;
    
    // Costructor
    // Getter & Setter
    // toString
    
    public void Add() {
        ArrayList<Car> car = Car.View();
        
    }
    
    
    public void Update() {
        ArrayList<Car> car = Car.View();
    }
    
    public void Remove() {
        ArrayList<Car> car = Car.View();
    }
    
    public static ArrayList<Car> SearchByName(String name) {
        
    }
    
    public static Car SearchByID(int id) {
        
    }
    
    public static Car SearchByRegNo(String regNo) {
        
    }
    
    
    public static ArrayList<Car> View() {
        
    }
    
    public static boolean isNameValid(String Name) {
        
    }


    public static boolean isRegNoValid(String RegNo) {
        
    }
    
    public boolean isRented() {
        
    }
    

}
