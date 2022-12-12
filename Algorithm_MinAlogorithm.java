
public class Algorithm_MinAlogorithm {

	public static void main(String[] args) {
		
		int[] ar = {4,13,15,17,-2};
		
		System.out.println(Math.max(10, 4));
		System.out.println(Math.min(10, 4));
		
//		int min = Integer.MAX_VALUE;
		
		int min = ar[0];
		
		for(int i=1;i<ar.length;i++) {
			if(min>ar[i]) {
				min = ar[i];
			}
		}
		System.out.println("현재 배열내 가장작은 값은:" + min);

	}

}
