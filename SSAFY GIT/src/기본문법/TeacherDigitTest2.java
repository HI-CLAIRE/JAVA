package 기본문법;

public class TeacherDigitTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mid = 2;
		int cnt = 0;
		
		for(int i=0; i<5; i++) {
			int d = Math.abs(i - mid);
			int start = mid - d;
			int end = mid + d;
			for(int j=0; j<5; j++) {
				if(start <= j && j <= end) {
					System.out.printf("%3d", ++cnt);
				} else {
					System.out.printf("%3s", "");
				}
			}
			System.out.println();
		}
	}

}
