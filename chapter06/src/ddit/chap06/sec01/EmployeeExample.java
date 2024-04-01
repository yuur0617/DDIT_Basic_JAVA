package ddit.chap06.sec01;

public class EmployeeExample {
	static Employee[] employees;
	
	public static void main(String[] args) {
		System.out.println("사원번호\t\t사원명\t급여\t부서명");
		System.out.println("------------------------------------------------------------");
		
		Employee e1 = new Employee(20230828001L, "홍길동");
//		e1.setDepName = "IT개발부";	//private로 설정되있기때문에 사용할수없음
		
		e1.setDepName("IT개발부");
		
		e1.setSalary(200000);
		
		System.out.println(e1.toString());
	}

}
