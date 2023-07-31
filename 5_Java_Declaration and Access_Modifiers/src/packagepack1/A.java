package packagepack1;

public class A {

	protected void m1() {
		System.out.println("Protected method in packagepack1.A ");
	}
	
	
}

class D { // D is non child class of same package
public static void main(String[] args) {
		A a = new A();
		a.m1();// Protected method in packagepack1.A 


	}

}

