package chap03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastAaddB {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int T = Integer.parseInt(br.readLine());
			for(int i=0; i<T; i++) {
				String a = br.readLine();
				String[] str = a.split(" ", 2);
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);
				String ans = Integer.toString(x+y); // BufferedWriter.write는 String 계열의 인자값을 받음
				bw.write(ans+'\n');
				
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
