import java.util.Arrays;

public class Method_TwoReturn1 {
	
	public static int[] testMethod() {
		
		int num1 = 100;
		int num2 = 200;
		return new int[] {num1, num2};
	}

	public static void main(String[] args) {
		
		// 배열 변수 선언 --> 메소드로부터 반환 받을 값이 배열이기 때문에
		int result[] = testMethod();
		
		// 출력
		System.out.println(result[0] + "-" + result[1]); // 각각 출력
		System.out.println(result[0] + result[1]); // 300
		System.out.println(result); // 주소 값 출력
		System.out.println(Arrays.toString(result)); // 반복문 사용 없이 한방에 모든 요소 출

	}

}
