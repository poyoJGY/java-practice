
// 메소드란 무엇인가?
// (1) 메소드는 른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위이다.
// (2) 반복적인 작업을 처리해야 하는 경우 메소드를 만들어 놓으면 이후에 필요할 때 다시 재사용할 수 있어서 아주 유용하다.
// (3) 메소드는 호출시 어떤 결과를 반환하기도 하지만 결과를 반환하지 않는 메소드도 있다.
// (4) 메소드는 호출시 어떤 인자 값들을 넘겨서 호출하는 경우도 있지만 인자 값 없이 호출하는 경우도 있다.

public class Method_Exam001 {
	
	public static void helloWorld() {
		System.out.println("Hello,World~");
	}
	
	public static void showMenu() {
		System.out.println("showMenu() 메소드가 호출되었습니다.");
	}

	public static void main(String[] args) {
		
		// [1]:반환값 --> X	받는 인자값 -- X
		showMenu();
		helloWorld();

	}

}
