
public class Method_Exam004 {
	
	public static String capitalMethod(String str) {
		
		String ret = str.toUpperCase();
		
		return ret;
	}

	public static void main(String[] args) {
		
		// 반환값 --> O	받는 인자값 --> O
		// 반환값이 있다는 것은 메소드(함수) 호출에 따른 리턴값이 있는 것이므로 호출시 리턴값을 받는 변수를 정의한다.
		String rst;
		rst = capitalMethod("korea");
		
		System.out.println("입력한 소문자의 대문자는 = "+ rst);

	}

}
