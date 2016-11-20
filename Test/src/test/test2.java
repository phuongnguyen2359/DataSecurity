//        String[][] fs = new String[8][3];
//
//        for (int col = 0; col < 3; col++) {
//            for (int row = 0; row < 8; row++) {
//                fs[row][col] = letters[row];
//                System.out.print(fs[row][col] + " ");
//            }
//            System.out.println("");
//        }
package test;

import java.util.ArrayList;

/**
 *
 * @author Pj Encypt and Decrypt Columnar Transportatition
 */
public class test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // String msg = "SECURITY IN COMPUTING AND IT";
        String msg = "SECURITY IN COMPUTING AND ITAB";

        char[] myArray = msg.toCharArray();
        System.out.println(myArray.length);
        int length = msg.length();
        ArrayList<Integer> keys = getFactors(length);
       
        int key = 6;
        char[] charString = msg.toCharArray();  // convert string to array of chars
        char[][] table;

            int myStringIndex = 0;
            int colLength = length / key;
            table = new char[colLength][key];
            System.out.println("key: " + key + " ----- " + "row: " + colLength);
            System.out.println("table length row "+ table.length);
            System.out.println("table length col " + table[0].length);
        
            // key = 5 col
            // collength / row = 6
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 6; col++) {
                    table[row][col] = myArray[myStringIndex];
                    myStringIndex++;
                    System.out.print(table[row][col]);
                }
                System.out.println("");
            }
            System.out.println(table[5][5]);
//            for(int row= 0; row< colLength; row++){
//                
//            }
            
            
//            for (int col = 0; col < table[0].length; col++) {
//                for (int row = 0; row < table.length; row++) {
//                    table[row][col] = myArray[myStringIndex];
//                    myStringIndex++;
//                    System.out.print(table[row][col]);
//                }
//            }
            
            

        
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
