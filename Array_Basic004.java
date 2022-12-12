
public class Array_Basic004 {

	public static void main(String[] args) {
		
		int[] sales_table = {55, 88, 60, 100, 90};
		System.out.println(sales_table[1]);
		
		int[] sales_table2 = new int[] {55, 88, 60, 100, 90};
		System.out.println(sales_table2[2]);
		
//		int[] sales_table3;
//		sales_table3 = {55, 88, 60, 100, 90}; // 에러
		
		int[] sales_table3;
		sales_table3 = new int[]{55, 88, 60, 100, 90};
		System.out.println(sales_table3[3]);

	}

}
