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
public class test1 {
    
    public static void main(String[] args) {
        
        String msg = "SECURITY IN COMPUTING AND IT";
        int key =5;
        
        char[] myArray = msg.toCharArray();
        int length = msg.length();
   
        char[] charString = msg.toCharArray();  // convert string to array of chars
        char[][] table;
            int myStringIndex = 0;
            System.out.println("length " + length);
            int colLength = length / key;
            table = new char[colLength][key];
            System.out.println("key: " + key + " ----- " + "row: " + colLength);
            for (int col = 0; col < key; col++) {
                for (int row = 0; row < colLength; row++) {
                    table[row][col] = myArray[myStringIndex];
                    myStringIndex++;
                    System.out.print(table[row][col]);

                }
                 System.out.println("");

            }
            System.out.println(table.length);
            for (int row = 0; row < 6; row++) {
                System.out.print(table[row][5]);
            }
        
    }
    
    
    public static ArrayList<Integer> getFactors(int lengthSize){
        
        ArrayList<Integer> divide = new ArrayList<Integer>();
        
        for (int i =2; i< lengthSize; i ++){
            if(lengthSize % i == 0){
                divide.add(i);
            }
        }
        
       for (int j =0; j< divide.size(); j++){
           System.out.println(divide.get(j));
       }
        return divide;
    }
    
}
