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
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		
		
		
	}

}

class Tv{
	//TV�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	//TV�� ���(�޼���)
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
		System.out.printf("TV[%s channel:%d ����(%b)%n", this.color, channel, power);
	}
}


