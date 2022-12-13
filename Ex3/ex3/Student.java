/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author admin
 */
public class Student {
    private int id;
    private  String studentName;
    private String studentId;
    private int dob;
    private String studentClass;
    private String studentSchool;

    public Student(int id, String studentName, String studentId, int dob, String studentClass, String studentSchool) {
        this.id = id;
        this.studentName = studentName;
        this.studentId = studentId;
        this.dob = dob;
        this.studentClass = studentClass;
        this.studentSchool = studentSchool;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

   

   
    public void display() {
        System.out.printf("%-5s%-15s%-15s%-15s%-10s%-10s\n",getId(), getStudentName(),getStudentId (),getDob(),
         getStudentClass(),getStudentSchool() );
       
        
                       
    }
    
}
