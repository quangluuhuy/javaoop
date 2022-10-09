/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0063;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ManagerPerson {
   public void addPerson(ArrayList<Person> list) {
        Validation va = new Validation();
        System.out.println("======Management person program=====");
        for (int i = 0; i < 3; i++) {
            String name = va.checkFormatName("Please input name: ", "[a-zA-Z]+");
            String address = va.getString("Please input address: ");
            double salary = va.getSalary("please input salary: ");
            list.add(new Person(name, address, salary));

        }

    }

    public void sortPerson(ArrayList<Person> list) {
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getSalary() > o2.getSalary()) {
                    return 1;
                } else if (o1.getSalary() < o2.getSalary()) {
                    return -1;
                }
            else return 0;
            }
        });
}
      public void dispplayPerson(ArrayList<Person> list) {
          for (Person person : list) {
              person.display();
          }
}
}
