
public class Java_Static_variable {

//	int rollno;
//	String name;
//static	String cname; 
////static int x =10;
//static int x;
//static double d;
//static String s;

static int x = 10;
int  y=20;

	public static void main(String[] args) {
		
//		Java_Static_variable t = new Java_Static_variable();
//		3-ways to access static variable
//		System.out.println(t.x); // 10 // object name
//		System.out.println(Java_Static_variable.x); // 10  class name
//		System.out.println(x); // 10  directly var name but with in the same class
//	 
//		System.out.println(x); // 0
//		System.out.println(d); // 0.0
//		System.out.println(s); // null

		Java_Static_variable t1 = new Java_Static_variable();
		t1.x = 888;
		t1.y=999;
		Java_Static_variable t2 = new Java_Static_variable();
		System.out.println(t2.x +"......"+ t2.y); // 888....20
		
	}
//	public void m1() {
//		System.out.println(x); 
//	}

}
