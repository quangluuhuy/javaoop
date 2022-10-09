/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0064;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Validation validation = new Validation();
        String phone = validation.checkInputPhone("Phone number: ","^[0-9]{10}$");//Enter the number 0 to 9 consisting of 10 digits
        String date = validation.checkInputDate("Date: ");
        String email = validation.checkInputEmail("Email: ","^[a-zA-Z][a-zA-Z0-9\\_]+@[a-zA-Z]+(.[a-zA-z]+){1,3}$");
         }
}
