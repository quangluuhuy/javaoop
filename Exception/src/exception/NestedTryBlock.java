/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author admin
 */
public class NestedTryBlock {
    public static void main(String[] args){
        //outer try block
        try{
            //inner try block 1
            try{
                System.out.println("going to divide by 0");
                int b = 39/0;
            }catch(ArithmeticException e){  //catch block of inner try block 1
                System.out.println(e);
            }
            
            //inner try block 2
            try{
                int a[] = new int[5];
                a[5] = 4;
            }catch(ArrayIndexOutOfBoundsException e){   //catch block of try block 2
                System.out.println(e);
            }
            
            System.out.println("other statement");
        }catch(Exception e){    //catch block of outer try block
            System.out.println("handled the exception (outer catch)");
        }
        
        System.out.println("normal flow");
    }
}
