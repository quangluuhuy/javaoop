/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

//100loc done
public class J1SP0011 {

    public static void main(String[] args) {
    while (true) {
        Convert.inputMap();
        int choice = Manager.menu();
        switch (choice) {
            case 1:
                Manager.convert(choice);
                break;
            case 2:               
                Manager.convert(choice);
                break;
            case 3:
                Manager.convert(choice);
                break;
            case 4:
                return;
            }
        }
    }
    
}
