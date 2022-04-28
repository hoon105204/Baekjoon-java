package chap02;

import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        
        int ans;
        if(i==j && j==k) {
            ans = 10000+(i*1000);
        } else if(i==j) {
            ans = 1000+(i*100);
        } else if(i==k) {
            ans = 1000+(i*100);
        } else if(k==j) {
            ans = 1000+(k*100);
        } else {
            ans = 100*Math.max(Math.max(i,j),k);
        }
        System.out.println(ans);
    }
}
