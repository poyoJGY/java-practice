
public class Array_OneTwoArray {

	public static void main(String[] args) {
		
		//[1]:String 1차원 배열 --> 3개의 문자열을 담을 수 있는 배열 생성하기
		//String 타입의 참조 변수 3개를 저장하기 위한 공간 생성 
		//--> 이때, 참조형 변수는 각 요소는 기본값 
		//--> null로 초기화
		String[] province = new String[3];	
		System.out.println(province[2]);
		
		//[2]:String배열 초기화 --> 직접 입력
		province[0] = "강원도";
		province[1] = "전라도";
		province[2] = "경상도";
		System.out.println(province[1]);
		
		//[3]:String 배열 초기화 --> 배열 선언 및 생성시 {}로 동시에 초기화
		String[] nation = new String[]{"한국", "미국", "중국"};
		System.out.println(nation[1]);
		
		String[] flower = {"무궁화", "해바라기", "개나리"};
		System.out.println(flower[1]);
		
		//[4]:반복문을 사용하여 배열 값 모두 출력
		for(int i=0;i<flower.length;i++) {
			System.out.print(flower[i] + " ");
		}
		System.out.println();
		
		//[5]:향상된 for문으로 배열 요소 출력
		for(String s:flower) {
			System.out.print(s+" ");
		}
		System.out.println();

	}

}
