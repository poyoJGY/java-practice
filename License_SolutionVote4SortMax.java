import java.util.Arrays;

public class License_SolutionVote4SortMax {

	public static void main(String[] args) {
		
		// [1]:정수형 배열 선언
		int[] vote_box = {4,7,5,9,3,6,8};
		
		// [2]:오름차순으로 정렬
		Arrays.sort(vote_box);
		
		// [3]:출력
		System.out.println(Arrays.toString(vote_box));
		
		// [4]:최솟값, 최댓값
		System.out.println("최솟값 = " + vote_box[0]);
		System.out.println("최댓값 = " + vote_box[vote_box.length-1]);

	}

}
