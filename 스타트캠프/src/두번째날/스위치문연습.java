package 두번째날;

public class 스위치문연습 {
	public static void main(String[] args) {
		int num = 5;
		
		switch (num) {
		case 1:
			System.out.println("남자입니다.");
			break;
		case 2:
			System.out.println("여자입니다.");
			break;
		case 3:
			System.out.println("2000년 이후 남자입니다.");
			break;
		case 4:
			System.out.println("2000년 이후 여자입니다.");
			break;
		case 5:
		case 6:
			System.out.println("외국인입니다.");
			break;
		}
	}
}
