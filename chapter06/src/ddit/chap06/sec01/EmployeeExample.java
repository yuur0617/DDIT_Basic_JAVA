package ddit.chap06.sec01;

public class EmployeeExample {
	static Employee[] employees;
	
	public static void main(String[] args) {
		System.out.println("�����ȣ\t\t�����\t�޿�\t�μ���");
		System.out.println("------------------------------------------------------------");
		
		Employee e1 = new Employee(20230828001L, "ȫ�浿");
//		e1.setDepName = "IT���ߺ�";	//private�� �������ֱ⶧���� ����Ҽ�����
		
		e1.setDepName("IT���ߺ�");
		
		e1.setSalary(200000);
		
		System.out.println(e1.toString());
	}

}
