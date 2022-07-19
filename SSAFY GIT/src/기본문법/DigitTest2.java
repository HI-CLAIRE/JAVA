package 기본문법;

public class DigitTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		
		//top-down
		//int i=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; i++) {
				System.out.printf("%3s", "");
			}
			for(int j=0; j<5-(i*2); i++) {
				System.out.printf("%3d", n);
				n++;
			}
			
			System.out.println();
		}
		//bottom-up
		
		
	}

}
