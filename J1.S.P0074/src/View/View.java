/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Common.Validate;
import Controller.Controller;

/**
 *
 * @author Acer Nitro5
 */
public class View {
    // ham menu
    public void menu(){
    Controller c = new Controller();
    Validate m = new Validate();
         while(true){
            System.out.println("=======Calculator Program=======");
            System.out.println("1. Add matrix");
            System.out.println("2. Subtraction matrix");
            System.out.println("3. Multiplication matrix");
            System.out.println("4. Quit");
            System.out.print("Please a choice: ");
            int choice = m.inputChoice();
            switch(choice){
                case 1:
                    System.out.println("--------Addition---------");
                    int[][] matrix1 = m.inputMatrix1(); // nhap ma tran 1
                    int[][] matrix2 = m.inputMatrix2(); // nhap ma tran 2
                    int[][] result = null;
                    result = c.addMatrix(matrix1, matrix2); // cong 2 ma tran
                    if(result == null){ // neu ko dúng dieu kien 
                        System.out.println("Can't add."); //se in ra thong bao
                    }else{
                        // bieu dien ket qua
                        m.display(matrix1);
                        System.out.println("+");
                        m.display(matrix2);
                        System.out.println("=");
                        m.display(result);
                    }
                    break;
                case 2:
                    System.out.println("--------Subtraction--------");
                    matrix1 = m.inputMatrix1();// nhap ma tran 1
                    matrix2 = m.inputMatrix2(); // nhap ma tran 2
                    result = null;
                    result = c.subtractionMatrix(matrix1, matrix2); // tru 2 ma tran
                    if(result == null){// neu ko dúng dieu kien
                        System.out.println("Can't subtract.");//se in ra thong bao
                    }else{
                        // bieu dien ket qua
                        m.display(matrix1);
                        System.out.println("-");
                        m.display(matrix2);
                        System.out.println("=");
                        m.display(result);
                    }
                    break;
                case 3:
                    System.out.println("---------Multiplication---------");
                    matrix1 = m.inputMatrix1();// nhap ma tran 1
                    matrix2 = m.inputMatrix2();// nhap ma tran 2
                    result = null;
                    result = c.multipleMatrix(matrix1, matrix2);// nhan 2 ma tran
                    if(result == null){// neu ko dúng dieu kien
                        System.out.println("Can't multiplicate.");//se in ra thong bao
                    }else{// bieu dien ket qua
                        m.display(matrix1);
                        System.out.println("*");
                        m.display(matrix2);
                        System.out.println("=");
                        m.display(result);
                    }
                    break;
                case 4: 
                    return;
            }
        }
    }
}
