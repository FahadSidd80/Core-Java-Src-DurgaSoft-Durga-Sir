package pack1protected;

public class proc1 {
	protected void m1() {
		System.out.println("Protecetd method !!");
	}
}
class B extends proc1{
	
		public static void main(String[] args) {
			proc1 p = new proc1();
			p.m1();// Protecetd method !!
			
			B b = new B();
			b.m1();//Protecetd method !!
			
			proc1 pp = new B();
			pp.m1();//Protecetd method !!
		}
	
}
