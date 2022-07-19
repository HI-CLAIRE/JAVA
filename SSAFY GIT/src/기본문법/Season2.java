package 기본문법;

import java.util.Scanner;

public class Season2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while (i<3) {
			int n = sc.nextInt();
			System.out.println("월 입력>>" + n);
			switch (n) {
				case 3:
				case 4:
				case 5:
					System.out.println(n+"월은 봄입니다.");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println(n+"월은 여름입니다.");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println(n+"월은 가을입니다.");
					break;
				case 1:
				case 2:
				case 12:
					System.out.println(n+"월은 겨울입니다.");
					break;
			}
			i++;
		}
		sc.close();
	}

}
