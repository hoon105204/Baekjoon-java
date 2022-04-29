package chap03;

import java.util.Scanner;

public class NumbLessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int k = sc.nextInt();
            if(k<x) {
                System.out.printf(k+" ");
            }
        }
    }
}
