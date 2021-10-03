package java_assignment3;

import java.util.Scanner;

public class question1 {
	public static void main (String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("아무 정수나 입력하십시오");
		int num = input.nextInt();
		if(num<0) {
			System.out.println("minus");
		}
		else if(num==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("plus");
		}
		input.close();
	}
}
