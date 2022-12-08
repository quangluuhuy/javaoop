/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

import java.util.ArrayList;

import java.util.List;


/**
 *
 * @author admin
 */
public class Managing {

    public Validation validation = new Validation();
    ArrayList<Student> students;

    public Managing(ArrayList<Student> students) {
        this.students = students;
    }

    public   int showMenuAndChoice() {

        System.out.println("===================Student Management==================");
        System.out.println("1. Add student\n"                
                + "2. Search  student\n"
                + "3. Delete student\n"
                + "4. Display student\n"
                + "5. Exit"
        );
        int choice = validation.checkInt("Enter your choice: ", 1, 5);
        return choice;
    }
   
    public void addStudent() {
        System.out.println("====================Add Task=========================");
        int id;
        if (students.isEmpty()) {
            id = 1;
        } else {
            id = students.get(students.size() - 1).getId() + 1;
        }
        String name = validation.checkInputString("Enter Studentname: ");
        String stduentId = validation.checkInputString("Enter StudentId: ");
        int age = validation.checkInt("Enter age: ", 1, Integer.MAX_VALUE);
        String className = validation.checkInputString("Enter class: ");
        String schoolName = validation.checkInputString("Enter school: ");

        students.add(new Student(id, name, stduentId,age,className,schoolName));
        System.out.println("Add Successful!");
    }

    

    public void searchStudentByName() {
        String searchName = validation.checkInputString("Enter the name you want to search for: ");
        List<Student> result = searchInformationByName(searchName);
        displayAllStudent(result);

    }

    private List<Student> searchInformationByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudentName().toLowerCase().contains(name.toLowerCase())) {
                result.add(student);
            }
        }
        return result;
    }
    
   
    
    public void deleteStudentById() {
        if (students.isEmpty()) {
            System.err.println("List Task Empty! You must add task first");
        } else {
            System.out.println("=============Delete student===========");
            int id = validation.checkInt("Enter the Id you want to search for:  ", 1, Integer.MAX_VALUE);
            if (validation.isIdExists(students, id) == null) {
                System.err.println("ID Not found! ");
            } else {
                Student student = validation.isIdExists(students, id);
                students.remove(student);
                System.out.println("Remove success");
            }
        }
    }

    public void displayAllStudent(List<Student> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("");
            System.err.println("List is still empty!");

        } else {
            System.out.printf("%-5s%-15s%-15s%-15s%-10s%-10s\n", "ID", "Name", "StudentID", "Age",
                    "Class","School");
            for (Student student : students) {
                student.display();
            }
        }
    }

   

}
