
public class License_CosPattern2 {

	public static void main(String[] args) {
		
		// [1]:변수 선언
		int number = 1;
		
		// [2]:반복문 돌면 홀수인지 체크 --> 홀수면 Pass(continue)
		while(number<=30) {
			if(number%2 != 0) {
				number++;
				continue;
			}
			
			System.out.print(number+" ");
			number++;
		}
		System.out.println();

	}

}
