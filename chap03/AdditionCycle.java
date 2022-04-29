package chap03;

import java.util.Scanner;

public class AdditionCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int numb2 =numb;
        int x =0;
        while(true) {
        	x+=1;
        	int i = numb2/10;
            int j = numb2%10;
            numb2= (j*10) + ((i+j)%10);
            if(numb == numb2) {
                break;
            }
        }
        System.out.println(x);
    }
}