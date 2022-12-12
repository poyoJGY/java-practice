// parseInt() 
// --> Integer 클래스의 static으로 지정 
// --> 따라서, 객체의 생성 없이 바로 "클래스명.parseInt()로 직접 사용 가능
// 두 번째 인자 값으로 진수를 지정 --> 해당 진수에 맞는 값이 됨 --> Integer.parseInt("1000", 2);

public class Oop_Exam_ParseInt {

	public static void main(String[] args) {
		
		// [1]:숫자끼리의 연산
		int a = 1;
		int b =2;
		int c = a + b;
		System.out.println("a + b = " + c);
		
		// [2]:문자열끼리의 ㅇ ㅕㄴ산
		String a1 = "1";
		String b1 = "2";
		String c1 = a1 + b1;
		System.out.println("a1 + b1 = " + c1);
		System.out.println(c1.getClass().getName());
		
		// [3]:문자열 --> 숫자로 변환 후 연산
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		int c2 = a2 + b2;
		
		System.out.println(c2);
		
		// [4]:진수 지정
		System.out.println("------------------------[진수 지정]");
		System.out.println(Integer.parseInt("2022"));
		System.out.println(Integer.parseInt("2022", 10));
		System.out.println(Integer.parseInt("1", 2));
		System.out.println(Integer.parseInt("1001", 2));
		System.out.println(Integer.parseInt("1004", 8));
		System.out.println(Integer.parseInt("A", 16));
		System.out.println(Integer.parseInt("FF", 16));
		System.out.println("------------------------[진수 지정]");
		
	}

}
