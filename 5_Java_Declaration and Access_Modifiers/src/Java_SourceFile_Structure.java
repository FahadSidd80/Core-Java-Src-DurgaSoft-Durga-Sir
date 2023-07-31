//package com.durgasoft.scjp;

//import java.util.ArrayList; // Explicit class import
//import java.util.*;// implicit class import
//import java.util;
//import java.util.ArrayList.*;// wrong way 
//import java.util.ArrayList.*;
//import java.rmi.UnicastRemoteObject;
//import java.util.*;
//import java.sql.*;
//import java.awt.*;
//import java.util.Date;
//import java.sql.*;
//import java.util.regex.*;// pattern class is present in regex sub-package
//import java.lang.*;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
//import static java.lang.Integer.*;
//import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Byte.*;
import static java.lang.Long.*;
import static java.lang.Short.*;
import static java.lang.Double.MAX_VALUE;
import static java.lang.Float.*;
//import java.util.ArrayList; normal explixit import
//import java.util.*;// normal implicit import 
import static java.lang.Math.sqrt;
import static java.lang.Math.*;



import java.util.*;
import java.util.jar.Attributes.Name;

import jdk.incubator.vector.VectorOperators.Test;

import static java.lang.Math.*;

public class Java_SourceFile_Structure {

//	static int MAX_VALUE = 999;
	public static void main(String[] args) {
		// 1. java source file structure :
//		System.out.println("Only one public class");
//		

//		Lecture 31: 
//		Import and static import
//		Case 1 :  Type of import statement 
//		Two types 
//		1. Explicit class import
//		import java.util.ArrayList; // Explicit class import
		
//		2. implicit class import
//		import java.util.*;// implicit class import
		
		
//		import statement :
			//java.util.ArrayList l = new java.util.ArrayList();
			//java.util.ArrayList  is fully qualified name.
//			ArrayList l =  new ArrayList();
			
//		Date d = new Date();// The type Date is ambiguous 2 times
//		List l = new List();// The type List is ambiguous 2 times because List is presnt in bot util & awt
//		Date d  = new Date();
//		System.out.println(d.getClass().getName());// java.util.Date
//		String s = new String("durga"); // import statement is not required because java.lang package class String is by default available to every java program.
//		System.out.println(s);// durga
//		Student S1 = new Student("DurgaSoft", "101"); // confused 
//		System.out.println(S1.name +"...."+S1.rollno);
		
//		without static import
//		System.out.println(Math.sqrt(4));// 2.0
//		System.out.println(Math.max(10,20));// 20
//		System.out.println(Math.random());// 0.7271815546343781 change everytime
		
//		System.out.println(sqrt(4));// 2.0
//		System.out.println(max(10,20));// 20
//		System.out.println(random());// 0.959150432724379  change everytime
		
		
//		Lecture 32. 08/April/2023 : 1:33PM
		
//		Explanation about System.out.println();
//		Class test{
//			Static String S = "durga";
////			
//		}
//		
//		Test.S.length();
//		Test is a class name,  S is a static variable preset in Test class of the type String java.lang.string
//		Length() is a method present in string class
		
//		 out.println("Static import");
//		 out.println("Hi Static import");
		
		
//		System.out.println(MAX_VALUE);//The field MAX_VALUE is ambiguous
		
//		System.out.println(MAX_VALUE);// 999
//		System.out.println(MAX_VALUE);// Integer class MAX_Value-- takes explicit static import
//		System.out.println(MAX_VALUE);// 127 -- takes implicit static import
//		System.out.println(MAX_VALUE);// 1.7976931348623157E308 double max value
		
		// Normal import
//		1. Explixit import
//		2. Implicit import
		
//		Syntax: Explicit
//		import package Name.class name;
//		import java.util.Arraylist;
		
		//import java.util.*;// normal implicit import 
		
		// Static import
//		1. Explicit static import
//		2. Implicit static import
		
//		Syntax: Explicit static import
//		import static packagename.Classname.Staticmemeber;
// eg:	import static java.lang.Math.sqrt;
		
//		Syntax:Implicit static import
//		import static packagename.Classname.*/implicitly called method/variable/static memeber;
//	eg:	import static java.lang.Math.*;
//		import static java.lang.System.*;
		
//		Lecture 33: Package
//		Universally accepted naming convention for package
		
//		To use internet domain name in reverse
//		com.icicibank.loan.housing.Account
//		com.icicibank -- client internet doamin name in rverse
//		loan module name 
//		housing -- sub module name
//		Account-- class name
		
//		eg: package com.durgasoft.scjp
		
		

			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
//class System{
//	static PrintStream out;
//}
//System.out.println();
//System is a class present in java.lang.package
//out  is  a static variable present in system class of the type printstream
//println() is a mehtod present in printStream class


//class  myObject extends java.rmi.UnicastRemoteObject {
//	
//}























  class A {
// Java_SourceFile_Structure
	public static void main(String[] args) {
		// 1. java source file structure :
		System.out.println("Only one public class");
  
	}

}
  class B {
	  public static void main(String[] args) {
			
			System.out.println("B class main");
	  
		}

  }
  class d{
	 public static void main(String[] args) {
			// 1. java source file structure :
			System.out.println("D calss main");

		}

 }
  class C{
	  public static void main(String[] args) {
			// 1. java source file structure :
			System.out.println("C Class main");

		}
	 
 }
  class E {
	  
  }
  
  

//public class B {
//	System.out.println("Only one public class"); // CTE
//}
//class c{
//	
//}
