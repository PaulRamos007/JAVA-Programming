/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework1;
import java.util.Scanner;
/**
 *
 * @author paula
 */
public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Course 1");
        Homework1.gradeInput();
        
        System.out.println("Course 2");
        Homework1.gradeInput();
        
        System.out.println("Course 3");
        Homework1.gradeInput();
        
        System.out.println("Course 4");
        Homework1.gradeInput();
    }
    
    public static void gradeInput(){
    Scanner myScan = new Scanner(System.in);
    
    System.out.println("Enter your grade");
    
    boolean check = myScan.hasNextInt();
    int grade = myScan.nextInt();
    
    System.out.println(grade);
    System.out.println(check);
    }
    
}
