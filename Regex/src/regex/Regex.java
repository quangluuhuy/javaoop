/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regex;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Regex {
    private static final Scanner scanner = new Scanner(System.in);    
    
    public static void main(String[] args) {
        
        String str = checkInputString();
    }
    public static String checkInputString() {
            
        
             System.out.println("nhập chuỗi: ");
             String result = scanner.nextLine().trim();
             if (!result.matches("^[a-zA-Z0-9]{0,100}$")) {
                 System.out.println("chuỗi  có kí tự đặc biệt");
                 
             } else {
                 System.out.println("chuỗi không có kí tự đặc biệt");
                 return result;
             }
        return null;
         
    }
    
}
