
public class Array_OneTwoArray4 {

	public static void main(String[] args) {
		
		// charAt() 메소드 사용 
		// --> 해당 인덱스에 있는 값을 변환
		// --> 단어를 char 배열에 한글자씩 저장할 수 있음
		String[] strAr = {"hong", "kim", "park"};
		System.out.println(strAr[0].charAt(2));
		System.out.println(strAr[1].charAt(2));
		System.out.println(strAr[2].charAt(2));
				
		// 반복문에서 charAt()메소드 사용
		// 잘못된 예제1
		for(int i=0;i<strAr.length;i++) {
			System.out.print(strAr[i].charAt(i));
		}
		System.out.println();
				
		// 잘못된 예제2
		for(int i=0;i<strAr.length;i++) {
			for(int j=0;j<strAr.length;j++) {
				System.out.print(strAr[i].charAt(j));
			}
		}
		System.out.println();
		
		// 잘못된 예제3
		System.out.println(strAr.length); //3
//		System.out.println(strAr[0].length); // Err
		System.out.println(strAr[0].length()); // 4
		
		for(int i=0;i<strAr.length;i++) {
			for(int j=0;j<strAr[i].length();j++) {
				System.out.print(strAr[i].charAt(j) + " ");
			}
		}
		System.out.println();

	}

}
