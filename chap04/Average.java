package chap04;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        double max=0.0;
        
        for(int i=0; i<N; i++) {
            arr[i]=sc.nextFloat();
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        
        double ans=0.0;
        for(int i=0; i<N; i++) {
            ans+=(double)(arr[i]/max*100/N);
        }
        System.out.println(ans);
    }
}
