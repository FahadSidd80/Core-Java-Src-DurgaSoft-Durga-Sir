package finalVariable;

public class finalLocalVariable {

//	Instance variable
//	int x;
//	public int x1;
//    int x2;
//    private int x3;
//    protected int x4;
//    final int x5=0;
    
	
	
//	Static variable
//	static int y;
//	static public int y1;
//	static  int y2;
//	static private int y3;
//	static protected int y4;
//	final static int y5=0;
	

	
	
	public static void main(String[] args) {
//		Local Variable:-
//		We can declare it inside Method/block and constructor
//		also called  _ temporary,stack,automatic variable
		
//		int x;
//		System.out.println("hello");// hello
//		int y;
//		System.out.println(y);// The local variable y may not have been initialized at finalVariable.finalLocalVariable.main

//		final int x;
//		System.out.println("Hello");// Hello
		
//		The only applicable modifier for local variable is final.
		
//		 Local variable
		
//		final int z=10;
//		public int z1=0;// Illegal modifier for parameter z1; only final is permitted
//		int z2=10;
//		private int z3=10;
//		protected int z4=10;
		
//		Formal parameter of a method.
//		formal paramater of a method simply access local variable of that method.
//		Hence, formal paramaetr can be decalred as final
//		if formal paramaetr declared as final then, within the method we can't perform reassingment.
		
		m1(10,20);
		
		
		 
		
		
		


	}

//	public  static void m1(final int x, final int y) {
//		x=100;
//		y=200;
//		System.out.println(x+"..........."+y);//The final local variable x cannot be assigned. It must be blank and not using a compound assignment
//											  // //The final local variable y cannot be assigned. It must be blank and not using a compound assignment
//
////		at finalVariable.finalLocalVariable.m1(finalLocalVariable.java:66)
////		at finalVariable.finalLocalVariable.main(finalLocalVariable.java:54)
//
//	}
//	public static void m1(int x,int y) {
//		System.out.println(x+"................"+y);// 10................20
//
//	}
//	public static void m1(int x,int y) {
//		x=100;
//		y=200;
//		System.out.println(x+"................"+y);// 100................200
//
//
//	}
//	public static int m1(int x,int y) {
//		x=100;
//		y=200;
//		return x;
////		return y;// Unreachable code // nahi samajh aaya
//
//		System.out.println(x+"................"+y);// 100................200
//
//
//	}
}
