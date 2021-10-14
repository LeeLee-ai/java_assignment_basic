package loop_assignment2;

import java.util.Scanner;
import java.util.Random;

public class Question9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis()); // 랜덤 시드 임의 설정 (시드가 같으면 똑같은 수열이 출력)
		System.out.print("출력할 숫자판의 크기를 입력하십시오:");
		int size = input.nextInt();
		for(int i = 1; i<=size; i++) {
			for(int a = 1; a<=size; a++) {
				int b = rand.nextInt(9)+1; // 랜덤으로 1부터 9까지
				while(b%2==0) { // 짝수 거르는 반복문
					b = rand.nextInt(9)+1;
				}
				System.out.print(b+" ");
			}
			System.out.println();
		}
		input.close();
	}
}
