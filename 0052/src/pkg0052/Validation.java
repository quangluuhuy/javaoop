/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0052;

import Entity.EastAsianCountry;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
public class Validation {
    Scanner scanner = new Scanner(System.in);
    //check data type int in this case is choice
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

    //check data type float in this case is area data
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
