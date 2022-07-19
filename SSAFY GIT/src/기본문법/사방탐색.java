package 기본문법;

import java.util.Arrays;

public class 사방탐색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int[][] arr = new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", cnt);
				arr[i][j] = ++cnt;
			}
			System.out.println();
		}
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				int sum = arr[r][c];
				for(int d=0; d<4; d++) {
					int nr = r + dr[d];
					int nc = c + dc[d];
					//경계처리
					if(nr>=0 && nr<5 && nc>=0 && nc <5) {
						//System.out.println("----");
						sum += arr[nr][nc];
					}
				}
				System.out.println("(" + r + "," + c + ") : " + sum);
			}
		}
	}

}
