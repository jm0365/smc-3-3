public class TriangleExam {
	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2 , 17.3);
		System.out.println("�ﰢ���� ����: "+ tr.getArea());
		tr.setSize(7.5, 9.2);
		System.out.println("����� �ﰢ���� ����: "+ tr.getArea());
	}
}
class Triangle{
	double bottom;
	double height;
	public Triangle(double bt, double hg) { //������
		this.bottom = bt;
		this.height = hg;
	}
	public void setSize(double bt, double hg) {  //�Լ�1
		this.bottom = bt;
		this.height = hg;
	}
	public double getArea() {   //�Լ�2
		return bottom*height/2;
	}
}