/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throwable;

/**
 *
 * @author admin
 */
public class GetStackTrace {
    public static void main(String[] args) {
        try {
            int i = 10/0;
        } catch (Exception e) {
            StackTraceElement[] trace = e.getStackTrace();
            System.err.println(trace[0].toString());
            System.err.println(trace[0].getClass());
            System.err.println(trace[0].getMethodName());
            System.err.println(trace[0].getFileName());
            System.err.println(trace[0].getLineNumber());
        }
    }
}
