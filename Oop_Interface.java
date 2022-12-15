
public class Oop_Interface {

	public static void main(String[] args) {
		
		// 사전적 의미 --> 결합부, 접속기 -->  사용자간 또는 컴퓨터간 통신이 가능하도록 해주는 디바이스나 프로그램
		// 큰 틀에서 본다면 자바에서의 인터페이스 개념도 사전적 의미와 비슷하다.
		// 상호간 통신을 위해서는 "규격"이 중요하다 --> 일본이 110v 가전제품을 한국으로 가지고 와도 "규격"이 맞지 않으므로 사용할 수 없다.
		// 일본의 가전기업들이 한국에서 전자제품을 팔고 싶다면 한국내 220v "규격"을 지켜서 만들어야만 팔 수 있다.
		// 이러한 "규격"을 인터페이스라 할 수 있고, 인터페이스는 하나의 "표준화"를 제공하는 것이라 할 수 있다.
		
		// 추상 클래스 vs 인터페이스?
		// 추 클래스와 거의 비슷하다. --> 그러나 그 추상화 정도가 더 높다(더 엄격하다). --> 따라서, 일반 메소드 멤버 필드(변수)를 가질 수 없다.
		// 이러한 점들이 추상 클래스와 인터페이스간 가장 큰 차이점중 하나이다. --> 더 있다라는 얘기...
		
		// 자바에서의 인터페이스 문법?
		// 표준화 및 규격을 인터페이스로 제공
		// 따라서 어떤 클래스가 해당 인터페이스를 사용(상속)한다면 인터페이스에 선언되어져 있는 메소드를 구현해야 한다.
		// 인터페이스는 class 키워드를 사용하지 않고 --> 별도의 interface 키워드를 사용한다.
		// class --> extends	interface --> implements
		// 추상 클래스와 같이 메소드의 구체적인 내용은 기술되어져 있지 않으므로 인터페이스를 상속받은 클래스에서 재정의(오버라이딩)하여 사용해야 한다.
		
		// 상속 vs 구현
		// 클래스와 인터페이스 이 둘의 가장 큰 차이점중 하나는 "상속"이다. --> a,b
		// 자바에서 클래스는 "단일 상속"만 가능하지만, 인터페이스는 "다중 상속"이 가능하다.
		// 그러나 인터페이스에서는 상속이라는 표현을  쓰지않고 implements
		// 그러나 인터페이스에서는 extends 표현을 쓰지않고 "구현"의 의미를 강조하는 implements 키워드를 사용하여 다중 상속을 구현한다.
		
	}

}