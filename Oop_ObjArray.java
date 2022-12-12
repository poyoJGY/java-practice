class Person3 {
	// Field
	private String name;
	private int age;
	
	// Constructor
	Person3() {}
	Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Method
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}
public class Oop_ObjArray {

	public static void main(String[] args) {
		
		// [1]:객체 생성
		int[] ar1 = {1, 2, 3, 4, 5};
		char[] ar2 = {'A','B','C','D','E'};
		Person3[] pa = new Person3[5];
		pa[0] = new Person3("홍길동", 20);
		pa[1] = new Person3("박길동", 21);
		pa[2] = new Person3("김길동", 22);
		pa[3] = new Person3("장길동", 23);
		pa[4] = new Person3("고길동", 24);
		
		// [2]:출력
		for(int i=0;i<pa.length;i++) {
			// System.out.print(pa[i].name + "\t");
			System.out.print(pa[i].getName() + "\t");
			System.out.print(pa[i].getAge() + "\t");
		}
		System.out.println();
		
	}

}
