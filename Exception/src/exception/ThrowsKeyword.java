/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author admin
 */
//case 1: Handle Exception using try-catch block
import java.io.*;
import javax.lang.model.SourceVersion;
class M{
    void method() throws IOException{
        throw new IOException("device error");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args){
        try{
            M m = new M();
            m.method();
        }catch(Exception e){
            System.out.println("Exception handled");
        }
        System.out.println("Normal flow");
    }

}

//case 2: Declare Exception
//if exception doesnt occur
import java.io.*;
class M{
    void method() throws IOException{
        System.out.println("Device operation performed");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) throws IOException{ //declare exception
        M m = new M();
        m.method();       
        System.out.println("Normal flow");
    }
}

    //if exception occurs
import java.io.*
class M{
    void method() throws IOException{
        throw new IOException("Device error");
    }
}
public class ThrowsKeyword {
    public static void main(String[] args) throws IOException{  //declare exception
        M m = new M();
        m.method();        
        System.out.println("Normal flow");
    }
}
