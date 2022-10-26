/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jp0052;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Validation {
    final Scanner scanner;

    public Validation(Scanner scanner) {
        this.scanner = scanner;
    }
    public int checkInt(String mess, int min, int max) {
        int number;
        while (true) {
            System.out.print(mess);
            try {
                number = Integer.parseInt( scanner.nextLine().trim());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println("Number must in rage " + min + " to " + max);
                }
            } catch (NumberFormatException e) {
                System.err.println("Must is number format!Please! ");
            }
        }

    }
    public float checkFloat(String mess, float min, float max) {
        float number;
        while (true) {
            System.out.println(mess);
            try {
                number = Float.parseFloat( scanner.nextLine().trim());
                if (number > min && number <= max) {
                    return number;
                } else {
                    System.err.println("Number must in rage " + min + " to " + max);
                }
            } catch (NumberFormatException e) {
                System.err.println("Must is number format!Please! ");
            }
        }
    }
    //check data type String empty or not
    public String checkString(String mess) {
        String s;
        while (true) {

            System.out.println(mess);
            s =  scanner.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println("Your input is Empty! ");

            } else {
                return s;
            }
        }

    }

}
