
public class If_ThreeOperator {

	public static void main(String[] args) {
		
		int hour = 10;
		
		int test = hour <= 10 ? hour*100 : hour;
		
		System.out.println(test);
		
		String str = hour < 12 ? "오전" : "오후";
		
		System.out.println(str);

	}

}
