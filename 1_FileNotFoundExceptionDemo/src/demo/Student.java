package demo;

public class Student {

    private int id;
    private String prog;
    private double gpa;

    public Student(int id, String prog, double gpa) {
        this.id = id;
        this.prog = prog;
        this.gpa = gpa;
    }

    public String format() {
        return "Student ID = " + id + ", Program = " + prog + ", GPA = " + gpa;
    }
    
    
}
