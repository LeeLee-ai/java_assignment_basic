package java_assignment2;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("비교할려는 정수 두개를 입력하시오");
		int a = input.nextInt();
		int b = input.nextInt();
		boolean bo_1 = a>b;
		boolean bo_2 = a<b;
		boolean bo_3 = a>=b;
		boolean bo_4 = a<=b;
		System.out.println(a+">"+b+"---"+bo_1);
		System.out.println(a+"<"+b+"---"+bo_2);
		System.out.println(a+">="+b+"---"+bo_3);
		System.out.println(a+"<="+b+"---"+bo_4);
		input.close();
	}
}
