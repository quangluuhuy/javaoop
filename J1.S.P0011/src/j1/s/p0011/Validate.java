/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Validate {
    private static Scanner sc = new Scanner(System.in);
    private static final String BINARY_VALID = "[0-1]+";
    private static final String HEXADECIMAL_VALID = "[0-9A-F]+";
    
    

    public static int checkInput(int min, int max){
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new Exception();
                }
                return result;
            } catch (Exception e) {
                System.err.println("Please input number in rage " + min + " -> " + max );
                System.out.print("Please enter again: ");
            }
        }
    }


    public static String checkInputBinary() {
        System.out.print("Enter binary number: ");
        String binary;
        //loop until user input correct
        while (true) {
            binary = sc.nextLine().trim();
            if (binary.matches(BINARY_VALID)) {
                return binary;
            }
            System.err.println("Must be enter 0 or 1");
            System.out.print("Enter again: ");
        }
    }


    public static long checkInputDecimal() {
        int decimal;
        while (true) {
            try {
                System.out.print("Enter decimal number: ");
                decimal = Integer.parseInt(sc.nextLine());
                if(decimal < 0){
                    throw new Exception();
                }
                return decimal;
            } catch (Exception e) {
                System.err.println("Must be enter number in the range 0 -> 9");
                System.out.print("Enter again: ");
            }
            
        }
    }


    public static String checkInputHexaDecimal() {
        System.out.print("Enter hexadecimal number: ");
        String hexadecimal;
        while (true) {
            hexadecimal = sc.nextLine().trim();
            if (hexadecimal.matches(HEXADECIMAL_VALID)) {
                return hexadecimal;
            }
            System.err.println("Must be enter 0-9 A-F");
            System.out.print("Enter again: ");
        }
    }
}
