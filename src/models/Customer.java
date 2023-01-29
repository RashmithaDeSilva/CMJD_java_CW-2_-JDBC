/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author lahiru (PK) 
 */
public class Customer {
    
    private String ID;
    private String name;
    private String address;
    private double salary;
    
    // Constractors
    public Customer() {}
    public Customer(String ID) {
        this.ID = ID;
    }
    public Customer(String ID, String name, String address, double salary) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    
    // Get Mothods
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public double getSalary() {
        return salary;
    }
    
    // Set Mothods
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
