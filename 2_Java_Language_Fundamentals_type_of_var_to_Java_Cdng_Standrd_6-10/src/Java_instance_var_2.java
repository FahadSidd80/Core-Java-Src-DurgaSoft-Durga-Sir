
public class Java_instance_var_2 {
	
int x = 10; // IV

int y;
double d;
boolean b;
String s;
byte bt;
short st;
long l;
float f;
char ch;
// JVM provide by default value to instance variable
	public static void main(String[] args) {
		
//		System.out.println(x); // Cannot make a static reference to the non-static field x
		Java_instance_var_2  t = new Java_instance_var_2();
//		System.out.println(t.x); // 10
		System.out.println(t.y); // 0
		System.out.println(t.d); // 0.0
		System.out.println(t.b); // false
		System.out.println(t.s); // null
		System.out.println(t.bt); // 0
		System.out.println(t.st); // 0
		System.out.println(t.l); // 0  
		System.out.println(t.f); // 0.0
		System.out.println(t.ch); // 1 space bar 
		
	}
	
	public void m1() {
		System.out.println(x);
	}

}
