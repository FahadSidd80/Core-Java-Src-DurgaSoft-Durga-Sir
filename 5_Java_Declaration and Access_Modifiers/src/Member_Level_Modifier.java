//import packdefault.A;
//import packdefault.imp;

public class Member_Level_Modifier {

//	static int x=10;
//	int y=20;
	
//	int x=10;
//	static int x=10;
//	int x=10;
	
	String name;
	int rollno;
	int marks;
	static String cname;
	
	public static void main(String[] args) {
//		Member_Level_Modifier also called  Method or variable level modifier
//		Member is like variable and method in class
//		for inner class applicable modifier is 8
		
//		1. Public member : If a member declared public then we can access it anywhere but before that we 
//		should check the class visibility also.
		
//		2. default member :- If member declared as default then we can access it only with in current package
//		so it is also called package level access.
		
//		Eg:- // Best / Perfect example of default method/modifier
//			interface imp {
//			default void m1() {
//				System.out.println("Default method!!");
//			}
//		}
//		public class A implements imp{
//			public static void main(String[] args) {
//				A a = new A();
//				a.m1();
//			}
//		}
		
//		3. Private member :- If a member declare private it can access only within class.
		
//		Member_Level_Modifier d = new Member_Level_Modifier();
//		d.pvtmethod();
		
//		4. Protected member:-[the most misunderstood modifier in java]
		
//		Lecture 37:  
//		Final Variable : If value of variable is varied from object to object then this variable
		
//		5. static modifier
//		applicable at method and variable not for classes.
//		we cant declare top level class as  static but we can declare inner level class as static
//		[such type of innerclass are called static neasted class]
		
//		In case of  instance variable for every object a separate copy of object will be created
//		but in case of static variable  a single copy of object will be created at class level and shared by every object of that class.
		

//		Member_Level_Modifier  t1 = new Member_Level_Modifier();
//		t1.x=888;// static
//		t1.y=999;// instance
//		
//		Member_Level_Modifier t2 = new Member_Level_Modifier();
//		System.out.println(t2.x+"................"+t2.y);// 888................20
		
		
//		System.out.println(x);//10
//		m1();// 10
//		
//		Member_Level_Modifier d = new Member_Level_Modifier();
//		d.m1();// 10
//		d.m1();// Cannot make a static reference to the non-static field x
		
//		d.m1();// 10
		
//		Static method: Overloading concept-
		
//		Case 1: Overloading concept is applicable for static methods including main method but 
//		JVM will always call String main mehtod
		
//		Overloading :  Same method name but different parameter
		
//		System.out.println("String[]");// String[]
		
//		Static method: Inheritance concept-
//		Inheritance concept is applicable for static methods including main methods.
//		Hence while executing child class if child class doesnot conatin main method then parent class main method will be executed.
		
//		System.out.println("parent main");
		
//		CASE 3rd:

//		get_studentinfo();
		
//		get_collegeinfo();
//	
//		int x = getAverage(2,2);
//		System.out.println(x);//2
		
//		Lecture 39 : Native and transient
		
		
		
		
		
		
		
		
		

	}
	
//	String  get_studentinfo(){// // instance method
//		return name+"...."+marks;
//	}
//	
//	static	String   get_collegeinfo(){// static method
//		return cname;
//	}
//	
//	static int getAverage(int x, int y){// static method
//		return (x+y)/2;
//		
//	}
	
//	String getCompeteInfo(){// instance method
//		return name + "......"+rollno + "......."+ marks +"........."+cname;
//	}
	

//	
//	public static void main(int[] args) {
//		System.out.println("int[]"); // parent main
//	}
//	
	
	
//	public static  void m1() {
//		System.out.println(x);// Cannot make a static reference to the non-static field x
//	}
	
//	public   void m1() {
//		System.out.println(x);
//	}

//	private void pvtmethod() {
//		System.out.println("private method!!");
//	}
//	
}// class end


class Native{
	static {
		System.loadLibrary("native library path");
		
	}
	public native void m1();
}
class client{
	public static void main(String[] args) {
		Native n = new Native();
		n.m1();
		
	}
}
//
//class Child extends Member_Level_Modifier{ 	// parent class
//
//	public static void main(String[] args) {
//		System.out.println("Child method");
//	}
//}

//class two {
//	Member_Level_Modifier d = new Member_Level_Modifier();
//	d.pvtmethod();
//}

