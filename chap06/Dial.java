package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class Dial {

	static Scanner sc = new Scanner(System.in);
	static final String[][] sArr = {{"A","B","C"},{"D","E","F"},{"G","H","I"},{"J","K","L"},{"M","N","O"},{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
	
    public static void main(String[] args) {
        
        String givenString = sc.nextLine();
        int sum = 0;
        for(int i=0; i<givenString.length(); i++) {
        	String str = Character.toString(givenString.charAt(i));
        	sum+=findNum(str);
        }
        System.out.println(sum);

    }
    
    public static int findNum(String str) {
    	int ans=0;
    	for(String[] arr: sArr) {
    		boolean contains = Arrays.stream(arr).anyMatch(str::equals);
    		if(contains) {
    			break;
    		}
    		ans++;
    	}
    	return ans+3;
    }
}
