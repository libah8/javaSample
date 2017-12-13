package day13.product;

public class ProductTest {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Computer());
		buyer.buy(new TV());
		buyer.buy(new VCR());
		buyer.buy(new HP());
		
	}
}
class Product{
	int price;
	int point;
}

class TV extends Product{}
class Computer extends Product{}
class VCR extends Product{}
class HP extends Product{}
class Audio {}

class Buyer{
	int money;
	int point;
	void buy(Product p){
		money -= p.price;
		point += p.point;
	}
}