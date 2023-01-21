package ch14;

public class Ex14_0 {

	public static void main(String[] args) {
//		Object obj = (a, b) -> a > b ? a : b;	// 람다식. 익명 개체
//		MyFunction f = new MyFunction() {
//			public int max(int a, int b) {	// 오버라아딩 - 접근제어자는 좁게 못바꾼다.
//				return a > b ? a : b;
//			}
//		};
		
		// 람다식(익명 객체)을 다루기 위한 참조변수의 ㅌ타입은 함수형 인터페이스로 한다.
		MyFunction f = (a, b) -> a > b ? a : b;	// 람다식. 익명 개체
		
		int value = f.max(3, 5);	// 함수형 인터페이스
		System.out.println("value=" + value);
	}

}

@FunctionalInterface	// 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
interface MyFunction {
//	public abstract int max(int a, int b);
	int max(int a, int b);
//	public abstract int max2(int a, int b);
}
