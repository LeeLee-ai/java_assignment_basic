package java_assignment1;

public class question2 {
	public static void main(String[] args) {
		for (int a=1; a<27; a++)  // T ���ڼ��� ���缭 ���� ���κп� �ش��ϴ� �͵鸸 �պ���
			if(a==10) { // �ٹٲ޸� �ϸ� ��
				System.out.println("T");
			}
			else if(a==20 || a==22 || a==24) { // �ٹٲ� �� �������
				System.out.println("T");
				System.out.print("    ");
			}
			else {
				System.out.print("T");
			}
	}
}
