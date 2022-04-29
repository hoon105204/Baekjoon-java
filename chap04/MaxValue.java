package chap04;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int max=0;
        int indx=0;
        int maxIndx=0;
        
        while(true) {
            try {
                indx+=1;
                int numb = sc.nextInt();
                if(max<numb) {
                    max = numb;
                    maxIndx = indx;
                }
                
            } catch(Exception e) {
                break;
            }
        }
        System.out.println(max);
        System.out.println(maxIndx);
    }
}
