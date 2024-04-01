package ddit.chap06.sec02;

public class Tv {
	private String company;
	private int year;
	private double size;
	
	Tv(String company, int year, double size){
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	Tv(){}
	
	public void printInfor() {
		System.out.println("제조회사 : " + this.company);
		System.out.println("생산년도 : " + year);
		System.out.println("크기 : " + size + "인치");
		
	}
}
