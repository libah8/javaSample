package day8;

public class P298 {

	public static void main(String[] args) {
		Car c1 = new Car("Red", 4, "Auto");
		Car c2 = c1;
		Car c3 = new Car(c1);
		
		c1.color = "Gray";
		
		System.out.println(c1.color);
		System.out.println(c2.color);
	}
}

class Car{
	String color;
	int door;
	String gearType;
	
	Car(){}
	Car(String color, int door, String gearType){
		this.color = color;
		this.door = door;
		this.gearType = gearType;
	}
	Car(Car c){
		this(c.color, c.door, c.gearType);
		//this.color = c.color;
		//this.door = c.door;
		//this.gearType = c.gearType;
	}
	
	public void display(){
		System.out.printf("Car[%s,%d,%s]%n",color,door,gearType);
	}
}
