package 문제풀이;

import java.util.Scanner;
import java.util.Arrays;

public class Teacher_농작물수확하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for(int i=0; i<N; i++) {
				String str = sc.next();
				char[] charArr = str.toCharArray();
				for(int j=0; j<N; j++) {
					arr[i][j] = charArr[j] - '0';
				}
				System.out.println(Arrays.deepToString(arr));
			}
			int sum = 0;
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					int mid = N / 2;
					int d = Math.abs(r - mid);
					int start = 0 + d;
					int end = (N-1) - d;
					if(start <= c && c <= end) {
						sum += arr[r][c];
					}
				}
			}
//			int cnt = 0;
//			for (int row = 0; row < N; row++) {
//				for (int col = 0; col < N - Math.abs(N / 2 - row); col++) {
//					if (col >= Math.abs(N / 2 - row)) {
//						cnt += N_Arr[row][col];
//					}
//				}
//			}
			System.out.printf("#%d %d\n", tc, sum);
		}
		sc.close();
	}

}
