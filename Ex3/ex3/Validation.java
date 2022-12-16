/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {

   

    
    private final Scanner scanner = new Scanner(System.in);

    public String checkInputString(String mess) {

        while (true) {
            System.out.print(mess);
            String result = scanner.nextLine().trim();
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
            String raw = scanner.nextLine().trim();
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
     public String checkDate(String mess) {
       

        while (true) {
            System.out.print(mess);
            String raw = scanner.nextLine().trim();
            if (!raw.isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    Date date = sdf.parse(raw);
                    String result_str = sdf.format(date);
                    if (result_str.equals(raw)) {
                        return result_str;
                    } else {
                        System.err.println("Please enter a right date! ");
                    }
                } catch (ParseException e) {
                    System.err.println("Date must in format dd-MM-yyyy! ");
                }
            } else {
                System.err.println("Date can not empty! ");
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
