package chap03;

import java.util.Scanner;

public class AaddB_4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	try {
        		int a = sc.nextInt();
        		int b = sc.nextInt();
        		
        		System.out.println(a+b);
        	} catch(Exception e) {
        		return;
        	}
        }
    }
}
