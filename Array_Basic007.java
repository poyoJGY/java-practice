import java.util.Arrays;

public class Array_Basic007 {

	public static void main(String[] args) {
		
		int[] sales_table = {238, 392, 491, 229, 943, 254, 843};
		
		System.out.println(Arrays.toString(sales_table));
		
		for(int i=0;i<sales_table.length;i++) {
			
			System.out.print(sales_table[i] + " ");
		}
		System.out.println();

	}

}
