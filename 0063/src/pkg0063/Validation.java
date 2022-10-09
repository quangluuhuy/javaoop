/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0063;

import java.util.Scanner;


public class Validation {
    private final Scanner scanner = new Scanner(System.in);

    public double getSalary(String message) {
        double salary;
        System.out.print(message);
        while (true) {
            try {
                salary = Double.parseDouble(scanner.nextLine().trim());
                if (salary > 0) {
                    break;
                } else {
                    System.err.println("Salary is equal or greater than 0");
                }
            } catch (Exception e) {
                System.err.print("You must input digit: ");
            }
        }
        return salary;
    }

   
    public String getString(String mess) {       
        while (true) {
            System.out.print(mess);
            String s = scanner.nextLine().trim();
            if (s.isEmpty()) {
                System.err.println("Emtpy");
            } else {
                return s;
            }
        }
        
    }

    public String checkFormatName(String mess, String parternFomart) {
        String s;
        while (true) {
            
            s = getString(mess);
            if (s.matches(parternFomart)) {
                break;
            } else {
                System.err.println("Wrong format !!");

            }
        }
        return s;
    }
}
