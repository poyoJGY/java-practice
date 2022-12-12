
public class Method_ExamStatic2 {
	
	public void helloWorld() {
		
		System.out.println("Hello, World~");
	}

	public static void main(String[] args) {
		
		// 메소드 호출
		//helloWorld(); // 메인 메소드는 static 메소드만 호출 할 수 있기 때문에 에러
				
		// 객체 생성 후 메소드 호출
		Method_ExamStatic2 jes = new Method_ExamStatic2();
		jes.helloWorld();

	}

}
