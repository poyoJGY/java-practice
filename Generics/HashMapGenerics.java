package ch12;

import java.util.HashMap;

public class HashMapGenerics {

	public static void main(String[] args) {

		HashMap<String, Student2> map = new HashMap<>();	// JDK1.7부터 생성자에 타입 지정 생략 가능
		map.put("자바왕", new Student2("자바왕", 1, 1, 100, 100, 100));
		
		// public Student2 get(Object key)
		Student2 s = map.get("자바왕");
		
		System.out.println(map);
	}

}

class Student2 {
	String name = "";
	int ban;	// 반
	int no;		// 번호
	int kor;
	int eng;
	int math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
