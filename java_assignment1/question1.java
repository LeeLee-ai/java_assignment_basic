package java_assignment1;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("Kor ");
		int Kor = input.nextInt();
		System.out.print("Mat ");
		int Mat = input.nextInt();
		System.out.print("Eng ");
		int Eng = input.nextInt();
		int sum = Kor+Mat+Eng;
		float Avg = sum/3;
		System.out.print("Sum "+sum+"\n");
		System.out.print("Avg "+Avg);
		input.close();
	}
}
