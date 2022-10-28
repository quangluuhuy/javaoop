/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0065;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validate {
    private static final Scanner sc = new Scanner(System.in);
    
    public static String checkInputString() {
        //loop until user input true value      
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }
    //className theo form
    // vd: FU1234, SE1639 ,.....
//     public static String checkInputString2() {
//         //loop until user input true value      
//         while (true) {
//             String result = sc.nextLine().trim();
//             if (!result.matches("[a-zA-Z]{2}[0-9]{4}")) {
//                 System.err.print("Enter again: ");
//             } else {
//                 return result;
//             }
//         }
//     }

    public static int checkInputMark(String nameSubject) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < 0) {
                    System.err.println(nameSubject + " is greater than equal zero");
                    System.out.print(nameSubject + ":");
                    continue;
                }
                if (result > 10) {
                    System.err.println(nameSubject + " is less than equal ten");
                    System.out.print(nameSubject + ":");
                    continue;
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println(nameSubject + " is digit");
                System.out.print(nameSubject + ":");
            }
        }
    }

    public static boolean checkYN() {
        while (true) {
            String result = checkInputString();
            if (result.length() == 1) {
                char resultChar = result.charAt(0);
                if (resultChar == 'y' || resultChar == 'Y') {
                    return true;
                }
                if (resultChar == 'n' || resultChar == 'N') {
                    return false;
                }
            }
            System.err.println("Re-input");
        }
    }
}
