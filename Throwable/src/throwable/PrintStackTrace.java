/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throwable;
import java.lang.Throwable;
/**
 *
 * @author admin
 */
public class PrintStackTrace {
    public static void main(String[] args) throws Throwable{
        try {
            int i = 10/0;
        } catch(Throwable e) {
            e.printStackTrace();
            System.err.println("Cause: " + e.getCause());
        }
    }
}
