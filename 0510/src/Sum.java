import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b=0;  // �Է� �޴� ����
		int sum=0;  // �հ� ����
		System.out.print("���� ����: ");
		a = scan.nextInt();
		System.out.print("������ ����: ");
		b = scan.nextInt();
		for(int i=a; i<=b; i++) {
			sum += i;   // sum = sum+i;
		}
		System.out.println(a+" ����"+b+" ������ ���� "+sum);
	}
}



