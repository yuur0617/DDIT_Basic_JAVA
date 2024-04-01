package ddit.chap06.sec01;

public class Employee {
	private long empId;
	private String empName;
	private String depName;		//멤버변수이기때문에 자동초기화됨
	private int salary;
	
	Employee(long empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	public void setDepName(String depName) {	//외부에서 값을 받아서 맴버변수에 저장하는것
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
