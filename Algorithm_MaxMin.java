
public class Algorithm_MaxMin {

	public static void main(String[] args) {
		
		// [1]:정수 배열 선언
		int[] ar = new int[10];
		
		// [2]:반복문을 돌면서 랜덤을 10개 정수 값을 셋팅 --> Math.random()
		for(int i=0;i<ar.length;i++) {
			ar[i] = (int)(Math.random()*100);
			System.out.print(ar[i] + " ");
//			System.out.println((int)(Math.random()*10));
		}
		System.out.println();
		
		// [3]:최댓값, 최솟값 변수 초기화
		int max = ar[0], min = ar[0];
		
		// [4]:반복문을 돌면서 최댓값, 최솟값 비교
		for(int i=1;i<ar.length;i++) {
			if(max<ar[i]) {
				max = ar[i];
			}
			if(min>ar[i]) {
				min = ar[i];
			}
		}
		System.out.println("최댓값:" + max + " "+ "최솟값:" + min);

	}

}
