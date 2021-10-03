package java_assignment2;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("정수 두개를 입력하시오");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a++;
		int d = --b;
		int sum = c*d;
		String to_s = Integer.toString(a);
		String to_s2 = Integer.toString(b);
		String to_s3 = Integer.toString(sum);
		System.out.println(to_s+" "+to_s2+" "+to_s3);
		input.close();
		}
	}

