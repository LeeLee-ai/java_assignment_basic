package java_assignment1;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("�ߵ� ���� �Է��Ͻÿ�:");
		double yard = input.nextDouble();
		double centi = yard*91.44;
		System.out.print("centimeter "+Math.round(centi*10)/10.0+"cm");
		input.close();
	}
}
