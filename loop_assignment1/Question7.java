package loop_assignment1;

public class Question7 {
	public static void main(String[] args) {
		int i;
		int b = 2;
		int a = 7;
		for(i=0;i<=4;i++) {  // 다섯 줄 출력 명령
			while(b<a) {  
				System.out.print(b+" ");
				b++;
			}
			b = b-4; // 7에서 3 8에서 4 이런식으로
			a++; // 최댓값 증가시키기
			System.out.println(); //줄바꾸기
		}
	}
}

