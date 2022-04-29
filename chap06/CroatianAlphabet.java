package chap06;

import java.util.Scanner;

public class CroatianAlphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] myList = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
        String givenStr = sc.nextLine();
        for(String i: myList) {
        	if(givenStr.contains(i)) {
        		givenStr = givenStr.replace(i, "0");
        	}
        }
        
        System.out.println(givenStr.length());
    }
}
