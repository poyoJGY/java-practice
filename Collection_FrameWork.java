
public class Collection_FrameWork {

	public static void main(String[] args) {
		
		// [1]:Collection Framework란?
		// "수집품"이라는 사전적 의미에서 유추할 수 있듯이 "데이터 값들을 여러 그릇" 정도로 이해하면 된다
		// 집 부엌 찬장을 열어보면 종류별로 용도별로 그릇이 많이 있듯이 어떤 자료구조 데이터를 저장하고 관리할 것인지에 따라서 맞는 그릇을  써야 한다.
		// 내가 만들 프로그램의 데이터 처리를 어떻게 할지 그 특징을 잘 파악하여 컬렉션내 맞는 그릇(클래스)을 잘 골라써야 한다.
		// 이러한 것은 파이썬에서도 마찬가지이다. 용도에 맞는걸 써야 효율적이지 않겠는가?
		// 컬렉션 프레임워크는 크게 봤을 때 --> Collection과 Map으로 나뉘고 --> 이 둘은 모두 인터페이스(Interface)로 되어 있다.
		// Collection은 또 List와 Set으로 나뉘고 --> 이들도 인터페이스 --> 이들을 상속받아 다양한 형태의 배열(그릇, 클래스)로 사용된다.
		
		// [2]:Collection
		// Collection(인터페이스) --> 상속 --> List와 Set으로 구분(인터페이스) --> 상속 --> List 게열 구현 클래스 vs Set 게열 구현 클래스
		// List 계열 구현 클래스 --> ArrayList, LinkedList, Vector, Stack
		// Set 게열 구현 클래스 --> HashSet, SortedSet, TreeSet
		
		// [3]:List vs Set
		// 컬렉션 프레임워크와 핵심 인터페이스들
		// List 인터페이스를 상속하는 클래스들 특징 --> (1)인덱스가 있고, (2)그래서 저장 순서가 유지되고, (3)데이터 중복이 허용
		// Set 인터페이스를 상속하는 클래스들 특징 --> (1)데이터 중복이 허용 안됨
		
	}

}
