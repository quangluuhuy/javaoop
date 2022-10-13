/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;


import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author admin
 */
public class Controller {

   

    public void giaiptbac2() {
        float a = Validation.inputFloat("nhập hệ số bậc 2, a = ", Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
        float b = Validation.inputFloat("nhập hệ số bậc 2, b = ", Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
        float c = Validation.inputFloat("nhập hệ số bậc 2, c = ", Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
        kiemtradieukien(a, b, c);
        
    }
    public void kiemtradieukien(float a, float b, float c){
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }else{
            tinhnghiem(a, b, c);
    }
    }
    public void tinhnghiem(float a, float b, float c) {

        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        
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
    

    public void kiemtrachuoidoixung() {
        System.out.print("Nhập chuỗi:");
        kiemtradodaichuoi();
    }
    public void kiemtradodaichuoi(){
        String inputString = Validation.inputString();
        if (inputString.length() % 2 != 0) {
            System.out.println("Chuoi khong doi xung");
        } else {
            kiemtradoixung(inputString);
        }
    }
    
    public void kiemtradoixung(String inputString) {       
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
    public void kiemtrachuoidoixung2(){
        System.out.print("Nhập chuỗi:");
         String inputString = Validation.inputString();
        if (inputString.length() % 2 != 0) {
            System.out.println("Chuoi khong doi xung");
        } else {
           
        boolean flag = true;
        if (inputString.length() == 2) {
            if (inputString.charAt(0) != inputString.charAt(1)) {
                flag = false;
            }
        }
        String[] charstr = inputString.split("");
        HashMap<String, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < charstr.length; i++) {
            if (hashmap.containsKey(charstr[i])) {
                hashmap.put(charstr[i], hashmap.get(charstr[i]) + 1);
            } else {
                hashmap.put(charstr[i], 1);
            }
        }
        for (String object : hashmap.keySet()) {
            if (hashmap.get(object) % 2 != 0) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("có thể chuyển thành chuỗi đối xứng");
        } else {
            System.out.println("Khong thể chuyển thành la 1 chuỗi đối xứng");
        }
    }
    }
    public void timuoc() {
        int number = Validation.inputInt("Enter number:  ", 1, Integer.MAX_VALUE);
        System.out.print("Ư(" + number + "): ");
        tinhuoc(number);
        System.out.println("");

    }

    public void tinhuoc(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + "\t");
            }
        }

    }

    

    
}
