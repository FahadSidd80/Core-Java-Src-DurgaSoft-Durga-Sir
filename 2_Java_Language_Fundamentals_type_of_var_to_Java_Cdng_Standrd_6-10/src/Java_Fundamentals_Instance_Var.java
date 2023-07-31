
public class Java_Fundamentals_Instance_Var {

	String  name; // instance  variable
	int  rollno;
	
	public class Student {
		String  name; // instance  variable
		int  rollno;
		
//		 with in the class but outside of any method/block or constructor.
		
	}
	
	class test{
		int x= 10; // instance  variable
		
		 void m1(){
			int x=10; // not instance  variable
		}
		
		 test()  // constructor
		 {
			 int x= 20; //  not instance  variable
		 }
	}
	 void test(){
		int x =20;
	}
	 
	 static { // static block
		 int x= 10; // not instance  variable
	 }
	 
//	 we can't access instance variable directly from static area
//	 but we can access it by using object reference
//	 but we can access instance variable directly fiom instance area.
	 
	 
	 
	public static void main(String[] args) {
//		 Types of variable
//		  Based on type of value represented by  a variable  all variable are divided into 2 types.
//		1. Primitive Variable
//		2. Non-Primitive/reference Variable
		
//		primitive can be used to represent primitie value:-
//		int x = 10;
//		
//		Non- primitive can be used to refer objects
//		 Student s = new Student();
		
//		Division:-
//		based on position of declaration and behaviour all variables are divided into 3 types
//		1. instance variable
//		2. Static variable
//		3. local variable
		
//		Instance:- 
//				if the value of variable varied from objct to objct such variable called instance variable.
		
//		for every objct a sepearte copy of instance variable will be created.
		
		
		
		

	}

}


