package 기본문법;

import java.util.Scanner;

public class 짝수합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("숫자 입력 >> %d\n", n);
		
		int ans = 0;
		for(int i=1; i<=n; i++) {
			if(i % 2 == 0) {
				ans += i;
			}
		}
		
		System.out.printf("1부터 %d까지 수 중 짝수의 합 = %d", n, ans);
		sc.close();
	}

}
