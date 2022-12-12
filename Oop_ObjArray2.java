class Person4 {
	// Field
	private String name;
	private int age;
	
	// Constructor
	Person4() {}
	Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Method
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}
public class Oop_ObjArray2 {

	public static void main(String[] args) {
		
		// [1]:객체 생성
		Person4[] pa = new Person4[5];
		
		// [2]:반복문(for)을 돌면서 Person4()객체 생성
		for(int i=0;i<pa.length;i++) {
			pa[i] = new Person4(i+"번 후보자", i+20);
			
			// [2-1]:getter, setter 메소드 사용해서 출력
			System.out.println(pa[i].getName() + " --> 나이:" +pa[i].getAge());
			
			// [2-2]:배열 인덱스 사용해서 출력 --> 단, 이렇게 쓰려면 private 선언을 삭제하고 써야함
//			System.out.println(pa[i].name + "의 나이는 " + pa[i].age + "살 입니다.");
			
			// [2-3]:printf()
//			System.out.printf("%s번 후보의 나이는 %d입니다.%n", pa[i].name, pa[i].age);

		}

	}

}
