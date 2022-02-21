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
public class Employee extends Person {

    private int employeeId;
    private String department;
    private int salary;

    public Employee(int employeeId, 
            String department, 
            int salary, 
            String FirstName, 
            String LastName, 
            String Address, 
            String Email) {
        super(FirstName, LastName, Address, Email);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void display(){
        System.out.println("First Name : "+this.FirstName);
        System.out.println("Last Name : "+this.LastName);
        System.out.println("Address : "+this.Address);
        System.out.println("Employee ID: "+this.employeeId);
        System.out.println("Department : "+this.department);
        System.out.println("Salary : "+this.salary);
    }

    @Override
    public String toString() {
        return super.toString() 
                + "\nEmployee Id: " + Integer.toString(employeeId) 
                + "\nDepartment: " + department 
                + "\nSalary: " + Integer.toString(salary);
    }
   
}
