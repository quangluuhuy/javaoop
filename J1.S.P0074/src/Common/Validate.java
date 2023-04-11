/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro5
 */
public class Validate {
    // ham check choice menu
    Scanner sc = new Scanner(System.in);
    public int inputChoice(){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine().trim());
                if(n<1 || n>4){
                    throw new NumberFormatException();
                }
                return n;
            }catch(NumberFormatException e){
                System.out.print("Enter Again: ");
            }
        }
    }
    // ham check gia tri cot va hàng
    public int inputRowColumn(){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine().trim());
                if(n<0){
                    throw new NumberFormatException();
                }
                return n;
            }catch (NumberFormatException e){
                System.out.print("Enter Again: ");
            }
        }
    }
    // ham chech gia tri ma tran
    public int inputInt(){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine().trim());
                return n;
            }catch(NumberFormatException e){
                System.out.print("Enter Again: ");
            }
        }
    }
    
    // ham nhap ma tran 1
    public int[][] inputMatrix1(){
        System.out.print("Enter Row matrix 1: ");
        int row = inputRowColumn();
        System.out.print("Enter Column matrix 1: ");
        int col = inputRowColumn();
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j<col; j++){
                System.out.print("Enter Matrix ["+i+"]["+j+"]: ");
                matrix[i][j] = inputInt();
            }
        }
        return matrix;
    }
    // ham nhap ma tran 2
    public int[][] inputMatrix2(){
        System.out.print("Enter Row matrix 2: ");
        int row = inputRowColumn();
        System.out.print("Enter Column matrix 2: ");
        int col = inputRowColumn();
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j<col; j++){
                System.out.print("Enter Matrix ["+i+"]["+j+"]: ");
                matrix[i][j] = inputInt();
            }
        }
        return matrix;
    }
    // ham biểu dienx ma tran 
    public  void display(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("["+matrix[i][j]+"]");
            }
            System.out.println();
        }
    }
}
