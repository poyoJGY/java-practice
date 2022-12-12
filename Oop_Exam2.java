class FarmMachine {
	
	// [1]:속성(특징)
	int price;		// 가격
	int year;		// 연식
	String color;	// 색상
	
	// [2]:동작/기능/행동(method) --> 농기계 마다 동장이 다양할 것이므로 처음에는 공통적인 동작을 생각해본다.
	void move() {
		System.out.println("Farm-machine is moving.");
	}
	
	void dig() {
		System.out.println("Farm-machine is digging.");
	}
	
	void grind() {
		System.out.println("Farm-machine is grinding.");
	}
}

public class Oop_Exam2 {

	public static void main(String[] args) {
		
		// [1]:객체 생성
		FarmMachine fm = new FarmMachine();
		System.out.println(fm);
		
		// [2]:생성된 객체에 속성 값 입력하기
		fm.price = 1000000;
		fm.year = 2020;
		fm.color = "red";
		
		// [3]:속성 값 출력하기
		// String fm_price = String.format("%,d", fm.price);
		System.out.println(String.format("%,d", fm.price));
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		// [4]:동작 수행하기
		fm.move();
		fm.dig();
		fm.grind();

	}

}
