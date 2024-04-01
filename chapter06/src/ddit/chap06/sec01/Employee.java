package ddit.chap06.sec01;

public class Employee {
	private long empId;
	private String empName;
	private String depName;		//��������̱⶧���� �ڵ��ʱ�ȭ��
	private int salary;
	
	Employee(long empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	public void setDepName(String depName) {	//�ܺο��� ���� �޾Ƽ� �ɹ������� �����ϴ°�
		this.depName = depName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return empId + "\t" + empName + "\t" + salary + "\t" + depName ;
	}

}
