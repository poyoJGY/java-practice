class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product {
	
	Tv2() {
		super(100);
	}
	// Object 클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Tv";
	}
	
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
	
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
//		System.out.println(p.toString()+ "을/를 구입하였습니다.");
		System.out.println(p + "을/를 구입하였습니다.");
	}
}


public class PolyArgumentTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		
//		Product p = new Tv2();
//		b.buy(p);
		b.buy(new Tv2());
		
//		Product p = new Computer();
//		b.buy(p);
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점 입니댜.");
	}

}
