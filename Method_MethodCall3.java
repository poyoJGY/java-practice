class TestNumber {
	int num;
	TestNumber(int num) {
		this.num = num;
	}
}
public class Method_MethodCall3 {
	
	public static void sum(TestNumber a) {
		
		System.out.println("sum()메소드 안에서의 a값 --> " + a); //a값 (TestNumber 주소)을 출력해보면 주소가 들어있음을 알 수 있다.
		System.out.println(a.num);
		a.num += 400;
		System.out.println(a.num);
		
	}

	public static void main(String[] args) {
		
		// 객체 변수 선언
		TestNumber a = new TestNumber(100);
		sum(a);
		
		System.out.println("------------------------");
		System.out.println(a);
		System.out.println(a.num);

	}

}
