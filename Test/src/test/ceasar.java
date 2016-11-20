/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Pj
 */
public class ceasar {

    public static void main(String[] args) {
        encrypttWithKey("SECURITY IN COMPUTING AND IT",4);
        //decryptWithoutKey("GDKKN");
        //encrypttWithoutKey("HELLO");
        //decryptWithKey("GDKKN", 49);
    }

    public static void encrypttWithKey(String msg,int key) {
        /* with key */
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', ',', ':', ';', '(', ')', '-', '!', '?', '$', '\'', '\"', 'n',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // the alphabet given by the lecturer


        char[] a = msg.toCharArray();
//        for (int c = 0; c< a.length;c++){
//            if (a[c] == 'e'){
//                System.out.println("true");
//            }
//        }

        // char[] a = msg.split("(?!^)");
        ArrayList<Character> ar = new ArrayList<Character>();

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < alphabet.length; i++) {
                if (a[j] == alphabet[i]) {
                    ar.add(alphabet[i + key]);

                }
            }
        }
        System.out.print("The cipher text will be: ");
        for (int c = 0; c < ar.size(); c++) {
            System.out.print(ar.get(c));
        }

    }

    public static void encrypttWithoutKey(String msg) {
        /* with key */
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', ',', ':', ';', '(', ')', '-', '!', '?', '$', '\'', '\"', 'n',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // the alphabet given by the lecturer
        Random r = new Random();
        int key = r.nextInt(alphabet.length);
        //SECURITY IN COMPUTING AND IT
        System.out.println("key " + key);

        char[] a = msg.toCharArray();

        ArrayList<Character> ar = new ArrayList<Character>();
        int tem = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 49; j >= 0; j--) {
                if (a[i] == alphabet[j]) {
                    if (j + key > 49) {
                        tem = (j + key) - 50;
                        ar.add(alphabet[tem]);
                    } else {
                        ar.add(alphabet[j + key]);
                    }
                }
            }
        }
        
        System.out.print("The cipher text will be: ");
        for (int c = 0; c < ar.size(); c++) {
            System.out.print(ar.get(c));
        }
    }

    public static void decryptWithoutKey(String msg) {
        //WIGYVMX,MRGSQTYXMRKERHMX
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', ',', ':', ';', '(', ')', '-', '!', '?', '$', '\'', '\"', 'n',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // the alphabet given by the lecturer
        char[] a = msg.toCharArray();
        ArrayList<String> ar = new ArrayList<String>();

        int tem = 0;
        for (int k = 0; k < alphabet.length; k++) {
            String result = "";
            for (int i = 0; i < a.length; i++) {
                for (int j = 49; j >= 0; j--) {
                    if (a[i] == alphabet[j]) {
                        // if(a[i] != ' '){
                        if ((j - k) < 0) {
                            tem = 50 + (j - k);
                            result += alphabet[tem];
                            //}
                        } else {
                            //ar.add(alphabet[j - k]);
                            result += alphabet[j - k];
                        }
                    }
                }
            }
            ar.add(result);
        }

        // print result
        for (String s : ar) {
            System.out.println("The posible: " + s);
        }
    }

    public static void decryptWithKey(String msg, int key) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', ',', ':', ';', '(', ')', '-', '!', '?', '$', '\'', '\"', 'n',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // the alphabet given by the lecturer
        char[] a = msg.toCharArray();
        ArrayList<Character> ar = new ArrayList<Character>();
        int tem = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 49; j >= 0; j--) {
                if (a[i] == alphabet[j]) {
                    // if(a[i] != ' '){
                    if ((j - key) < 0) {
                        tem = 50 + (j - key);
                        ar.add(alphabet[tem]);
                        //}  
                    } else {
                        ar.add(alphabet[j - key]);
                    }
                }
            }
        }

        // print result
        System.out.print("The result: ");
        for (char c : ar) {
            System.out.print(c);
        }
    }

}
