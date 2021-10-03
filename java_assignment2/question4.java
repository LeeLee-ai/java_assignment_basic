package java_assignment2;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("민수의 키와 몸무게를 입력하십시오");
		int height1 = input.nextInt();
		int weight1 = input.nextInt();
		System.out.println("기영이의 키와 몸무게를 입력하십시오");
		int height2 = input.nextInt();
		int weight2 = input.nextInt();
		if(height1>height2 && weight1>weight2) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		input.close();
	}	
}
