package 기본문법;

public class TeacherDigitTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i=0; i<5; i++) { //행 : 0부터 4까지
			for(int j=0; j<5; j++) { //열: 0부터 4까지
				if(i <= j) {
					System.out.printf("%3d", ++cnt);
				} else {
					System.out.printf("%3s", "");
				}
			}
			System.out.println();
		}
	}

}
