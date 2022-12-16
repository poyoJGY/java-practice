package pkg2;

import pkg1.MyParent;

//import pkg1.MyParent;	// cmd+shift+O

class MyChild extends pkg1.MyParent {
	
	public void printMembers() {
//		System.out.println(prv);	// ERROR
//		System.out.println(dft);	// ERROR
		System.out.println(prt);	// OK
		System.out.println(pub);	// OK
		
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {

		MyParent p = new MyParent(); 
//				System.out.println(p.prv);	// ERROR
//				System.out.println(p.dft);	// ERROR
//				System.out.println(p.prt);	// ERROR
				System.out.println(p.pub);	// OK
		
	}	

}
