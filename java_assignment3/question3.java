package java_assignment3;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args){
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("번호를 입력하시오");
		int num = input.nextInt();
		switch (num)
		{
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know");
			break;
		}
		input.close();
	}
}
