package example;

public class Quadrangle {
	
	double dot1, dot2;	
	
	//������ ����
	public Quadrangle(double dot1, double dot2) {
		this.dot1 = dot1;
		this.dot2 = dot2;
	}
	
	//ù��° �簢�� x,y��ǥ�� �ι�°x,y��ǥ �� & ù��° �簢�� x,y��ǥ�� ����°x,y��ǥ �� �޼���
	public String Compare(Quadrangle quad1, Quadrangle quad2, Quadrangle quad3) {
		int count = 0;
		String a="";
		String b="";

		if(quad1.dot1 >= quad2.dot1 && quad1.dot2 >= quad2.dot2) {
			count++;
			a = "\n\n-> ù��°�簢���� �ι�°�簢���� ���ԵǾ����ϴ�.";
		}else {
			a = "\n\n-> ù��°�簢���� �ι�°�簢���� ���Ե����ʾҽ��ϴ�.";
		}
		
		if(quad1.dot1 >= quad3.dot1 && quad1.dot2 >= quad3.dot2) {
			count++;
			b = "\n-> ù��°�簢���� ����°�簢���� ���ԵǾ����ϴ�.";
		}else {
			b = "\n-> ù��°�簢���� ����°�簢����  ���Ե����ʾҽ��ϴ�.";
		}
		return (count + a + b);
	}
}
