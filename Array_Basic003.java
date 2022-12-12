
public class Array_Basic003 {

	public static void main(String[] args) {
		
		int[] sales_table = new int[5];
		
		sales_table[0] = 3;
		sales_table[1] = 11;
		sales_table[2] = 22;
		sales_table[3] = 33;
		sales_table[4] = 44;
		
		System.out.println(sales_table[0]);
		System.out.println(sales_table[1]);
		System.out.println(sales_table[2]);
		System.out.println(sales_table[3]);
		System.out.println(sales_table[4]);
		System.out.println(sales_table[sales_table.length - 1]);

	}

}
