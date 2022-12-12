class Person8 {
	// Field
	public Object obj;
	
	// Constructor
	Person8 (Object obj) {
		this.obj = obj;	
	}
}

class Student2 {
	// Field
	public int grade;
	
	// Constructor
	Student2 (int grade) {
		this.grade = grade;
	}
}

class Teacher {}

public class Collection_Generic2 {

	public static void main(String[] args) {
		
		// [1]:객체 생성
		Person8 p1 = new Person8(new Student2(1));
//		System.out.println(p1.obj);
		
		// [2]:형변환 --> Cast
		Teacher s1 = (Teacher)p1.obj; // 이 부분은 컴파일 단계에서는 에러가 안나고, 실행하는 단게에서 ClassCast 오류가 발생한다.
		

	}

}
