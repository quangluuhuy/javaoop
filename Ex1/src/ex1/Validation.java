    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String mess, int min, int max) { 
        int number;
        while (true) {
            System.out.print(mess); 
            try {
                number = Integer.parseInt(scanner.nextLine().trim());
                if (number >= min && number <= max) {  
                    return number;
                } else {  
                    System.err.println("Number must in rage " + min + " to " + max); 
                }
            } catch (NumberFormatException e) {
                System.err.println("You must enter number !enter again: "); 
            }
        }
    }
     public static float inputFloat(String mess, float min, float max) { 
        float number;
        while (true) {
            System.out.print(mess); 
            try {
                number =  Float.parseFloat(scanner.nextLine().trim());
                if (number >= min && number <= max) {  
                    return number;
                } else {  
                    System.err.println("Number must in rage " + min + " to " + max); 
                }
            } catch (NumberFormatException e) {
                System.err.println("You must enter number !enter again: "); 
            }
        }
    }
    public static String inputString() {
        
        while (true) {
            String result = scanner.nextLine().trim();
            if (result.isEmpty()) {
                System.out.print("Not empty!\nenter again: ");
            } else {
                return result;
            }
        }
    }

}
