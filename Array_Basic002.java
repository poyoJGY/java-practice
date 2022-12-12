
public class Array_Basic002 {

	public static void main(String[] args) {
		
		int[] scores = new int[10];
		int s_size = scores.length;
		
		System.out.println(scores[0]);
		System.out.println(scores[9]);
//		System.out.println(scores[10]);
		System.out.println(scores[10-1]);
		
		System.out.println(s_size);
		System.out.println(scores[s_size-1]); // 마지막 인덱스 값 10행과 같음
	}

}
