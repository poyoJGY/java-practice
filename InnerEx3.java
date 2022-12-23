package ch7;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;	// 외부 클래스의 private멤버도 접근 가능하다.
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		int siv = outerIv;	// 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
		static int scv = outerCv;
	}
	
	void myMethod() {	// 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용 가능.
		int lv = 0;
		final int LV = 0;	// JDK1.8부터 final 생략 가능(값이 바뀌지 않는다는 전제 조건)
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
// 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능하다.
			int liv3 = lv;		// error, (JDK1.8부터 에러 아님)
			int liv4 = LV;
		}
	}

}
