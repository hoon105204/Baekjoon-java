package chap03;

import java.util.Scanner;

public class NekaT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<N; i++) {
            System.out.println(N-i);
        }
    }
    
}
