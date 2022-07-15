package 알고리즘문제풀이;

import java.util.Scanner;

public class 자릿수더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int[] arr = new int[5];
		
		int ans = 0;
		int i = 0;
		while(n > 0) {
			ans = ans + n % 10;
			n /= 10;
		}
		System.out.println(ans);
	}

}
