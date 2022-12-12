import java.util.Arrays;

public class Array_Basic009 {

	public static void main(String[] args) {
		
		// [!]: 배열 복사하기
		//arraycopy() 메소드 사용 --> System.arraycopy(원본배열명, ???, 복사배열명, ???, 길이);
		
		int ar[] = {1, 2, 3, 4, 5};
		int ar2[] = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9};
		
		System.arraycopy(ar, 2, ar2, 4, 3);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar2));
		
	}

}
