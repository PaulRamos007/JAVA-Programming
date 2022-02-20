/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListAssignment;

import java.util.Objects;

/**
 *
 * @author paula
 */
public class Student {

    private int id;
    private String faculty;
    private double gpa;
    private String f;
    private String g;

    public Student(int id, String faculty, double gpa, String f, String g) {
        this.id = id;
        this.faculty = faculty;
        this.gpa = gpa;
        this.f = f;
        this.g = g;
    }

    @Override
    public String toString() {
        String result = "";

        result += "ID = " + id;
        result += ", FACULTY = " + faculty;
        result += ", GPA = " + gpa;
        result += "";
        if (f.length() > 0){
            result += "[" + f + "]";
        }
        if (g.length() > 0){
            result += "[" + g + "]";
        }

        return result;
    }

    public String getF() {
        return f;
    }

    public String getG() {
        return g;
    }

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() == o.getClass()) {
            Student anotherStudent = (Student) o;
            if (this.id == anotherStudent.id
                    && this.faculty.equals(anotherStudent.faculty)
                    && this.gpa == anotherStudent.gpa) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, faculty, gpa);
    }
}
