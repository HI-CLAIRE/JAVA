package 알고리즘문제풀이;

import java.util.Scanner;

public class 간단한압축풀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc <= T; tc++) {
			System.out.println("#" + tc);
			int N = sc.nextInt();
			String str = "";
			for(int i=0; i < N; i++) {
				String c = sc.next();
				int num = sc.nextInt();
				for(int j=0; j<num; j++) {
					str += c;
				}
			}
			char[] arr = str.toCharArray();
			for(int i=0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if(i % 10 == 9) {
					if(arr.length % 10 == 9) {
						break;
					}
					else {
						System.out.println();
					}
				}
				
			}
			System.out.println();
		}
	}

}
