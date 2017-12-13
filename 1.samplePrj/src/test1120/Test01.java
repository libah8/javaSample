package test1120;

public class Test01 {
	int number = 100; //인스턴스변수
	public void printValue(){
		int number = 100;//지역변수
		change(number);
		System.out.println(number);
		System.out.println(this.number);	
	}
	
	
	public void change(int number){
		number += number;
	}
	public static void main(String[] args) {
		Test01 test = new Test01();
		test.printValue();
		}
	}


