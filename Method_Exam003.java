
public class Method_Exam003 {
	
	public static int returnMethod() {
		
		int ret = 100;
		ret *= 100;
		return ret; // --- 10000
	}
	
	public static void main(String[] args) {
		
		// 반환값 --> O	받는 인자값 --> X
		// 반환값이 있다는 것은 메소드(함수) 호출에 따른 리턴값이 있는 것이므로 호출시 리턴값을 받는 변수를 정의한다.
		int rst;
		rst = returnMethod();
		
		// 출력
		System.out.println("메소드 호출에 따른 리턴된 값은 = " + rst);
	}

}
