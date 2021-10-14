package loop_assignment1;

import java.util.*;

public class Question3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("한개의 자연수를 입력하십시오");
		int num = input.nextInt();
		for(int i = 1; i<=10; i++) {
			System.out.print(num * i+" ");
		}
		input.close();
	}
}
