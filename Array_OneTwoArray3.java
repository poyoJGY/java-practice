
public class Array_OneTwoArray3 {

	public static void main(String[] args) {
		
		String[][] asia_nations = {
				{"한국", "중국", "일본"},
				{"태국", "베트남","필리핀"}
		};
		System.out.println(asia_nations[0][0]);
		
		System.out.println(asia_nations.length);
		System.out.println(asia_nations[0].length);
		System.out.println(asia_nations[1].length);
		
		// 반복문을 사용한 String 2차원 배열 값 출력
		for(int i=0;i<asia_nations.length;i++) {
			for(int j=0;j<asia_nations[i].length;j++) {
				System.out.print(asia_nations[i][j] + "");
			}
			System.out.println();
		}
		
	}

}
