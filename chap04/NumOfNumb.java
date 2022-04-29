package chap04;

import java.util.Scanner;

public class NumOfNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = 1;
        int[] arr = new int[10];
        
        for(int i=0; i<3; i++) {
            numb *= sc.nextInt();
        }
        String str = Integer.toString(numb);
        for(int i=0; i<str.length(); i++) {
        	int indx = (int)(str.charAt(i)-'0');
        	arr[indx]+=1;
        }
        
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        
    }
}
