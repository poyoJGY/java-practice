import java.util.ArrayList;
import java.util.Iterator;

public class Collection_FrameworkArrayListWithIterator2 {

	public static void main(String[] args) {
		
		// [1]:객체 생성
		ArrayList<String> list = new ArrayList<>();
		
		// [2]:요소 추가 --> add()
		list.add("Alligator");
		list.add("Hippo");
		list.add("Ostrich");
		list.add("Donkey");
		
		// [3]:Iterator(반복자) 객체 생성 --> 객체 생성 과정도 중요!
		// Collection 인터페이스 --> iterator() 메소드를 정의하고 있고 --> 이를 상속받는게 List, Set 인터페이스이므로,
		// List, Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해서 iterator() 메소드를 사용할 수 있음.
		Iterator<String> iter = list.iterator();
		
		// [4]: Iterator(반복자) 메소드 사용 --> hasNext(), next(), remove()
//		System.out.println(iter.hasNext()); // true --> 첫 번째 요소인 악어가 있으니깐
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext()); // true --> 두 번째 요소인 하마가 있으니깐
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext()); // true --> 세 번째 요소인 타조가 있으니깐
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext()); // true --> 네 번째 요소인 당나귀가 있으니깐
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext());
		
		// [5]:요소 출력 --> 향상된 for문
		for(String s : list)
			System.out.println(s);
		
		// [6]:요소 출력 --> while 반복문 사용
		// 문제 속의 문제1 --> 배열 요소 전체를 출력해보시오
		// 문제 속의 문제2 --> 아래의 출력 결과를 예상하여 말해보시오
		// 문제 속의 문제2 --> Hippo 요소만 출력해보시오
		// 문제 속의 문제2 --> Hippo 요소만 삭제해보시오
		System.out.println("-------------------------------[Iterator(반복자)로 출력]");
		while(iter.hasNext()) {
			String str = iter.next();
			if("Hippo".equals(str)) {
				iter.remove();
				System.out.println("하마 삭제");
			}
//			System.out.println(iter.next());
		}
		System.out.println("-------------------------------[Iterator(반복자)로 출력]");
		
		for(String s : list)
			System.out.println(s);
	}

}
