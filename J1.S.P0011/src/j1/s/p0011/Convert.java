/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Convert {

    public static HashMap<Character, String> hexaToBinary = new HashMap<>();

    public static void inputMap() {
        hexaToBinary.put('0', "0000");//key,value
        hexaToBinary.put('1', "0001");
        hexaToBinary.put('2', "0010");
        hexaToBinary.put('3', "0011");
        hexaToBinary.put('4', "0100");
        hexaToBinary.put('5', "0101");
        hexaToBinary.put('6', "0110");
        hexaToBinary.put('7', "0111");
        hexaToBinary.put('8', "1000");
        hexaToBinary.put('9', "1001");
        hexaToBinary.put('A', "1010");
        hexaToBinary.put('B', "1011");
        hexaToBinary.put('C', "1100");
        hexaToBinary.put('D', "1101");
        hexaToBinary.put('E', "1110");
        hexaToBinary.put('F', "1111");
    }

    //Binary
    public static int BinaryToDecimal(String binary) {
        int decimal = 0;
        int count = 0;
        for (int i = (binary.length() - 1); i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += (int) (Math.pow(2, count));
            }
            count++;
        }
        return decimal;
    }

    public static String BinaryToHexa(String binary) {
        ArrayList<String> list = new ArrayList<>();
        int position = binary.length();
        while (position > 0) {
            if (position >= 4) {
                list.add(binary.substring(position - 4, position));
                position = position - 4;
            } else {
                list.add(binary.substring(0, position));
                position = 0;
            }
        }
        String zero = "";
        if (list.get(list.size() - 1).length() != 4) {
            for (int i = 0; i < 4 - list.get(list.size() - 1).length(); i++) {
                zero += "0";
            }
        }
        list.set(list.size() - 1, zero + list.get(list.size() - 1));

        String hexa = "";
        for (int i = 0; i < list.size(); i++) {
            for (Map.Entry<Character, String> entry : hexaToBinary.entrySet()) {
                if (list.get(i).equals(entry.getValue())) {
                    hexa = entry.getKey() + hexa;
                    System.out.println(entry.getKey());
                }
            }

        }
        return hexa;
    }

    //Decimal
    public static String DecimalToBinary(long decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = Long.toString(decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return binary;
    }

    public static String DecimalToHexa(long decimal) {
        String hexa = DecimalToBinary(decimal);
        return BinaryToHexa(hexa);

    }

    //Hexa
    public static int HexaToDecimal(String hexadecimal) {
        String binary = HexaToBinary(hexadecimal);
        return BinaryToDecimal(binary);
    }

    public static String HexaToBinary(String hexa) {
        String binary = "";
        for (int i = 0; i < hexa.length(); i++) {
            binary += hexaToBinary.get(hexa.charAt(i));
        }
        return binary;
    }
}
