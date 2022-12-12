// 메소드의 종류 --> 크게 4가지 유형
// (1) 반환 값 --> X	받는 인자값 --> X
// (1) 반환 값 --> X	받는 인자값 --> O
// (1) 반환 값 --> O	받는 인자값 --> X
// (1) 반환 값 --> O	받는 인자값 --> O

public class Method_Exam002 {
	
	public static void plusMethod(int a, int b) {
		// 단순 출력
		System.out.printf("인자로 넘겨받은 2개의 값은 %d와 %d입니다.%n", a, b);
		
		// 연산 출력
		int rst = a + b;
		System.out.println("두 수를 더한값은 = " + rst);
		
	}

	public static void main(String[] args) {
		
		// [2]:반환갑 --> X	받는 인자값 --> O
		// 메소드가 받는 인자값이 있다는 것은 호출부에서 파라미터 값을 넘긴다는 뜻
		int a = 100, b = 200;
		plusMethod(a, b);
		
	}

}
