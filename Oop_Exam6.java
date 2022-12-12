class PersonPerson {
	
	// [1]:속성(Attribute)
	int age;
	String name;
	
	// [2]:생성자(Constructor)
	PersonPerson() {}
	PersonPerson(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	// [3]:메소드(Method)
	void printPerson() {
		System.out.println("나이 : " + age + ", 이름 : " + name);
	}
	
}
public class Oop_Exam6 {

	public static void main(String[] args) {
		
		// [1]:객체 생성
		PersonPerson p1 = new PersonPerson(20, "홍길동");
//		System.out.println(p1);
//		System.out.println(p1.age);
//		System.out.println(p1.name);
		p1.printPerson();
		
		PersonPerson p2 = new PersonPerson(30, "이순신");
		p2.printPerson();
		
		PersonPerson p3 = new PersonPerson(40, "을지문덕");
		p3.printPerson();

	}

}
