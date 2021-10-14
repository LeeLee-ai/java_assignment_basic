package loop_assignment2;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하십시오");
		int num = input.nextInt();
		double a = Math.sqrt(num);
		int count = (int)a; // 누적된 홀수의 갯수와 입력받은 수의 근 혹은 그 근의 정수값과 항상 같음
		int num2 = 0;
		int num3 = 1;
		for(int i = 1; i <= count ; i++) {
			num2 += num3;  // 0부터 누적합
			num3 += 2; // 더할 홀수가 2씩 증가
		}
		System.out.println(count+"번");
		System.out.println(num2);
		input.close();
	}
}
