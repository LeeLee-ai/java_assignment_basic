package loop_assignment2;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("별을 몇 줄 출력할 건지 입력하십시오:");
		int line = input.nextInt();
		int space = 0;
		int num = line + (line-1); // 처음에 출력될 별 개수
		for(int i = 1; i<= line; i++) {
			for(int a = 0; a<space; a++) { // 띄어쓰기 개수 반복문
				System.out.print(" ");
			}
			for(int n = 1; n<=num;n++ ) {// 별 출력 반복문
				System.out.print("*");
			}
			num -= 2; // 다음 줄에 출력될 별 갯수 줄이기
			space += 1; // 띄어쓰기 늘리기
			System.out.println();
		}
		input.close();
	}
}
