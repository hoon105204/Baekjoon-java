package chap04;

import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int k=0; k<N; k++) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            int sum = 0;
            for(int i=0; i<len; i++) {
                arr[i]= sc.nextInt();
                sum+=arr[i];
            }
            double avg = (double)sum/(double)len;
            
            int numb = 0;
            for(int i=0; i<len; i++) {
                if(arr[i]>avg) {
                    numb+=1;
                }
            }
            double ans = (double)numb/(double)len;
            System.out.printf("%.3f%%\n",ans*100);
        }
        sc.close();
    }
}
