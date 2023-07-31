
public class Java_Var_Arg_method {
	// internally var-arg method converted into 1_D array.
//	hence within this we can differentiate value by ising index./
	
//	public static void m1(int... x) {
////		System.out.println("Var_Arg-Method");
////		System.out.println("The no of arguments "+ x.length);// it prints 1_D array length
//	}
	
//	public static void main(String[] args) {
//		m1(); // Var_Arg-Method -- The no of arguments 0
//		m1(10);  // Var_Arg-Method -- The no of arguments 1
//		m1(10,20); // Var_Arg-Method -- The no of arguments 2
//		m1(10,20,30); // Var_Arg-Method -- The no of arguments 3
//		m1(10,20,30,40); // Var_Arg-Metod -- The no of arguments 4
		
//		m2(); // Var_Arg-Method -- The no of arguments 0
//		m2(10);  // Var_Arg-Method -- The no of arguments 1
//		m2(10,20); // Var_Arg-Method -- The no of arguments 2
//		m2(10,20,30); // Var_Arg-Method -- The no of arguments 3
//		m2(10,20,30,40); // Var_Arg-Metod -- The no of arguments 4

//		m1(10,20,30,40); // int...
//		m2();
//		Java_Var_Arg_method t = new Java_Var_Arg_method();
//		t.m1(10);
//		m1(); // var-agr method
//		m1(10,20); // var-agr method
//		m1(10); // general method -- less priority to var arg method you can see in this example
//	
//	m1(new int[] {10}); // 1-D array passed
//	m1(new int[] {10,20,}); // 1-D array passed
//	m1(new int[] {10,20,30}); // 1-D array passed	
//}
//	Case 1:-
//	public static void m3(int[] x) {}
//	public static void m4(int x[]) {}
//	public static void m5(int  []x) {}
	
//	public static void m1(int... x) {}
//	public static void m2(int ...x) {}
//	public static void m3(int x...) {} // invalid
//	public static void m4(int...x) {}
//	public static void m5(int. ..x) {}// invalid
//	public static void m6(int .x..) {} // invalid
	
//	case 2:-
	
//	public static void m1(int x, int... y) {}
//	public static void m2(String s,double...  z) {}
	
//	Case 3:-
	
//	public static void m1(double... d, String S) {} //The variable argument type double of the method m1 must be the last parameter
//	public static void m2(char ch, String... S) {}
	
//	Case 4:-
	
//	public static void m1(double... d,int... x) {} // The variable argument type double of the method m1 must be the last parameter
//	
	
//	Case 5:- related to oops concept
	
//	public static void m1(int... x) //-- m1(int[])
//	{ 
//		System.out.println("int...");
//	}
//	public static void m2(int[] x)  //-- m1(int[])
//	{
//		System.out.println("int[] ");
//	}
//	
//	public  void m1(int i) // m1(int) // Duplicate method m1(int) in type Java_Var_Arg_method
//	{
//		System.out.println("m1_1st");
//	}
//	public  int m1(int i)// m1(int) // Duplicate method m1(int) in type Java_Var_Arg_method
//	{
//		System.out.println("m1_2nd");
//	}
//	
//	public static void m1(int... x) {} // Duplicate method m1(int[]) in type Java_Var_Arg_method
//	public static void m1(int[] x) {} // Duplicate method m1(int[]) in type Java_Var_Arg_method
//	
//	---------------------------------------------------------------------------------------------------------
	
//	Case 6 :-
//	public static void m1(int... x) {
//		System.out.println("var-agr method");
//	}
//	public static void m1(int x) {
//		System.out.println("general method");
//	}
	
//	Array concepts 
////	Whenever 1-D array is present we can replace it with var-arg parameter
//	public static void m1(int[] x) {}
//	public static void m1(int... x) {}
	
//	public static void main(String... args) {
//		System.out.println("Hello var arg main method... Whenever 1-D array is present we can replace it with var-arg parameter");
	
//		m1(); // var_arg method
//		m1(10); // var_arg method
//		m1(20,30); // var_arg method
//		m1(new int[] {10}); // 1-D array passed
//		m1(new int[] {10,20,}); // 1-D array passed
//		m1(new int[] {10,20,30}); // 1-D array passed
	
//	}
	
//	public static void m1(int... x) {
//		System.out.println("var_arg method");
//	}
	
//	public static void m1(int[] x) {
//		System.out.println("1-D array passed");
//	}
	
//	Equivalence between var-arg parameter and 1-D array
//	public static void main(String... S) {
////		System.out.println("var-arg main method'");
//		m1(); //var-arg  method'
//		m1(10);
//		m1(10,20); // var-arg  method'
//	}
	
//	public static void main(String[] S) {
//		System.out.println("1-D array main method'");
//		m1(); // var-arg  method'
//		m1(10); // var-arg  method'
//		m1(10,20); // var-arg  method'
//		m1(new int[] {10,20});
		
//		m1(); The method m1(int[]) in the type Java_Var_Arg_method is not applicable for the arguments ()
//		m1(10); The method m1(int[]) in the type Java_Var_Arg_method is not applicable for the arguments (int)
//		m1(10,20); The method m1(int[]) in the type Java_Var_Arg_method is not applicable for the arguments (int, int)
//	}
//	public static void main(String...  S) {
//		m1(); // error
		
//		m1(new int[] {10,20});
//	}
//	Whenever  var-arg parameter is present we can replace it with 1-D array.
//	public static void m1(int... x) {}
//	public static void m1(int[] x) {}
	
//	public static void m1(int... x) {
//		System.out.println("var-arg  method'");
//	}
	
//	public static void m1(int[] x) {
//		System.out.println("1-D array  method'");
//	}
	
//	Dimension wise :-
//	1. m1(int... x)  we can call this method by passing the group of int values and  x will become 1-D array (int[] x)
//	2. m1(int[]... x)  we can call this method by passing the group of 1-D int array and x will become 2-D int array (int[][] x)
//  3. m1(int[][]... x)	 we can call this method by passing the group of 2-D int array and x will become 3-D int array (int[][][] x)
	
//	m1(int... x) => int[] x
//	m1(String... S) => String[] s
//	m1(int[]... x) => int[][] x
//  m1(int[][]... x) => int[][][] x
//	
//	public static void main(String[] args) {
//		int[] a = {10,20,30};
//		int[] b = {40,50,60};
//		int[] c = {30,40,50};
////		m1(a,b);
////		m1(c);
//		m1(a,b,c);
//	}
//	public static void m1(int[]... x) {
//		for(int[] x1 : x) {
//			System.out.println(x1[0]); // 10, 40
//		}
//	
////		System.out.println(x[0]); // 30 // [I@2c7b84de
////		System.out.println(x[1]); // [I@3fee733d
//	}
//	
//	private static void m1(int[] a, int[] b, int[] c) {
//		
////		for(int[][] x1 : x) {
////			System.out.println(a[0]);
////			System.out.println(c[2]);
////		}
//		
//	}
//
//	public static void m1(int[][][]... x) {
//		for(int[][][] x1 : x) {
//			System.out.println(x1[0]); 
//		}
//	
//		System.out.println(x[0]); 
//	}
	
//	public static void m2(int...   x) {
//		int total = 0;
//		for(int x1 : x) {
//			total = total+x1;
//		}
//		for(int x1=0; x1<x.length; x1++) {
//			total = total + x[x1];
//		}
//		System.out.println("The sum of all m2 parameter or index element of 1-D array: "+ total);
		
//	}
	


}
