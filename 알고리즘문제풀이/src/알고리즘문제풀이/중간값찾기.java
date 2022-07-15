package 알고리즘문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//int[] arr = new int[N];
		int[] cnt = new int[101];
		
		for(int i=0; i < N; i++) {
			int num = sc.nextInt();
			cnt[num] += 1;
		}
		
		System.out.println(Arrays.toString(cnt));
		
		int sum = 0;
		for(int i=0; i<101; i++) {
			sum += cnt[i];
			if (sum > N/2) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
