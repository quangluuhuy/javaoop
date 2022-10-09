/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0063;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        ManagerPerson mangerperson = new ManagerPerson();
        mangerperson.addPerson(list);
        mangerperson.sortPerson(list);
        mangerperson.dispplayPerson(list);
    }
    
}
