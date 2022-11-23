/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throwable;

/**
 *
 * @author admin
 */
public class GetMessage {
    public static void main(String[] args) throws Throwable {
        try {
            int i = 10/0;
        } catch(Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}
