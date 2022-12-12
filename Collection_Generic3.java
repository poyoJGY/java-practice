class Sample1<T> {
	
	private T obj;
	Sample1(T x) {this.obj = x;}
	T getObj() {return obj;}
	void printInfo() {System.out.println(obj.getClass().getName());}
}
	
public class Collection_Generic3 {

	public static void main(String[] args) {
		
		// [1]:객체 생성
		Sample1<String> s1 = new Sample1<String>("안녕하세요~");
		System.out.println(s1.getObj());
		s1.printInfo();
		System.out.println("-------------------");
		
		// [2]:객체 생성
		Sample1<Integer> s2 = new Sample1<Integer>(100);
		System.out.println(s2.getObj());
		s2.printInfo();
		System.out.println("-------------------");
		
		// [3]:형변환 없이 사용하기
//		String str = s1.getObj();
//		System.out.println(str.length());
		System.out.println(s1.getObj().length());
		System.out.println(s2.getObj()+100);

	}

}
