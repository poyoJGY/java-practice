class Person6 {
	String str1 = "난 부모 클래스";
	void method1() {
		System.out.println("에이에이에이");
	}
	void ppp() {
		System.out.println("ppp");
	}
}

class Student1 extends Person6 {
	String str2 = "난 자식 클래스";
	void method1() {
		System.out.println("오버라이딩 - AAA");
	}
	void sss() {
		System.out.println("sss");
	}
	void x() {
		method1();
		super.method1();
	}
}

public class Oop_Polymorphism2 {

	public static void main(String[] args) {
		
		// [1]:객체 생성 --> 부모 + 자식 클래스의 모든 자원을 다 쓸 수 있다.
		Student1 s1 = new Student1();
		
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();
		s1.sss();
		s1.ppp();
		
		// [!]:자식 클래스에서 오버라이딩된 부모 클래스의 원본 메소드를 호출하고 싶다면? --> super 사용
		System.out.println("-----------------[super 사용]");
		s1.x();
		System.out.println("-----------------[super 사용]");
		
		// [2]:객체 생성 --> 범위는 부모의 자원만을 쓸 수 있다.(?)
		Person6 s2 = new Student1();
		
		System.out.println(s2.str1);
		// System.out.println(s2.str2); // Err --> 자식의 자원은 쓸 수 없다.
		s2.ppp();
		// s2.sss(); //Err --> 자식의 자원은 쓸 수 없다.
		s2.method1(); // 오버라이딩한거는 자식의 메소드로 실행
		
		//[!]:자식의 메소드를 바로 호출하고 싶다면? --> 캐스트 필요
		System.out.println("-----------------[캐스트 사용]");
		((Student1)s2).sss();
		System.out.println("-----------------[캐스트 사용]");

		// [3]:객체 생성
		Person6 p1 = new Person6();
		
		p1.method1();
		// p1.sss(); // Err
		
		// [4]:객체 생성 --> 상위(부모)클래스로 객체를 생성하면서 타입은 하위(자식)타입을 쓰는 경우 --> Err
		//Student1 bbb = new Person1(); // Err

	}

}
