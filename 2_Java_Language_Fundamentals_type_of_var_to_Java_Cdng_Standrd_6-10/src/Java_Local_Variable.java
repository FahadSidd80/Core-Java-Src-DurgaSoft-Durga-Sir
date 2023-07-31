
public class Java_Local_Variable {
	 
//	 int x =10; // instance - primitive
//	Integer x = 20; // instance - refernce
//	 static int y = 20; // static - primitive
//	 static String S = "Durga"; // static- Non_Primitive/reference
//	int[] x; // instance-primitive // only declaration
//	int[] x = new int[3];  //  instance-primitive //  declaration & creation
//	static int[] x; // static - refernce -- only declaration 
//	static int[] x = new int[3]; // static-refernce -- declaration & creation
//	int x;
//	static int y;
	 public static void main(String[] args) {
//		 3.Local variable :- temporary var./ automatic var./ stack var.
//		 declared inside method/block/constructor
		 
//		 int x = 10;
	
//		 System.out.println(x); // 10 inside main method/ block
//		Constructor concept nahi samajh aaya
		 
//		 for(int i=0; i<=3; i++) {
////			 System.out.println(i); // 0, 1, 2, 3
//		 }
//		 System.out.println(i); // i cannot be resolved to a variable
		
//			int i =0;
//			for(int j =0; j<3; j++) {
//				i=i+j;
////				System.out.println(i); // 0, 1, 2
////				System.out.println(i+"...."+j); // 0....0,  1....1, 3....2
//				
//			}
//			System.out.println(i+"...."+j); // j cannot be resolved to a variable
//			System.out.println(i); // 3
		 
//		 try {
//			 int  j = Integer.parseInt("ten");
//			 System.out.println(j);
//		 }
//		 catch(NumberFormatException e)
//		 {
////			 j=10;
////			 System.out.println(j); // j cannot be resolved to a variable
//		 }
//		 System.out.println(j); // j cannot be resolved to a variable
	 
//		 int x;
////		 System.out.println("Hello"); // Hello
//		 System.out.println(x); // The local variable x may not have been initialized becz for local var  X JVM never provide default value. like instance and Static variable.
		 
//		 int x;
//		 if(args.length > 0) {
//			 x = 10;
//			 System.out.println(x);
//		 }
//		 System.out.println(x); // The local variable x may not have been initialized
		 
		 
//		 int x;
//		 if(args.length > 0) {
//			 x = 10;
//		 }
//		 else {
//			 x=20;
//		 }
//		 System.out.println(x); // 20
//		final int z = 30;
		
//		System.out.println(z);
//		Java_Local_Variable t = new Java_Local_Variable();
//		System.out.println(x); //	Cannot make a static reference to the non-static field x
//		System.out.println(t.x); // 10
//		System.out.println(y); // 20
		 
//		 public int x = 10;
//		 private int a = 10;
//		 protected int b = 10;
//		 static  int c = 10;
//		 transient int d = 10;
//		 volatile  int e = 10;
//		 final int y = 10; // local - primitive
//		 System.out.println(x); // Illegal modifier for parameter x; only final is permitted
//		 System.out.println(a); // Illegal modifier for parameter a; only final is permitted
//		 System.out.println(b); // Illegal modifier for parameter b; only final is permitted
//		 System.out.println(c); // Illegal modifier for parameter c; only final is permitted
//		 System.out.println(d); // Illegal modifier for parameter d; only final is permitted
//		 System.out.println(e); // Illegal modifier for parameter e; only final is permitted
//		 System.out.println(y); // 10
//		 Java_Local_Variable t = new Java_Local_Variable();
//		 System.out.println(t.x); // 0 -- default value of instance var.
//		 System.out.println(y); // 0 -- default value of static var.
//		 Java_Local_Variable t = new Java_Local_Variable();
//		 System.out.println(t.x); // 20 instance - refernce
//		 int[] x = new int[3]; // local - refernce
//		 x[0]=10;
//		 System.out.println(x[0]); // 10 local - refernce 
//		 Java_Local_Variable t = new Java_Local_Variable();
//		 System.out.println(t.x); // null 
//		 System.out.println(t.x[0]); // Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "t.x" is null
//		 
//		 System.out.println(t.x); // [I@2c7b84de
//		 System.out.println(t.x[0]); // 0
//		 System.out.println(x); // null
//		 System.out.println(t.x); // null
//		 System.out.println(t.x[0]); //  java.lang.NullPointerException: Cannot load from int array because "Java_Local_Variable.x" is null
		 
//		 System.out.println(x); // [I@2c7b84de -- static-refernce -- declaration & creation
//		 System.out.println(x[0]); // 0  static-refernce -- declaration & creation
//		 int [] x; // local - refernce // declaration
//		 System.out.println(x); // The local variable x may not have been initialized
//		 System.out.println(x[0]); // The local variable x may not have been initialized
//		 int[] x = new int[3]; // local - refernce // declaration & creation
//		 System.out.println(x); // [I@2c7b84de
//		 System.out.println(x[0]); // 0
		 
		 
		 
		 
		 
		 
		 
		 
	 }
// Java_Local_Variable(){
//		 int x = 120;
//		 System.out.println(x);
//		
//	 }
//	 System.out.println(x); // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

}

