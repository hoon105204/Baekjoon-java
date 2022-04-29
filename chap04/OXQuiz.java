package chap04;

import java.util.Scanner;

public class OXQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=0; i<N; i++) {
            String str = sc.next();
            int[] ansList = new int[str.length()];
            int numb=1;
            
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j)=='O'){
                    ansList[j]=numb++;
                } else {
                    numb=1;
                }
            }
            
            int ans=0;
            for(int j=0; j<ansList.length; j++) {
                ans+=ansList[j];
            }
            
            System.out.println(ans);
            
        }
        sc.close();
    }
}

