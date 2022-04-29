package chap05;

import java.util.Scanner;

public class Hansu {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = sc.nextInt();
        int ans=0;
        for(int i=1; i<=N; i++) {
            if(hanSu(i)){
                ans+=1;
            }
        }
        System.out.println(ans);
        
        
    }
    // int->array
    public static int[] intToArr(int numb) {
        String strNumb = Integer.toString(numb);
        int n = strNumb.length();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i]=(int)strNumb.charAt(i)-(int)'0';
        }
        return arr;
    }
    // 한수 판별 함수
    public static boolean hanSu(int numb) {
        if(numb<100) {
            return true;
        } else {
            int[] arr = intToArr(numb);
            int piv = arr[0]-arr[1];
            for(int i=0; i<arr.length-1; i++) {
                if(arr[i]-arr[i+1]!=piv) {
                    return false;
                }
            }
            return true;
        }
    }
}
