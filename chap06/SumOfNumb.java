package chap06;

import java.util.Scanner;

public class SumOfNumb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        
        int sum=0;
        for(int i=0; i<N; i++) {
            sum+=(int)str.charAt(i)-(int)'0';
        }
        System.out.println(sum);
    }
}
