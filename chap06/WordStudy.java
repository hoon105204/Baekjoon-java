package chap06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WordStudy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(myFunc(str));
    }
    
    public static String myFunc(String str) {
        Integer[] iarr = new Integer[26];
        Arrays.fill(iarr, 0);
        String upStr = str.toUpperCase();
        for(int i=0; i<upStr.length(); i++) {
            int indx = (int)upStr.charAt(i)-(int)'A';
            iarr[indx]+=1;
        }
        
        Integer[] iarr2 = iarr.clone();
        Arrays.sort(iarr2, Collections.reverseOrder());
        
        if(iarr2[0].equals(iarr2[1])) {
            return "?";
        }
        String ans="";
        for(int i=0; i<iarr.length; i++) {
            if(iarr2[0].equals(iarr[i])) {
                int indx = i+(int)'A';
                ans = Character.toString((char)indx);
                
            }
        }
		return ans;
        
    }
}
