/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

public class Main {
    
    
    public static void main(String[] args) {
        Controller controller = new Controller();
         while (true) {
               System.out.println("========= Ex1 Program =========\n"
                + "1. giải phương trình bậc 2\n"
                + "2. kiểm tra đối xứng \n"
                + "3. tính ước\n"
                + "4. exit");
        int choice = Validation.inputInt("please enter choice: ", 1, 4);
            switch (choice) {
                case 1:
                    controller.giaiptbac2();
                    break;
                case 2:
                    controller.kiemtrachuoidoixung();
                    break;
                case 3:
                    controller.timuoc();
                    break;
                case 4:
                    return;

            }
        }
    }
    
}
