/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/**
 *
 * @author admin
 */
public class Managing {

    public Validation validation = new Validation();
    List<Student> students;

    public Managing(List<Student> students) {
        this.students = students;
    }

    public int showMenuAndChoice() {

        System.out.println("===================Student Management==================");
        System.out.println("1. Add student\n"
                + "2. Search  student\n"
                + "3.Display the information of student you've just input\n"
                + "4. Update student\n"
                + "5. Delete student\n"
                + "6. Display student\n"
                + "7. Exit"
        );
        int choice = validation.checkInt("Enter your choice: ", 1, 7);
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
        int dateOfBirth = validation.checkInt("Enter dateOfBirth: ", 1, Integer.MAX_VALUE);
        String className = validation.checkInputString("Enter class: ");
        String schoolName = validation.checkInputString("Enter school: ");
 
        students.add(new Student(id, name, stduentId, dateOfBirth, className, schoolName));
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

    public void getId(int choice) {
        if (students.isEmpty()) {
            System.err.println("List Task Empty! You must add task first");
        } else {
            if (choice == 4) {
                updateStudentById();
            } else if (choice == 5) {
                deleteStudentById();
            }

        }
    }

    public void updateStudentById() {

        System.out.println("=============Update student===========");
        int id = validation.checkInt("Enter the Id you want to update for:  ", 1, Integer.MAX_VALUE);
        if (validation.isIdExists((ArrayList<Student>) students, id) == null) {
            System.err.println("ID Not found! ");
        } else {
            for (Student student : students) {

                
               
                String nameUpdate = validation.checkInputString("Enter name update: ");
                student.setStudentName(nameUpdate);
                String studentIdUpdate = validation.checkInputString("Enter studentId update: ");
                student.setStudentId(studentIdUpdate);
                int dobUpdate = validation.checkInt("Enter dob update: ", 1, Integer.MAX_VALUE);
                student.setAge(dobUpdate);
                String classUpdate = validation.checkInputString("Enter class update: ");
                student.setStudentClass(classUpdate);
                String schoolUpdate = validation.checkInputString("Enter shcool update: ");
                student.setStudentSchool(schoolUpdate);

            }
        
    }
    }
    public void displayRecentlyStudent () {
        Student result = getRecentlyEnteredInformation();
        if (result != null) {
            displayAllStudent(Arrays.asList(result));
        }
    }

    private Student getRecentlyEnteredInformation() {
        if (students.isEmpty()) {
            return null;
        } else {
            return students.get(students.size() - 1);
        }

    }
    public void deleteStudentById() {

        System.out.println("=============Delete student===========");
        int id = validation.checkInt("Enter the Id you want to delete for:  ", 1, Integer.MAX_VALUE);
        if (validation.isIdExists((ArrayList<Student>) students, id) == null) {
            System.err.println("ID Not found! ");
        } else {
            Student student = validation.isIdExists((ArrayList<Student>) students, id);
            students.remove(student);
            System.out.println("Remove success");
        }
    }

    public void displayAllStudent(List<Student> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("");
            System.err.println("List is still empty!");

        } else {
            System.out.printf("%-5s%-15s%-15s%-15s%-10s%-10s\n", "ID", "Name", "StudentID", "Age",
                    "Class", "School");
            for (Student student : students) {
                student.display();
            }
        }
    }

}
