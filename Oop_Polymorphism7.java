class Person7 {}
class Batman extends Person7 {}

class Human {}
class Superman extends Human {}

public class Oop_Polymorphism7 {

	public static void main(String[] args) {
		
		// [1]:배열에서 다형성을 사용햘 수 없다면
		// 배열 --> 동일한 타입의 데이터를 하나로 묶어서 관리하는 자료구조 --> 다형성이 없다면 각 객체별로 관리를 해야한다.
		Person7[] persons = new Person7[10]; // 이건 Person7 전용
		persons[0] = new Person7();
		persons[1] = new Person7();
		persons[2] = new Batman();
				
		Batman[] batmans = new Batman[10]; // 이건 Batman 전용
		batmans[0] = new Batman();
		batmans[1] = new Batman();
//		batmans[2] = new Person7(); // Err
				
		// [2]:배열에서 다형성을 사용할 수 있다.
		Human[] humans = new Human[10];
		humans[0] = new Human();
		humans[1] = new Superman();
		
		// [3]:매개변수의 다형성
		// 프로그래밍 언어에서 함수나 메소드를 호출할 때는 그에 맞는 적절한 파라미터를 보내줘야 한다.
		// System.out.println() 메소드의 경우 어떤 타입, 객체를 매개변수로 받더라도 에러없이 해당 객체의 값을 출력.
		// 그것이 가능한 이유 --> 바로 다형성을 활용하고 있기 때문이다.
		// 실제 메소드의 API를 보면 --> public void println(Object x)로 되어 있기에 어떤 객체 타입이 전달되더라도 에러 없이 출력이 되는 것이다.
		// 결론적으로, Object는 가장 최상위 조상(단군 할아버지)이므로 어떤 객체를 보내도 그 보다 상위 타입이 된다.
		System.out.println(new Person7());
		System.out.println(new Batman());
		System.out.println(new Human());
		System.out.println(new Superman());
		
		
	}

}
