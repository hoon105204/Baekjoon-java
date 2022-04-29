package chap04;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int[] arr = new int[42];
        
        for(int i=0; i<10; i++) {
            x = (sc.nextInt()%42);
            arr[x]+=1;
        }
        
        int ans = 0;
        for(int i=0; i<42; i++) {
            if(arr[i]!=0) {
                ans+=1;
            }
        }
        
        System.out.println(ans);
        
    }
}
