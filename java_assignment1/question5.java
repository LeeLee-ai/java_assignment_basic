package java_assignment1;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("야드 값을 입력하시오:");
		double yard = input.nextDouble();
		double centi = yard*91.44;
		System.out.print("centimeter "+Math.round(centi*10)/10.0+"cm");
		input.close();
	}
}
