
public class IfBasic {

	public static void main(String[] args) {
		
		int kor = 10, eng = 10, math = 60;
		int total_score;
		
		total_score = kor + eng + math;
		
		if(total_score>= 210) {
			System.out.println("축하");
		}
		else if (total_score>= 200) {
			System.out.println("축하하");
		}
		else {
			if (math >=70) {
				System.out.println("수학점수가" +math+ "이므로 재수강 대상자가 아닙니다.");
			}
			else {
				System.out.println("수학점수가" +math+ "이므로 재수강 대상자입니다.");
			}
				
		}
		

	}

}
