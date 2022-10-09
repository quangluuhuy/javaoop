/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class Controller {

    private static Scanner scanner = new Scanner(System.in);

    public void giaiptbac2() {
        int a = Validation.inputInt("nhập hệ số bậc 2, a = ", Integer.MIN_VALUE,Integer.MAX_VALUE);
        int b = Validation.inputInt("nhập hệ số bậc 2, b = ", Integer.MIN_VALUE,Integer.MAX_VALUE);
        int c = Validation.inputInt("nhập hệ số bậc 2, c = ", Integer.MIN_VALUE,Integer.MAX_VALUE);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "+ "x = " + (-c / b));                        
            }
            return;
        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }

    public void kiemtradoixung() {
        System.out.print("Nhập chuỗi:");
        String inputString = Validation.inputString();     
        if (inputString.length() % 2 != 0) {
            System.out.println("Chuoi khong doi xung");
        }else{
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("chuỗi đối xứng.");
        } else {
            System.out.println("không phải là chuỗi đối xứng.");
        }
    }
    }

    public void tinhuoc() {
        int number = Validation.inputInt("Enter number:  ", 1, Integer.MAX_VALUE);
        System.out.print("Ư(" + number + "): ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + "\t");
            }          
        } 
        System.out.println("");
    }
}
