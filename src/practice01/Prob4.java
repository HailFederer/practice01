package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String st = scanner.nextLine();
				
		for(int i=0; i<st.length(); i++){
			System.out.println(st.substring(0, i+1));
		}

		scanner.close();
	}
}