
public class number {

	public static void main(String[] args) {
		
		int a = 12345;
		
		String b = "12345";
		
		System.out.println(Integer.toString(a));
		
		String str = String.valueOf(a);
		
		System.out.println(str);
		System.out.println(str.length());
		
		System.out.println(b + 1);
		System.out.println(a + 1);
		
		int c = Integer.valueOf(b);
		
		System.out.println("답-->"+ (c + 1));
		
		

	}

}
