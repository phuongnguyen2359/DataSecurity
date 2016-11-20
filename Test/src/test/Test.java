/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 * @author Pj
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "H T  O OFRICI SNL-TNR  DOEASNSVIN TSIE\"STYO OSAA NRL ECIT SITESBII NETT SA.EW(EIEEOLCSN EBFAEVH,G S  AJSESMNAU CESLYP EE ER  AYUON   CLOEVTE PPRRENIS TSSNCAFTKAF E\" ILE\" SRCC   T)EROH R FR WNIR PPEHI AM . ERECLTI IO CSMEE  E RAL F   HYHCMSRAAOIRCOAN SKILIADAA ETA DNBNGSIFNC ,IKIC IRNS IDA YL'HOA DE  NESTCSSNHBOENT ESTNLM   WG TIOC EOEN. OB   'LOVF E LSOMUS-RS  I RW\"BSYVAI 'LI NMST-TTMBMQOABE  IRC RIAO OSAP  OUPUAYE WIEIT ESMFMNIFALSVTOAD-SAONSEI ";
        
        char [] myArray = msg.toCharArray();
        int length = msg.length();  
        ArrayList<Integer> keys = getFactors(length);
        //int key = 3;
        //int colLength = length / key;  // num of rows
        char[] charString = msg.toCharArray();  // convert string to array of chars
        char [][] table;  

       
        
    for (int i = 0; i< keys.size(); i++){
        int myStringIndex = 0;
        int key = keys.get(i);
        int colLength = length/key;
        table = new char[colLength][key];
//        System.out.println("key: "+key +" ----- "  + "row: "+colLength);
        for (int col = 0; col< key; col ++){
            for (int row =0; row< colLength;row++){
                table[row][col] = myArray[myStringIndex];
                myStringIndex++;
             //   System.out.print(table[row][col]);
            }
           // System.out.println("");
        }
        
        System.out.print("table size: "+table.length+" ---- ");
        for(int row = 0; row< table.length; row++){
            for (int col =0; col< table[0].length; col++){
                System.out.print(table[row][col]);
            }
        }
        System.out.println("");
        
    }    
        
        
    }

    // get factors function
    public static ArrayList<Integer> getFactors(int lengthSize){
        
        ArrayList<Integer> divide = new ArrayList<Integer>();
        
        for (int i =2; i< lengthSize; i ++){
            if(lengthSize % i == 0){
                divide.add(i);
            }
        }
        return divide;
    }
    
}
