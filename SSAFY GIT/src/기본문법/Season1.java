package 기본문법;

import java.util.Scanner;

public class Season1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			int n = sc.nextInt();
			System.out.printf("월 입력>>%d\n", n);
			if (3 <= n && n <= 5 ) {
				System.out.printf("%d월은 봄입니다.\n", n);
			}
			else if (6 <= n && n <= 8) {
				System.out.printf("%d월은 여름입니다.\n", n);
			}
			else if (9 <= n && n <= 11) {
				System.out.printf("%d월은 가을입니다.\n", n);
			}
			else if (n == 1 || n == 2 || n == 12) {
				System.out.printf("%d월은 겨울입니다.\n", n);
			}
		}
	}

}
