package java_assignment3;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("달을 입력하십시오");
		int month = input.nextInt();
		if((month%2==1 && month<8) || (month%2==0 && month>7 && month<13)) { // 8월이 되기전까지는 홀수달이 31일 그 이하는 반대)
			System.out.println("31일");
		}
		else if(month!=2 && ((month%2==0 && month<8) || (month%2==1 && month>7 && month<13))) { // 2월이 아니고 8월이 되기전까지는 짝수달이 30일 8월이 된 이후는 그 반대
			System.out.println("30일");
		}
		else if(month == 2) { // 2월은 28일이거나 윤년인 경우 29일
			System.out.println("28일이나 29일");
		}
		else {
			System.out.println("1년은 12개월입니다");
		}
		input.close();
	}
}
