package java_assignment3;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("영문 대문자를 입력하시오");
		String a = input.nextLine();
		switch (a)
		{
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		case "E":
			System.out.println("Failure");
			break;
		default:
			System.out.println("Error");
			break;
		}
		input.close();
	}
}
