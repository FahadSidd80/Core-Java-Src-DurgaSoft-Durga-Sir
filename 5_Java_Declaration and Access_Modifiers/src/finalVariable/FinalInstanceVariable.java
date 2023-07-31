package finalVariable;

public class FinalInstanceVariable {

//	int x;
//	final int  y;
//	final int z = 10;
//	final int p;
//	{
//		p=20;// inside instance block
//	}
//	final int k;
//	FinalInstanceVariable(){
//		k=50; // inside constructer
//	}
//	final int m;
//	public void m1() {
//		m=90;// The final field FinalInstanceVariable.m cannot be assigned
//	}
	final int x=10;
	
	public static void main(String[] args) {
		FinalInstanceVariable  t = new FinalInstanceVariable();
//		System.out.println(t.x);
//		System.out.println(t.y);//The blank final field y may not have been initialized
//		at finalVariable.FinalInstanceVariable.<init>
		
//		For final variable we have compulsory provide initialization before constructor complition
//		 and this is done only at three places.
		
//		At the time of declaration
//		System.out.println(t.z);// 10
//		System.out.println(t.p);// 20
//		System.out.println(t.k);// 50
//		System.out.println(t.m);// The blank final field m may not have been initialized
								// The final field FinalInstanceVariable.m cannot be assigned
								// at finalVariable.FinalInstanceVariable.<init>(FinalInstanceVariable.java:16)
							    // at finalVariable.FinalInstanceVariable.main(FinalInstanceVariable.java:21)
		
		
		FinalInstanceVariable  C = new FinalInstanceVariable();
		System.out.println(t.x);// 10
		
		System.out.println(C.x);// 10
		
		
		

	}

}
