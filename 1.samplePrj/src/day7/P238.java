package day7;

public class P238 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.display();
		t1.power();
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		t1.display();
		
		Tv t2 = new Tv();
		t2.display();
		t2.color = "red";
		t2.channelUp();
		t2.channelUp();
		t2.display();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		
		
		
	}

}

class Tv{
	//TV의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	//TV의 기능(메서드)
	void power() {
		this.power = !this.power;
		}
	void channelUp(){
		++this.channel;
		}
	void channelDown(){
		--this.channel;
		}
	void display(){
		System.out.printf("TV[%s channel:%d 전원(%b)%n", this.color, channel, power);
	}
}


