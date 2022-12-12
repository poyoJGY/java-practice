
public class SwtichBasic {

	public static void main(String[] args) {
		
		int age = 10;
		
		if (age > 10 && age < 20) {
			System.out.println("10이라고 치셈");
			System.exit(0);
		}
		else if (age > 20 && age <30) {
			System.out.println("20이라고 치셈");
			System.exit(0);
		}
		else { 
			if (age < 10) {
				System.out.println("어리넹");
				System.exit(0);
			}
		}

		
					
		
		switch(age) {
			case 10:
				System.out.println(age + "대 입니다.A");
				break;
				
			case 20:
				System.out.println(age + "대 입니다.B");
				break;
				
			default:
				System.out.println(age + "우와아");
				break;
		}
		
	}
}
