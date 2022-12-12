
public class Method_MethodCall2_1 {
	
	public static void sum(Integer a) {
		
		System.out.println(a); // 주소 값이 찍히는게 아니라 100이라는 값이 찍힌다.
	}

	public static void main(String[] args) {
		
		// 변수 선언 및 메소드 호출
		// Wrapper클래스의 Integer클래스 타입으로 변수 a를 선언하고, new로 객체를 생성하여 해당 주소 값을 메소드로 보낸다.
		Integer a = new Integer(100);
		sum(a);
		System.out.println(a);

	}

}
