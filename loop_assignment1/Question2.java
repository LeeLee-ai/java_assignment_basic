package loop_assignment1;

import java.util.*;

public class Question2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int i = 0;
		do {
			System.out.print("100이하의 정수를 입력해주십시오:");
			num = input.nextInt();
		}  while (num>100);
		for(int a = num;a<=100;a++) {
			i =i + a;
		}
		System.out.println(i);
		input.close();
	}
}
