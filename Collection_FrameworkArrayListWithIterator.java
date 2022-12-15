
public class Collection_FrameworkArrayListWithIterator {

	public static void main(String[] args) {
		
		// [!]:Iterator(반복자)란 무엇인가?
		// 사전적 의미 --> '반복자'라는 의미에서 어느정도 유추할 수 있듯이 Collection에 대한 '반복자'이다.
		// 컬렉션 프레임워크내에는 다양한 컬렉션들이 있는데 요소(=원소)를 읽어올 때 Iterator 인터페이스로 표준화 하고 있다.
		// 보통 for 반복문을 사용하여 순회할 때 --> index로 각 요소를 순회하나 --> Iterator(반복자)를 이용하면 조금 더 편리하게 할 수 있다.
		// Iterator(반복자)는 인터페이스다 --> 그래서, 인터페이스내 선언된 메소드들이 있다. --> 주요 메소드 암기!
		
		// hasNext(), next(), remove() --> 반환타입은 --> boolean, Object(제네릭), void
		// hasNext()		--> 다음 요소가 있는지를 검사하여 true를 리턴
		// next() 			--> 다음 요소를 리턴 --> 그런 후 다음 위치로 커서가 이동 --> Iterator에서는 삭제하지 않고, 커서만 이동
		// remove() 		--> 제거
		
		// next() 메소드의 경우 --> 배열에 값이 없을 때 사용하면 --> 당연히 오류 발생(주의)
		// 따라서, 사전에 hasNext()메소드를 사용하여 --> 다음 요소가 있는지 확인 후 --> next()메소드로 안전하게 요소를 가져온다
		// 임포트 필요 --> import java.util.Iterator;
		
	}

}