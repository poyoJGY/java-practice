
public class License_CosPattern5 {

	public static void main(String[] args) {
		
		// [1]:2차원 배열의 행과 열 선언
		int R = 5, C = 5;
		
		// [2]:char 2차원 배열 선언 및 요소 값 입력 셋팅
		char[][] ar = new char[][] {
			{'#','#','#','#','#'},
			{'#','#','#','#','#'},
			{'#','#','★','#','#'},
			{'#','#','#','#','#'},
			{'#','#','#','#','#'}
		};
		
		// [3]:2차원 배열에 들어있는 요소 값들을 출력 --> 반복문
		System.out.println("----------------------");
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("----------------------");

	}

}
