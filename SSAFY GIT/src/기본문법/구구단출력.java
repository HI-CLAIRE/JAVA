package 기본문법;

import java.util.Scanner;

public class 구구단출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		while(true) {
			if(n == 0) {
				System.out.println("프로그램 종료");
				sc.close();
				return ;
			}
			for(int i=1; i<=9; i++) {
				int mul = i * n;
				System.out.printf("%d * %d = %d\n", n, i, mul);
			}
			System.out.print("다음 숫자 입력 : ");
			n = sc.nextInt();
		}
	}
		
}
