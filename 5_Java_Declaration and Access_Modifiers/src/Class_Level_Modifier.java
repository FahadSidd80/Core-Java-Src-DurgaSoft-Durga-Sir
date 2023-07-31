
public  class Class_Level_Modifier {// this is top level class
//private class Class_Level_Modifier {
//	static int x= 10;
	public static void main(String[] args) {
//		For top level class applicable modifier is :
//		public,<default>,final,abstract,strictfp
		
//		For Internal class
//		public,<default>,final,abstract,strictfp +  private,protected,static
		
//		System.out.println("Private modifier");
		
//		1. Public classes : - describe in pack1,2 package file
		
//		2. Default classes: - If class declared as default then it accessed only in current package
//		 called package level access
		
//		3. final Modifier : is applicable for class,methods,variable
		
//		3.1  final method : whatever method parent has by default available to the child through inheritance.
//		If the child  not satisfied with parent method implementation. then child is allowed to redefine that method
//		based on its requirement this process is called overriding.
//		So, If parent class method is declared as final then we can't override that method in the child class 
//		because its implimentation is final.
		
//		3.2 Final Class: If calss declared final then we cant extend the functionality of that class i.e we
//		cant create child class for that class. i.e inheritance is not possible for fianl class.
		
//		Note : Every method present inside a final class is always final by default/Implicitly. but
//		every variable present inside final class need not be final.
		
//		
//		x=777;
//		System.out.println(x); // 777
		 
//		Lecture 35 :
//		4. Abstract Modifier :
//		 applicable for class and methods not for variable.
		
//		4.1  Abstract method:
//		Even though we don't know about implementation still we can declare a method with abstract modifier.
//		i.e. for abstract method only declaration is available but not implementation.
		
	
		// 4.2  Abstarct Class
//		For any class if we dont want to create an object(because of partial implimenattion) of that class then we have to declare that class 
//		as abstarct class.
		
//		Abstarct class VS Abstarct Mehtod
//		final Vs Abstract
		
//		5. strictfp [Strict floating point]
		
//		introduced in 1.2 version and we can declare and use strictfp  for classess
//		and methods but not for variable.
		
//		Strictfp method:- 
//		Strictfp Class:-
		
				

	}//-- main method end
	
	

	
	

}// main class end

// abstract strictfp class Test{
//	  abstract strictfp void m1();// not possible
//}

//// abstract class Abstractclass{
////	 public abstract void m1();
////	 public abstract void m1() {}// wrong
//}

//
//abstract class Vehicle{
//	abstract public int getNoOfWheels();
//	
//}
//class Bus extends Vehicle{// The type Bus must implement the inherited abstract method Vehicle.getNoOfWheels()
//	public int getNoOfWheels() {// This method must return a result of type int
//		return 7;
//	}
//}
//class Auto extends Vehicle{
//	public int getNoOfWheels() {// This method must return a result of type int
//		return 3;
//	}
//}

// Note : Agar koi child class inherit kar raha hai abstract parent class ko then us class ko
// abstarct  final class ke andar jo bhi abstract methos hai uska implementation karna hoga and return type
// bhi wahi hoga uss implemented method ka jo abstarct final class ke method ka hoga.

//  If any method talks about implementation then it form illegal combination with abstarct modifier
// because abstarct method never talks about implemetation

//abstract  final class Animal{ // The class Animal can be either abstract or final, not both
//	public abstract String voiceType();
//}
//class Cow extends Animal{// The type Cow must implement the inherited abstract method Animal.NoOfLegs()
//	public  String voiceType() {
//		return  "heavy";
//	}
//}

//abstract  native class Animal{ //Illegal modifier for the class Animal; only public, abstract & final are permitted
//	public abstract String voiceType();
//}
//class Cow extends Animal{// The type Cow must implement the inherited abstract method Animal.NoOfLegs()
//	public  String voiceType() {
//		return  "heavy";
//	}
//}

//4.2  eg : 
//abstract class Test {
//	public static void main(String[] args) {
//		Test t = new Test();// Cannot instantiate the type Test because class declared as abstract
//	}
//}



//final class Parent{
//	
//}
//class child extends Parent{
//	//The type child cannot subclass the final class Parent due final class declared as final.
//}

//class Parent{
//	 
//	 public void property() {
//		 System.out.println("Cash+land+gold");
//	 }
//	 
//	 public  final  void marry() {
//		 System.out.println("final overriden method");
//	 }
//}
//class child extends Parent {
//	 public void marry() {
//		 System.out.println("overriding method- marry");// Cannot override the final method from Class_Level_Modifier.Parent
//		
//	 }
//}


// class final Parent{//  Syntax error on token "final", delete this token
//	
//}
//class child extends Class_Level_Modifier{ // The type child cannot subclass the final class Class_Level_Modifier
////	class child cannot inherit from final  Class_Level_Modifier
//}

//final Vs Abstract
//abstract class Test{
//	public final void m1() {
//		
//	}
//}

//final class Test{// The type Test must be an abstract class to define abstract methods
//	public abstract void m1();// The abstract method m1 in type Test can only be defined by an abstract class
//}