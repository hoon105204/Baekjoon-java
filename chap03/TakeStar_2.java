package chap03;

import java.util.Scanner;

public class TakeStar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int i2 = n-i;
            for(int j=1; j<=n; j++) {
                if(j>=i2) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
