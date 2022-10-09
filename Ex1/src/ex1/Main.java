/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        Controller controller = new Controller();
         while (true) {
               System.out.println("========= Ex1 Program =========\n"
                + "1. giải phương trình bậc 2\n"
                + "2. kiểm tra đối xứng \n"
                + "3. tính ước\n"
                + "4. exit");
        int choice = Validation.inputInt("Please choice one option:", 1, 4);
            switch (choice) {
                case 1:
                    controller.giaiptbac2();
                    break;
                case 2:
                    controller.kiemtradoixung();
                    break;
                case 3:
                    controller.tinhuoc();
                    break;
                case 4:
                    return;

            }
        }
    }
    
}
