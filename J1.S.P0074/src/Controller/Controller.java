/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Common.Validate;

/**
 *
 * @author Acer Nitro5
 */
public class Controller {
    // Phép cộng ma trận 
    public int[][] addMatrix(int[][] matrix1, int[][] matrix2){
        // neu so hang va cot của 2 ma tran khong bang nhau
        // se tra ve null
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            return null;
        }
        // khai bao mang result
        int[][] result = new int [matrix1.length][matrix1[0].length];
        for(int i=0; i< matrix1.length; i++){
            for(int j=0; j< matrix1[0].length;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j]; // cong 2 ma tran
            }
        }
        return result; // in ra kết quả
    }
    
    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2){
        // neu so hang va cot của 2 ma tran khong bang nhau
        // se tra ve null
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            return null;
        }
         // khai bao mang result
        int[][] result = new int [matrix1.length][matrix1[0].length];
        for(int i=0; i< matrix1.length; i++){
            for(int j=0; j< matrix1[0].length;j++){
                result[i][j] = matrix1[i][j] - matrix2[i][j]; // tru 2 ma tran
            }
        }
        return result;
    }
    
    public int[][] multipleMatrix(int[][] matrix1, int[][] matrix2){
        // neu so hang của ma trận 1 khác so cot của ma tran 2
        // sẽ trả về null
        if(matrix1[0].length != matrix2.length){
            return null;
        }
         // khai bao mang result
        int[][] result = new int [matrix1.length][matrix2[0].length];
        for(int i=0; i< matrix1.length; i++){
            for(int j=0; j< matrix2[0].length;j++){
                for(int p=0; p<matrix1[0].length;p++){ // chỉ số chung của 2 mảng
                    result[i][j] += matrix1[i][p] * matrix2[p][j]; // nhan 2 ma tran
                }
            }
        }
        return result;
    } 
}
