/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.lang.reflect.Method;

/**
 *
 * @author admin
 */
public class ReflectionApp {

    public static void main(String[] args) throws Exception {

        {
            Staff staff = new Staff();

            // Using getDeclareMethod() method
            Method method = Staff.class.getDeclaredMethod("privateStaff");

            // Using setAccessible() method
            method.setAccessible(true);

            // Using invoke() method
            method.invoke(staff);
        }

    }

}
