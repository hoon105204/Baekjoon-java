package chap06;

import java.util.Scanner;

public class NumbOfWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        try {
        	if(arr[0]=="") {
        		System.out.println(arr.length-1);
        	} else {
        		System.out.println(arr.length);
        	}
        } catch (Exception e) {
        	System.out.println(0);
        }

    }
}
