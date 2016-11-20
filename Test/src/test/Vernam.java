/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Pj
 */
public class Vernam {

    public static void main(String[] args) {
        //encryptWithKey("");
        //decryptWithKey();
        generatedKey(3);
    }

    public static void encryptWithKey(String key) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', ',', ':', ';', '(', ')', '-', '!', '?', '$', '\'', '\"', 'n',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // the alphabet given by the lecturer

        key = "XMCKL";
        String msg = "HELLO";

        char[] letter = msg.toCharArray();
        char[] keys = key.toCharArray();
        ArrayList<Integer> p = new ArrayList<Integer>();
        ArrayList<Integer> k = new ArrayList<Integer>();
        first:
        for (char c : letter) {
            second:
            for (int i = 0; i < alphabet.length; i++) {
                if (c == alphabet[i]) {
                    p.add(i);
                    break second;
                }
            }
        }

        for (char c : keys) {
            second:
            for (int i = 0; i < alphabet.length; i++) {
                if (c == alphabet[i]) {
                    k.add(i);
                    break second;
                }
            }
        }

        int[] c = new int[k.size()];
        for (int i = 0; i < c.length; ++i) {
            c[i] = p.get(i) + k.get(i);
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] > 25) {
                c[i] = c[i] - 26;
            }
        }
        System.out.print("The cipher text will be: ");
        for (int i : c) {
            System.out.print(alphabet[i]);
        }
    }

    public static void generatedKey(int n) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', ',', ':', ';', '(', ')', '-', '!', '?', '$', '\'', '\"', 'n',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // the alphabet given by the lecturer

        ArrayList<String> keyGenerated = new ArrayList<>();
        Random rand = new Random();
        for (int j = 0; j < alphabet.length; j++) {
            String key = "";
            for (int i = 0; i < n; i++) {
                int value = rand.nextInt(50);
                key += alphabet[value];
            }
            keyGenerated.add(key);
        }
        try {
            PrintWriter writer = new PrintWriter("keygeneratedSecurity.txt", "UTF-8");
            for(String s : keyGenerated){
                writer.println(s);
            }
            writer.close();
        } catch (Exception e) {
            // do something
        }
        System.out.println("key.... " + keyGenerated);

    }

    public static void decryptWithKey() {

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', ',', ':', ';', '(', ')', '-', '!', '?', '$', '\'', '\"', 'n',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // the alphabet given by the lecturer

        String key = "XMCKL";
        String msg = "EQNVZ";

        char[] keyCharacter = key.toCharArray();
        char[] msgCharacter = msg.toCharArray();
        ArrayList<Integer> keyIndex = new ArrayList<Integer>();
        ArrayList<Integer> msgIndex = new ArrayList<Integer>();

        for (char k : keyCharacter) {
            for (int j = 0; j < alphabet.length; j++) {
                if (k == alphabet[j]) {
                    keyIndex.add(j);
                }
            }
        }

        for (char m : msgCharacter) {
            for (int i = 0; i < alphabet.length; i++) {
                if (m == alphabet[i]) {
                    msgIndex.add(i);
                }
            }
        }

        int[] c = new int[msgIndex.size()];
        for (int i = 0; i < c.length; ++i) {
            if ((msgIndex.get(i) - keyIndex.get(i)) < 0) {
                c[i] = (msgIndex.get(i) - keyIndex.get(i)) + 26;
            } else {
                c[i] = msgIndex.get(i) - keyIndex.get(i);
            }
        }

        System.out.print("the plant text is: ");
        for (int i : c) {
            System.out.print(alphabet[i]);
        }

    }

}
