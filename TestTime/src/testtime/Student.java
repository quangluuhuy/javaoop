/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtime;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author admin
 */
public class Student {
    public String name;
    public int age;
    public String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void measurementLinkedList() {
        long start = System.nanoTime();
        LinkedList students = new LinkedList<Student>();
        for (int i=0; i<1000_000; i++) {
            students.add(createRandomStudent());
        }
        long elapse_mili = (System.nanoTime() - start)/1000000;
        System.out.println(elapse_mili);
    }
    public void measurementArrayList() {
        long start = System.nanoTime();
        ArrayList students = new ArrayList<Student>();
        for (int i=0; i<1000_000; i++) {
            students.add(createRandomStudent());
        }
        long elapse_mili = (System.nanoTime() - start)/1000000;
        System.out.println(elapse_mili);
    }
    private Student createRandomStudent() {
        return new Student(null,10,null);
    }

    public static void main(String[] args) {
        Student student = new Student(null,10,null);
        student.measurementLinkedList();
        student.measurementArrayList();
    }

    
}
