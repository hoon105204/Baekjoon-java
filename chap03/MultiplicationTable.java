package chap03;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int i = 1;
        while(i<10) {
            System.out.printf("%d * %d = %d\n",numb,i,i*numb);
            i++;
        }
        sc.close();
    }
}