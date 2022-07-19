package 기본문법;

public class DigitTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		for (int i=0;i<5;i++) {
			for (int j=0; j<i; j++) {
				System.out.printf("%3s", "");
			}
			for (int j=0;j<5-i;j++) {
				System.out.printf("%3d", n);
				//System.out.print(" ");
				n++;
			}
			System.out.println();
		}
	}

}
