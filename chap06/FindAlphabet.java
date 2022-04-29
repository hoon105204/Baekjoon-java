package chap06;

import java.util.Scanner;

public class FindAlphabet {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int[] arr = new int[26];
        for(int i=0; i<26; i++) {
        	arr[i]=-1;      	
        }
        
        for(int i=0; i<str.length(); i++) {
        	int indx = (int)str.charAt(i)-(int)'a';
        	if(arr[indx]==-1) {
        		arr[indx]=i;
        	}
        }
        
        for(int i=0; i<26; i++) {
        	System.out.printf(arr[i]+" ");      	
        }
        
    }
}
