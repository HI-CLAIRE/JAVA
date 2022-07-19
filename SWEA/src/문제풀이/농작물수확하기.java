package 문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class 농작물수확하기 {

	public static void main(String[] args) {
		
		//Input Testcase
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int num=0; num<T; num++) {
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			
			//Intput Array
			sc.nextLine();
			for(int i=0; i<n; i++) {
				String str = sc.nextLine();
				for(int j=0; j<n; j++) {
					arr[i][j] = str.charAt(j) - 48;
				}
			}
			System.out.println(Arrays.deepToString(arr));
			
			//Sum diamond
			int sum = 0;
			int mid = 2/n + 1;
			for(int i=0; i<n; i++) {
				int d = Math.abs(i - mid);
				
			}
		
		}
		
	}

}
