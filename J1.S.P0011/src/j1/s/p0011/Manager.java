/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

/**
 *
 * @author PC
 */
public class Manager {
    
    public static int menu(){
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInput(1, 4);
        return choice;
    }


    public static int checkConvert(String from, String toCase1, String toCase2) {
        System.out.println("1. Convert form " + from + " to " + toCase1);
        System.out.println("2. Convert form " + from + " to " + toCase2);
        System.out.print("Enter your choice: ");
        int result = Validate.checkInput(1, 2);
        return result;
    }
    
    public static void convert(int choice){
        switch(choice){
            case 1:
                String binary = Validate.checkInputBinary();
                if(checkConvert("binary", "decimal", "hexadecimal") == 1){
                    System.out.println("Binary to Decimal: " + Convert.BinaryToDecimal(binary));
                }else{
                    System.out.println("Binary to Hexadecimal: " + Convert.BinaryToHexa(binary));
                }
                break;
            
            case 2:
                long decimal = Validate.checkInputDecimal();
                if(checkConvert("decimal", "binary", "hexadecimal") == 1){
                    System.out.println("Decimal to Binary: "+ Convert.DecimalToBinary(decimal));
                }else{
                    System.out.println("Decimal to Hexadecimal: "+ Convert.DecimalToHexa(decimal));
                }
                break;
                
            case 3:
                String hexa = Validate.checkInputHexaDecimal();
                if(checkConvert("hexa", "binary", "decimal") == 1){
                    System.out.println("Hexadecimal to Binary: " + Convert.HexaToBinary(hexa));
                }else{
                    System.out.println("Hexadecimal to Decimal: " + Convert.HexaToDecimal(hexa));
                }
                break;
        }
    }
}
