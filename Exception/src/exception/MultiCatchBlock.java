/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author admin
 */
public class MultiCatchBlock {
    public static void main(String[] args){
        try{
            int a[] = new int[5];
            System.out.println(a[10]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception occurs");
        }catch(Exception e){
            System.out.println("Parent Exception occurs");
        }
    }
}
