package 알고리즘문제풀이;

import java.util.Scanner;

public class 초심자의회문검사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String str = "";
		for(int i=0; i<n; i++) {
			String c = sc.next();
			str += c;
			System.out.println();
		}
		System.out.println(str);
		
		
	}

}
