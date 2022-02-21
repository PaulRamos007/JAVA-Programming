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
public class HW8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person;
        person = new Person("Paul", "Ramos", "122 Cameron, Moncton, NB", "paul.ramos@nbcc.ca");
        person.display();

        System.out.println("------------------");

        Employee employee;
        employee = new Employee(777, "ITPA", 2000000, "Abigail", "Ramos", "1234 Cameron, Moncton, NB", "elisha@gmail.com");
        employee.display();
    }

}
