package chap06;

import java.util.Scanner;

public class Constant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        String[] sArr = reverse.split(" ");
        
        int max=0;
        for(String i: sArr) {
        	int num = Integer.parseInt(i);
        	if(max<num) {
        		max = num;
        	}
        }
        
        System.out.println(max);

    }
}