package ddit.chap07.sec02;

public class Computer extends Product{

	int price = 19000;
	
	Computer(){
		super(15000);
	}
	
	@Override
	public String toString() {
		return "SAMSUNG NoteNook";
	}
	
}
