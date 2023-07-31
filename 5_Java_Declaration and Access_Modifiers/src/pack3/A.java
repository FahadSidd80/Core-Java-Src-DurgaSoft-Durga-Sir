package pack3;



interface Say {
	 default void m2() {// Default methods are allowed only in interfaces.
			System.out.println("A class method m2 is default and it will called only in current package");
		}
	// Abstract method  
	    void sayMore(String msg);  
}

public class  A implements Say  { // class A is public class

//	public  void m1() { // m1() member act as public member
//		System.out.println("A class method m1 is called becz it is public !");
//	}
//	
//	 default void m2() {// Default methods are allowed only in interfaces.
//		System.out.println("A class method m2 is default and it will called only in current package");
//	}
 public void sayMore(String msg){        // implementing abstract method   
    System.out.println(msg);  
}  
	public static void main(String[] args) {
		Say Nm = new Say();
		Nm.m2();
		Nm.sayMore("Work is worship");  // calling abstract method  
	}

}


//interface Sayable{  
//    // Default method   
//    default void say(){  
//        System.out.println("Hello, this is default method");  
//    }  
//     
//}  
//public class C implements Sayable{  
//   
//    public static void main(String[] args) {  
//        C dm = new C();  
//        dm.say();   // calling default method  
//       
//  
//    }  
//}  
//

