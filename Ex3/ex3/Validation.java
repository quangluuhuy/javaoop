/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {

    static boolean checkChangeInfo(ArrayList<Student> id, String name, String stduentId, int age, String classs, String school) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    private final Scanner sc = new Scanner(System.in);

    public String checkInputString(String mess) {

        while (true) {
            System.out.print(mess);
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");

            } else {
                return result;
            }
        }
    }
    public int checkInt(String mess,int min, int max) {
        while (true) {
            System.out.print(mess);
            String raw = sc.nextLine().trim();
            if (!raw.isEmpty()) {
                try {
                    int choice = Integer.parseInt(raw);
                    if (choice >= min && choice <= max) {
                        return choice;
                    } else {
                        System.err.println("You must enter in range [" + min + "-"
                                + max + "], enter again: ");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("You must enter an integer ");
                }
            } else {
                System.err.println("Empty! ");
            }
        }
    }
     
    public Student isIdExists(ArrayList<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    
    

    
}
