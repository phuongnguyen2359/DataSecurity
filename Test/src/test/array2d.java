/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Pj
 */
public class array2d {

    public static void main(String[] args) {
        
        encrypt(5);
//        char[] result = msg.toCharArray();
//        char [][] table = new char[6][5];  
//        int index = 0;
//        
//        
//        for (int row = 0; row < 6; row++) {
//            for (int col = 0; col < 5; col++) {
//                  table[row][col] = result[index];
//                  index++;
//            }
//        }
//        
//        
//        for (int col = 0; col < 5; col++) {
//            for (int row = 0; row < 6; row++) {
//                System.out.println(table[row][col]);
////                System.out.print(x[row][col]);
//            }
//            System.out.println("");
////            System.out.println("");
//        }
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 4; col++) {
//
//                System.out.print(x[row][col]);
//            }
//            System.out.println("");
//        }
    }

    public static void encrypt(int key) {
        String msg = "SECURITY IN COMPUTING AND IT";

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
}
