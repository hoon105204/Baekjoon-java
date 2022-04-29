package chap05;

public class SelfNumber {
    public static void main(String[] args) {

		int[] arr = new int[10000];
		for (int k = 1; k < 10000; k++) {
			if (arr[k] == 0) {
				System.out.println(k);
				arr[k] = 1;
				int i = d(k);
				while (i < 10000) {
					arr[i] = 1;
					i=d(i);
				}
			}
		}

	}

	public static int sumNumb(int numb) {
		int sum = 0;
		String str = Integer.toString(numb);
		for (int i = 0; i < str.length(); i++) {
			sum += (int) (str.charAt(i)) - (int) ('0');
		}
		return sum;
	}

	public static int d(int n) {
		return n + sumNumb(n);
	}

}
