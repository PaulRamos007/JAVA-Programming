/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw8;

/**
 *
 * @author paula
 */
public class Person {

    public String FirstName;
    public String LastName;
    public String Address;
    public String Email;

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Person(String FirstName, String LastName, String Address, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Email = Email;
    }

    public void display() {
        System.out.println("First Name : " + this.FirstName);
        System.out.println("Last Name : " + this.LastName);
        System.out.println("Address : " + this.Address);
        System.out.println("Email : " + this.Email);
    }

    @Override
    public String toString() {
        return "FirstName: " + getFirstName()
                + "\nLastName: " + getLastName()
                + "\nAddress: " + this.Address
                + "\nEmail: " + getEmail();
    }

}
