
public class Method_MethodCall2 {

	public static void sum(Method_MethodCall2 a) {
		
		System.out.println("sum()메소드 안에서 a값 출력 --> " + a);
	}
	public static void main(String[] args) {
		
		// 변수 선언 및 메소드 호출
		// Wrapper클래스의 Integer클래스 타입으로 변수 a를 선언하고, new로 객체를 생성하여 해당 주소 값을 메소드로 보낸다.
		Method_MethodCall2 a = new Method_MethodCall2();
		sum(a);
		
		// 출력
		System.out.println("main()메소드 안에서 a값 출력 --> " + a);

	}

}
