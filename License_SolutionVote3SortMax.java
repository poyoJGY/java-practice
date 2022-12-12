import java.util.Arrays;

class Solution1 {
	// Field
	
	// Constructor
	Solution1() {}
	// Method
	public void solutionMethod(int n, int[] vote_box) {
		
		// [1]:각 후보자 득표 수 출력 --> 정수형 배열은 0으로 초기화가 되어진다는 점을 활용 --> 즉, 처음에는 후보자 모두가 0득표라고 초기화 하자
		// 이때, 후보자는 1번부터 있고 0번 후보는 없으니깐 후보자 수 보다도 1 많게 배열의 크기를 만든다 --> 헷갈리지 않도록 주의
		int[] ar = new int[n+1];
		
		// [2]: 전달된 vote_box 배열을 반복문 돌면서 각 후보자별로 표를 받은득표 수 계산 --> 결과적으로 ar배열에는 득표한 수가 저장
		// 여기가 이 문제에서 가장 중요한 핵심 포인트중 한 곳
		for(int i=0;i<vote_box.length;i++) {
			ar[vote_box[i]]++;
		}
		
		// [3]:가장 많은 득표 수와 후보자 출력 --> 득표 수를 저장하고 있는 배열 --> ar[]
		// 이때, 0번 후보는 없으니깐 ar[0]번째 방의 득표 수는 항상 0이므로 아예 1번 부터 순회를 시킨다
		for(int i=1;i<ar.length;i++) {
			System.out.println(i+ "번 후보 --> " + ar[i] + "표");
		}
		
		// [4]:ar배열에서 가장 적은 득표 수, 가장 많은 득표 수 구하기
		// sort 함수 사용 --> 오름차순으로 정렬 --> 배열 첫 번째 값 : 최솟값, 마지막 값 : 최댓값
		Arrays.sort(ar);
		System.out.println("가장 적은 득표수(최솟값)은 = " + ar[1]);
		System.out.println("가장 많은 득표수(최댓값)은 = " + ar[ar.length-1]);
		int rst_max = ar[ar.length-1];
		
		// [5]:과반수 체크
//		System.out.println(vote_box.length/(double)2);
//		boolean aaa = 3 > 3.5;
//		System.out.println(aaa); // false
		boolean majority = rst_max > (vote_box.length/(double)2);
		if(majority)
		{
			System.out.println("과반수 이상 득표했습니다. --> 당선");
		}
		else {
			System.out.println("과반수 이상 실패했습니다. --> 미당선");
		}
	
	}
}

public class License_SolutionVote3SortMax {

	public static void main(String[] args) {
		
		// [1]:객체 생성
		Solution1 s1 =new Solution1();
		
		// [2]:득표한 표 수를 저장하는 정수형 배열 선언
		int[] vote_box = {1,3,1,3,3,2,2};
		
		// [3]: solutionMethod() 호출 --> 2개 입력 파라미터 값 전달 --> 후보자 수, 투표 박스 배열
		s1.solutionMethod(3,vote_box);
		

	}

}
