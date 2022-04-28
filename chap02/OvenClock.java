package chap02;

import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour_old = sc.nextInt();
        int min_old = sc.nextInt();
        int min_over = sc.nextInt();

        int hour_new = hour_old + (min_over/60);
        int min_new = min_old + (min_over%60);
        
        if (min_new>=60) {
            hour_new += min_new/60;
            min_new = min_new%60;
        }
        hour_new %= 24;
        System.out.printf("%d %d",hour_new,min_new);
    }
}
