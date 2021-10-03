package java_assignment3;

import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("연도를 입력하십시오");
		int year = input.nextInt();
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}
		input.close();
	}
}
