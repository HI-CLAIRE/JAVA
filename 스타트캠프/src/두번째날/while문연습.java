package 두번째날;

public class while문연습 {
	public static void main(String[] args) {
		//N번 반복한다.
		int N = 5;
		int i = 0;
		while(i < N) {
			System.out.println(i++);
		}
		System.out.println(i); //4까지는 출력했는데, 5가 되면 while문을 빠져나온다.
		System.out.println("--------------");
		//a부터 b까지 반복한다.
		int a = 3; int b = 8;
		i = a;
		while (i <= b) {
			System.out.println(i++);
		}
	}
}
