import java.util.Arrays;

public class Array_Basic008 {

	public static void main(String[] args) {
		
		// [1]
		int [] a, b, c;
		
		//[2]
		int d[], e[], f[];
		
		//[3]
		int g[], h, i;
		
		a = new int[3];
		b = new int[3];
		c = new int[3];
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		d = new int[6];
		e = new int[6];
		f = new int[6];
		
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
		
		g = new int[9];
//		h = new int[9]; 에러
		h = 100;
//		i = new int[9]; 에러
		i = 200;
		
		System.out.println(Arrays.toString(g));
		System.out.println(h);
		System.out.println(i);
		

	}

}
