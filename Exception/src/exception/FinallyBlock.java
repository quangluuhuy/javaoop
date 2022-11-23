/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author admin
 */
public class FinallyBlock {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");

            int i = 25 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
    }
}
