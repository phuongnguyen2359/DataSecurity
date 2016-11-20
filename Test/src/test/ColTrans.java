/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author Pj
 */
public class ColTrans {

    
    public static void main(String[] args) {
        decryptWithKey(3, "CUATNOTNOMRRSSISLN APIO ");
    }
    
    public static void decryptWithKey(int key, String msg){
        char[] myArray = msg.toCharArray();
        int length = msg.length();
   
        char[] charString = msg.toCharArray();  // convert string to array of chars
        char[][] table;
            int myStringIndex = 0;
            int colLength = length / key;
            table = new char[colLength][key];
            System.out.println("key: " + key + " ----- " + "row: " + colLength);
            for (int col = 0; col < key; col++) {
                for (int row = 0; row < colLength; row++) {
                    table[row][col] = myArray[myStringIndex];
                    myStringIndex++;
                }
            }
            for (int row = 0; row < table.length; row++) {
                for (int col = 0; col < table[0].length; col++) {
                    System.out.print(table[row][col]);
                }
            }
            System.out.println("");

        
    }
    
    public void decryptWithoutKey(String msg) {/* no key */

        char[] myArray = msg.toCharArray();
        int length = msg.length();
        ArrayList<Integer> keys = getFactors(length);
        //int key = 3;
        //int colLength = length / key;  // num of rows
        char[] charString = msg.toCharArray();  // convert string to array of chars
        char[][] table;

        for (int i = 0; i < keys.size(); i++) {
            int myStringIndex = 0;
            int key = keys.get(i);
            int colLength = length / key;
            table = new char[colLength][key];
            System.out.println("key: " + key + " ----- " + "row: " + colLength);
            for (int col = 0; col < key; col++) {
                for (int row = 0; row < colLength; row++) {
                    table[row][col] = myArray[myStringIndex];
                    myStringIndex++;
                    //System.out.print(table[row][col]);
                }
                System.out.println("");
            }

            System.out.print("table size: " + table.length + " ---- ");
            for (int row = 0; row < table.length; row++) {
                for (int col = 0; col < table[0].length; col++) {
                    System.out.print(table[row][col]);
                }
            }
            System.out.println("");

        }
    }
    
    
    public static void encryptWithKey(int key, String msg) {
        int tem = 0;
        if ((msg.length() % key) != 0) {
            tem = key - (msg.length() % key);

            for (int i = 0; i < tem; i++) {
                msg += " ";
            }
        }
        int colLength = msg.length()/key;
        char[] result = msg.toCharArray();

       
        char[][] table = new char[colLength][key];
        int index = 0;

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 5; col++) {
                table[row][col] = result[index];
                index++;
            }
        }

        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 6; row++) {
                System.out.print(table[row][col]);
//                System.out.print(x[row][col]);
            }
//            System.out.println("");
        }

    }

    // get factors function
    public static ArrayList<Integer> getFactors(int lengthSize) {
        ArrayList<Integer> divide = new ArrayList<Integer>();
        for (int i = 2; i < lengthSize; i++) {
            if (lengthSize % i == 0) {
                divide.add(i);
            }
        }
        return divide;
    }
}
