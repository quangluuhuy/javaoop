/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throwable;

/**
 *
 * @author admin
 */
public class GetSuppressed {
    public static void function1() throws Exception {
        throw new Exception();
    }

    public static void function2() throws Throwable {
        try {
            function1();
        } catch (Exception e) {
            throw e.fillInStackTrace();
        }
    }

    public static void main(String[] args) throws Throwable {
        try {
            function2();
        } catch (Exception e) {
            System.err.println("Caught inside Main:");
            Throwable[] suppress = e.getSuppressed();
            System.out.println(suppress[0].toString());
        }
    }
}
