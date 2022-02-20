/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework6;

import java.util.Objects;

/**
 *
 * @author paula
 */
public class Student {
    private String id;
    private String faculty;
    private String gpa;

    public Student(String id, String faculty, String gpa) throws StudentException {
        if("Basket Weaving".equals(faculty)){
            throw new StudentException(id+","+faculty+","+gpa+": '"+faculty + "' Is not a valid program" +"\n");
        }
        if(Double.parseDouble(gpa) > 4 || Double.parseDouble(gpa) < 0)
        {
        throw new StudentException(id+","+faculty+","+gpa+": '"+gpa +"' Is not a valid GPA"+"\n" );
        } 
        this.id = id;
        this.faculty = faculty;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String result = "";

        result += "ID = " + id;
        result += ", FACULTY = " + faculty;
        result += ", GPA = " + gpa;

        return result;
    }

    public String getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGpa() {
        return gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.faculty);
        hash = 23 * hash + Objects.hashCode(this.gpa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.faculty, other.faculty)) {
            return false;
        }
        if (!Objects.equals(this.gpa, other.gpa)) {
            return false;
        }
        return true;
    }

   
}
