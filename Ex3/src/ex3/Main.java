/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Managing managing = new Managing(students);
        while (true) {
            switch (managing.showMenuAndChoice()) {
                case 1:
                    managing.addStudent();
                    break;

                case 2:
                    managing.searchStudentByName();
                    break;
                case 3:
                    managing.deleteStudentById();
                    break;

                case 4:
                    managing.displayAllStudent(students);
                    break;
                case 5:
                    return;

                default:
                    return;
            }
        }
    }
}
