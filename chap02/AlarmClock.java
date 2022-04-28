package chap02;

import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        
        if (min<45) {
            if (hour==0) {
                System.out.printf("%d %d",23,min+15);
            } else {
                System.out.printf("%d %d",hour-1,min+15);
            }
        } else {
            System.out.printf("%d %d",hour,min-45);
        }
    }
}