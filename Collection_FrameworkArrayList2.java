import java.util.ArrayList;

public class Collection_FrameworkArrayList2 {

	public static void main(String[] args) {
		
		// [0]:ArrayList 객체 생성 --> 제네릭을 사용
		ArrayList<String> ar = new ArrayList<String>();
		
		// [1]:추가 --> add()
		ar.add("홍길동");
		ar.add("이순신");
		ar.add("강감찬");
		ar.add("을지문덕");
		ar.add("김유신");
		System.out.println(ar.get(3));
		String str = ar.get(0); 	// 형변환 없이 바로 사용 --> 타입 안정성 높아짐
//		int num = (int)ar.get(0); 	// 컴파일 단계에서 오류 발견
		
		// [2]:수정 --> set(인덱스, 수정값)
		ar.set(3, "징키스칸");
		System.out.println(ar.get(3));
		
		// [3]:삭제 --> 2가지(하나만 삭제 / 한꺼번에 삭제) --> remove(인덱스)
		ar.remove(3);
		System.out.println("----------------[삭제 후 출력]");
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
		System.out.println("----------------[삭제 후 출력]");
		
		// [4]:출력 --> 향상된 for문
		for(String str1 : ar)
			System.out.print(str1 + " ");
		System.out.println();
		
		// [5]:출력2
		for(int i=0;i<ar.size();i++)
			System.out.printf("%d번 학생의 이름은 %s 입니다.%n", (i+1), ar.get(i));
//			System.out.println(ar.get(i));
		
		// [6]:한꺼번에 삭제 --> removeAll(배열명)
		ar.removeAll(ar);
		System.out.println(ar.size());
		System.out.println("----------------[전체 삭제 후 출력]");
		for(String str2 : ar)
			System.out.println(str2);
		System.out.println("----------------[전체 삭제 후 출력]");
		
	}

}
