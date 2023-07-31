
public class Java_Main_Method {
//	12:30 PM / 1/3/2023
//	1. Without  main method it will compile but not execute at run time : RE

//	 static public void main(String[] args) {
////  2. order of modifier is not important.
////  3. we can declare string array in any acceptable form.
//		 
//		 
//	}
//	 public static void main(String []args) {
//		 
//	 }
//	 public static void main(String args[]) {
//		 
////	 }
//	public static void main(String fahad[]) {
////		 4. instead of args we can take any valid java identifiers.
//		System.out.println("Fahad");
//	 }
	
//	5. we can replace string with var-arg parameter.
	
//	static public void main(String... x) {
//		System.out.println("Hello world !!");
//	}

//	6. we can delclare mainmethod with following modifiers.
	
//	static final synchronized strictfp  public void main(String... fahad) {
//		System.out.println("Valid main method !!");
//	}
//	 related to syntax above thing is fine.
	
//	Functionality wise ---
	
//	Case 1 :- overloading of main method is also possible 
//	but JVM implicitly called only String[] args main method only.
//	and the other overloaded main method we have to called it explicitly. like normal method.
	
//	public static void main(String[] args) {
//		System.out.println("String[]");  // called it by default/ implicitly.
//	}
//	public static void main(int[] args) {
//		System.out.println("int[]"); // need ot study more or see videos
//	}
	
//	public static void main(String[] args) {
//		//System.out.println("parent main");
//		c obn = new c();
//		obn.m1();
//	}
//	
//}
//class c extends Java_Main_Method{
//	public void m1() {
//		System.out.println("Child called");
//	}
//}
//// this show inheritance concept is applicalble for main method.
//	public static void main(String[] args) {
//			System.out.println("Parent main");
//		}
//  Enhancement wrt main method/
	
//	Until 1.6 v class doesn't contain main method. then we will get RE: NoSuchMethodError : main, but from 1.7v onwards we are getting more elaborated error.
	
//	static {
//		System.out.println("Static block !!'");
//	} // From 1.7v onwards main mehtod is mandatory to start the program execution hence even though class contain staic block
	// it won't be executed if class doesnt conatin main method.
//	static {
//		System.out.println("Static block !!");
////		System.exit(0);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("Main method !!'");
//	}
	
	
}

//class c extends Java_Main_Method {
//	public static void main(String[] args) {
//		System.out.println("Child main");
//	}
//	It seems method  over riding but it is method  hiding.
//	From above we can conclude that.. for main method inheritance 
//	and method over loading is applicalble only.
	 
	
//}
