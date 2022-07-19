package 문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class 농작물수확하기 {

	public static void main(String[] args) {
		
		//Input Testcase
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int num=1; num<=T; num++) {
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
//			System.out.println(Arrays.deepToString(arr));
			
			//Sum diamond
			int midIdx = n/2;
			int sum = 0;
			for(int x=0; x<n; x++) {
				for(int y=0; y<n; y++) {
					if(Math.abs(midIdx - x) <= y && y <= n - 1 - Math.abs(midIdx - x))
						sum += arr[x][y];
				}
			}
			System.out.printf("#%d %d\n", num, sum);
		
		}
		
	}

}
