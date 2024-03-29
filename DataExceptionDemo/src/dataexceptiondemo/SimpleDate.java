/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataexceptiondemo;

/**
 *
 * @author paula
 */
public class SimpleDate {
    
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "SimpleDate{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }
    
    public SimpleDate(int year, int month, int day) throws DateException{
        if (year < 1) {
            throw new DateException("Invalid Year");
        }
        if (month < 1 || month > 12) {
            throw new DateException("Invalid Month");
        }
        if (day < 1 || day > 31) {
            throw new DateException("Invalid Day");
        }
        if (month == 4 || month == 9 || month == 11) {
            if (day > 30) {
                throw new DateException("Invalid Day");
            }
        }
        if (month == 2) {
            if (day > 28 + (isLeapYear() ? 1 : 0)) {
                throw new DateException("Invalid Day");
            }
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    private boolean isLeapYear(){
        boolean res;
        
        if (year % 400 == 0) {
            res = true;
        }else if (year % 100 == 0) {
            res = false;
        }else if (year % 4 == 0) {
            res = true;
        }else{
            res = false;
        }
        return res;
    }
}


