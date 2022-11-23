/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author admin
 */
public class TryCatchBlock {
     public static void main(String[] args){
        try{
            int i = 10/0;
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
