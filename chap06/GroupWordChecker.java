package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class GroupWordChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int ans = 0;
        for(int i=0; i<N; i++) {
        	String givenStr = sc.next();
        	//System.out.println(groupWord(givenStr));
        	if(groupWord(givenStr)) {
        		ans+=1;
        	}
        }
        System.out.println(ans);
        
    }
    
    public static boolean groupWord(String str) {
    	int[] engList = new int[26];
    	Arrays.fill(engList,0);
    	
    	boolean conti = false;
    	char preWord = ' ';
    	
    	for(int i=0; i<str.length(); i++) {
    		char givenWord = str.charAt(i);
    		int indx = (int)givenWord - (int)'a';
    		
    		if(preWord==givenWord) {
    			conti = true;
    		}
    		
    		if(engList[indx]==0) {
    			engList[indx]=1;
    		} else if(engList[indx]==1 && conti) {
    			engList[indx]=1;
    		} else {
    			return false;
    		}
    		
    		preWord = givenWord;
    		conti = false;
    		
    	}
    	
    	return true;
    }
}
