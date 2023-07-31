
class Student{
	
	}
//class Customer{
//	
//}
//class Test{
//	public static void main(String[] args)throws Exception {
//		Object O = Class.forName(args[0]).newInstance();
//		System.out.println("Object created for :"+O.getClass().getName());
////		System.out.println("Hello");
//- Other rest thing are thoery based and need setting for runnig in run time nad compile time seperately
//	}
//}
public class OperatorsAndAssignment {

	public static void main(String[] args) {
//		Types of operators:-
//		1.Increment and decrement operators
//		2.Arithmetic operators
//		3.String concatenation operators
//		4.Relational operators
//		5.Equality operators
//		6.instanceOf operators
//		7.bitwise operators
//		8.short circuit operators
//		9.type cast operators
//		10.Assignment operators
//		11.conditional operators
//		12.new operators
//		13.[] operators
//		14.operator precedence
//		15.Evaluation order of operands
//		16.new vs newInstance()
//		17.instanceOf Vs isInstance()
//		18.ClassNotFoundException Vs NoClassDefFoundError

//		1. Increment & Decrement operators:-
//		Increment - Pre-Increment , y=++x;
//		Increment - Post-Increment, y=x++;
		
//		Decrement - Pre-Decrement , y=--x;
//		Decrement - Post-Decrement, y=x--;
		
//		int x = 10;
//		int y=++x; // Pre-Increment
//		int z =x++; // 11 // Post-Increment
//		System.out.println(y); // 11 - OP
//		System.out.println(z); // 11
//		int m =x++; // 11
//		System.out.println(m); // 11
		
//		int x=20;
//		int y= ++x; // Isi line me value incr ho gayi //Pre-Increment
//		System.out.println(y); // 21
//		System.out.println(x); // 21
		
//		int x= 30;
//		int y= x++; // Post-Increment
//		System.out.println(y); // 30 Post-Increment
//		System.out.println(x); // 31 Post-Increment
		
//		int y=20;
//		int x= --y; //Pre-Decrement
//		System.out.println(x); // 19 Pre-Decrement 
//		System.out.println(y); //19  Pre-Decrement
		
//		int z= 20;
//		int x= z--; // Post-Decrement
//		System.out.println(x); // 20 Post-Decrement
//		System.out.println(z); // 19 Post-Decrement
		
//		int x= 10;
//		int y = x++;
//		System.out.println(y); // 10
//		System.out.println(x);// 11
//		int z= --x;
//		System.out.println(z); // 10
//		We cant apply incremnt and decrement operators on constant values.
//		int x = 10;
//		int y = ++10;
//		System.out.println(y);// Unresolved compilation problem: 
		//Invalid argument to operation ++/--
//		Nesting of INC/DEC operators is not allowed
//		int x= 10;
//		int y= ++(++x);
//		System.out.println(y); // Unresolved compilation problem: 
		//Invalid argument to operation ++/--
//		For FINAL variables we cant apply incr/decr operators.
//		final int x = 10;
//		x++;// Unresolved compilation problem: 
//		int y= x++;// Unresolved compilation problem: 
//		System.out.println(y);// Unresolved compilation problem: 
		//The final local variable x cannot be assigned. It must be blank and not using a compound assignment
//		final int x =10;
//		x=11;// Unresolved compilation problem: 
//		System.out.println(x);// The final local variable x cannot be assigned. It must be blank and not using a compound assignment
//		int x = 10;
//		x++;
//		int y=x++;//10
//		System.out.println(y);// 11
//		System.out.println(x);// 12
//		int x = 10;
//		x++;
//		System.out.println(x);// 11
//		int y=x++;
//		System.out.println(y);// 11
//		System.out.println(x);// 12
//		System.out.println(y);// 11 // not clear with concepts.
//		char ch = 'a';
//		ch++;
//		int y= ch;
//		System.out.println(ch); // b
//		System.out.println(y); //98
//		double d = 10.5;
//		d++;
//		System.out.println(d);// 11.5
//		boolean b = true;
//		b++;
//		System.out.println(b);// Type mismatch: cannot convert from boolean to int
//		operator ++ can not applied to boolean
//		?We can apply inc/decr operators for eery primitive data type only except to boolean
//		
		//Date&Time=04:03PM,Wednesday,02/08/2023 START
//		
//		5. Diff btwn B++ & b=b+1 
//		If we applied any arithemetic operators between two variable a and b the the result type is always
//		max of (int,type of a, type of b)
//		byte a = 10;
//		byte b = 20;
//		byte c = a+b;
//		System.out.println(c);// Type mismatch: cannot convert from int to byte
//		we can solve/handle it by usinf type casting
//		byte c = (byte)(a+b);
//		System.out.println(c);// 30
//		byte b = 10;
//		b= b+1;// Type mismatch: cannot convert from int to byte
//		System.out.println(b);//Type mismatch: cannot convert from int to byte
//		byte b = 10;
//		b=(byte)(b+1);// using TypeCasting
//		System.out.println(b);// 11
//		
//		byte b = 10;
//		b++;// internal typecasting
//		System.out.println(b);// 11
//		NOTE:- In case of INcr/Decr internal TypeCasting perform automatically
//		
		
//		2.Arithmetic Opeartors:-(+,-,/,*,%)
//		If we apply any arithmetic opearators between a&b the result type is always
//		max(int,type of a , type of b)
//		
//		Fig: Typecasting flow
//		byte--->Short---->
//						----->int-->long-->float-->double
//				char---->
		
//		byte + byte= int
//		byte + short= int
//		short + short=int
//		byte + long=long
//		long + double=double
//		float + long=float
//		char + char=int
//		char + double=double
		//Date&Time=04:23PM,Wednesday,02/08/2023 END
		//Date&Time=05:45PM,Wednesday,02/08/2023 START
//		System.out.println('a'+0.89);// 97.89-->a=97 (ASCII Value) -->97=0.89=97.89 double// char + double=double
//		byte b = 6;
//		byte c = 6;
//		System.out.println(b+c);// 12 jo ki int hai= byte + byte= int
//		System.out.println(32767+32767);// 65534 is int value short + short=int
//		System.out.println(127+32767);// 32894     byte + short= int
//		System.out.println(127+23717372);// 23717499 byte + long=long
//		System.out.println(1234531+10.3333);//1234541.3333 //long + double=double
//		System.out.println(212.332+932049832);// 9.32050044332E8 // float + long=float
//		System.out.println('a'+'a');// 194 char + char=int
//		System.out.println('a'+765.27);// 862.27  char + double=double
		
//		Infinity:-
//		In integral arithmetic(byte,short,int ,long) there is no way to represent infinity if infinity is a result then we will get AE: in integral arithmetic
//		
//		System.out.println(10/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
//		
//		But in floating point arithmetic (float & double) there is a way to represent infinity
//		for this float & double classes conatins the following two contacts.
//		POSITIVE_INFINITY
//		NEGATIVE_iNFINITY
//		Hence even though result is infinity we wont get nay arithmetic exception in floating point arithmetic
//		
//		eg:-
//		System.out.println(10/0.0);// Infinity 10/float/double
//		System.out.println(10.0/0);// Infinity float/double/0
		
//		NaN:-(Not a number)
//		In integral arithmetic(byte,short,int ,long) there is no way to represent undefined result 
//		if undefined is a result then we will get AE: in integral arithmetic
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		
//		System.out.println(0/0);// Exception in thread "main" java.lang.ArithmeticException: / by zero
//		
//		But in floating point arithmetic (float & double) there is a way to represent undefined result
//		for this float & double classes contains NaN constant.
//		Hence if the result is undefined we won't get any AE. in floating point arithmetic
//		
//		System.out.println(0.0/0);// NaN
//		System.out.println(-0/0.0); // NaN
//		System.out.println(10/0);//  java.lang.ArithmeticException: / by zero
//		System.out.println(-10/0);// java.lang.ArithmeticException: / by zero
//		System.out.println(10/-0);// java.lang.ArithmeticException: / by zero
//		System.out.println(10.0/0);// Infinity
//		System.out.println(10.0/-0);// Infinity
//		System.out.println(-10.0/-0);// -Infinity
//		System.out.println(-10.0/0);// -Infinity
//		System.out.println(10.0/-0.0);// -Infinity
//		System.out.println(-10.0/-0.0); // Infinity
//		System.out.println(0.0/-0);// NaN
//		System.out.println(-0.0/0);// NaN
//		System.out.println(-0.0/-0);// NaN
//		System.out.println(-1.0/-0);// -Infinity
		
//		for any x value including NaN the following expression return false
//		int x =0;
//		System.out.println(x<NaN); // NaN cannot be resolved to a variable
//		System.out.println(x<=NaN); // NaN cannot be resolved to a variable
//		System.out.println(x>NaN); // NaN cannot be resolved to a variable
//		System.out.println(x>=NaN);  // NaN cannot be resolved to a variable
//		System.out.println(x==NaN);// NaN cannot be resolved to a variable
		
//		for any x value including NaN the following expression return true
//		System.out.println(x!=NaN);// x cannot be resolved to a variable
		//NaN cannot be resolved to a variable
		
//		System.out.println(10<float.NaN); // Syntax error on token "float", invalid Expression
		
//		System.out.println(10<Float.NaN); // false
//		System.out.println(10<=Float.NaN);// false
//		System.out.println(10>Float.NaN);// false
//		System.out.println(10>=Float.NaN);// false
//		System.out.println(10==Float.NaN);// false
//		System.out.println(Float.NaN==Float.NaN);// false
//		System.out.println(10!=Float.NaN);// true
//		System.out.println(Float.NaN!=Float.NaN);// true
		
//		3.String concatenation operators
		
//		The only overloaded operator in java is (+) operator. 
//		Sometime it access arithmetic addition operators 
//		and sometime it access string concatenation opeartors.
		
		
//		Case1:-
//		If atleast one argument is String type  then
//		(+) operator access String concatenation operator.
		
//		Case2:-
//		If both argument is number type  then
//		(+) operator access arithmetic addition operator.
		
//		eg1:-
//		String a = "fahad";
//		int b=10, c=20, d=10;
//		System.out.println(a+b+c+d);// fahad102010 String concatenation operator
//		System.out.println(b+c+d+a);//40fahad this expression has same operator then order of precedence is from left to right so it start add value from left and concat with a. So it use both String concatenation operator and arithmetic addition operator 
//		System.out.println(b+c+a+d);// 30fahad10 this expression has same operator then order of precedence is from left to right so it start add value from left and concat with a. So it use both String concatenation operator and arithmetic addition operator 
//		System.out.println(b+a+c+d);// 10fahad2010
		
//		eg2:-
//		String a = "fahad";
//		int b=10, c=20, d=30;
//		a=b+c+d;
//		System.out.println(a); // Type mismatch: cannot convert from int to String
//		a=a+b+c;
//		System.out.println(a);// fahad1020
//		b=a+c+d;
//		System.out.println(b);// Type mismatch: cannot convert from String to int
//		b=b+c+d;
//		System.out.println(b);// 60
		
//		4.Relational operators (<,<=,>,>=)
//		We can apply relational operator for evry primitive type except boolean.
//		eg
//		System.out.println(10<20);// true
//		System.out.println('a'<20);// false
//		System.out.println('a'<97.6); //true
//		System.out.println('a'>'A'); // true
//		System.out.println(true>false);// The operator > is undefined for the argument type(s) boolean, boolean
		
//		 We cannot apply relational operators for object/Non-Primitive types
//		eg
//		System.out.println("durga123">"durga");// The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
		
//		Nesting of relational operator is not allowed otherwise we will get CTE.
//		System.out.println(10<20<30);// The operator < is undefined for the argument type(s) boolean, int
		
//		5.Equality operators (==, !=)  //Date&Time=3:43PM,Friday,02/10/2023
//		we can use == operator for address comparison
		
//		we can  apply equality operator for every primitive type inclusding boolean.
//		System.out.println(10==20);// false
//		System.out.println('a'=='b'); // false
//		System.out.println('a'==97.0); //true
//		System.out.println(false==false);// true
//		System.out.println(true==true);// true
//		System.out.println('a'=='A');// false
//		System.out.println('a'==97);// true
//		System.out.println(127==127);// true
//		System.out.println("fahad"=="fahad");// true
//		System.out.println("fah"=="abd");// false// yahan address compare nahi ho raha.
		
		
//		we can apply equality operator for object type also
//		for object references r1 and r2 , r1== r2 iff both reference pointing to the same object
//		(reference comparison or address comparison)
		
//		Thread t1 = new Thread();
//		Thread t2 = new Thread();
//		Thread t3=t1;
//		System.out.println(t1==t3);// true
//		System.out.println(t1==t2);// false
		
//		Thread t1 = new Thread();
//		Object O = new Object();
//		String S = new String("durga");
//		System.out.println(t1==O);// false
//		System.out.println(O==S);// false
//		System.out.println(S==t1);// Incompatible operand types String and Thread
		
//		!= operators
//		we can use != operator for address comparison
//		System.out.println(10!=20);// true
//		System.out.println('a'!='b'); // true
//		System.out.println('a'!=97.0); //false
//		System.out.println(false!=false);// false
//		System.out.println(true!=true);// false
//		System.out.println('a'!='A');// true
//		System.out.println('a'!=97);// false
//		System.out.println(127!=127);// false
//		System.out.println("fahad"!="fahad");// false
//		System.out.println("fah"!="abd");// true
		
		// In general we can use == operator for address comparison 
//		and .equals() method for content comparison.
		
//		eg:
//		String S1 = new String("durga");
//		String S2= new String("durga");
//		System.out.println(S1==S2);//false // this compare address of variable/object
//		System.out.println(S1.equals(S2));// true// this method compare content of variable/objects
		
//		for any object reference r== null is always false
//		but null == null is always true
//		String s = new String("durga");
//		System.out.println(s==null);// flase
//		String n = null;
//		System.out.println(n==null);// true
//		System.out.println(null==null);// true
		
//		Lecture 19:- 
//		6.instanceOf operators
		//Date&Time=01:03PM,Friday,02/10/2023
//		We  can use instanceof operator to chek whether given object is of particular type or not.
		
//		Syntax:-
//		r instance X -- r is object reference  X is class or interface name
//		Thread t = new Thread();
//		System.out.println(t instanceof Thread);// true
//		System.out.println(t instanceof Object);  // true
//		System.out.println(t instanceof Runnable);// true
		
//		for any class or interface X null instanceof X  is always false
//		System.out.println(null instanceof Thread); // false
//		System.out.println(null instanceof Runnable);// false
		
		
//		7.bitwise operators (&, |, ^)
//		 & -- And,  returns true iff both arguments are true
//		 | -- OR  returns true iff atleast one arguments are true
//		 cap symbol - ^ -- Exor, exclusive OR, X-OR, returns true iff both arguments are different
		
//		eg :- 
//		System.out.println(true & false);// false
//		System.out.println(true | false);// true
//		System.out.println(true ^ false); // true
		
//		we can apply these for integral types also
//		System.out.println(4&5);// 4
//		System.out.println(4|5);// 5
//		System.out.println(4^5);// 1
		
		
//		bitwise complement operators (~):- tild symbol
//		We can apply for only integral type not for boolean type OW CTE.
//		System.out.println(~true);  // The operator ~ is undefined for the argument type(s) boolean
//		System.out.println(~4);// -5
		
//		Boolean complement operator : (!)--
//		We can apply this operator only for boolean type but not for integarl types.
//		System.out.println(!8);// The operator ! is undefined for the argument type(s) int
//		System.out.println(!false);// true
//		System.out.println(!true);// false
		
//		Note :-
//		&,|,^-- applicable for both boolean & integral
//		~ -- applicable for only integral but not for boolean
//		!  applicable only for boolean but not for integral
		
//		8.short circuit operators :(&&, ||)
		
//		These are exactly same as bitwise operators(&,|) except only following differences.
		
//				$,|		|		&&,||
//		-------------------------------				
//		1.Both argument	|	1. second argument		
//		should be evalu	|		evaluation is optional	
//		ated always.	|			
//		
//		2.relatively	|	2.relatively performance
//		performance 	|	high
////	low
//		
//		3.applicable	|	3. applicable only for boolean but not
//		for both boolean |	for integral
//		and integral types|
						
//		Note:- 1. x&&y == y will be evaluated iff x is true i.e. if x is false then y will not be evaluated.
		
//		2.  x||y - y will be evaluated iff x is false i.e. if x is true then y will not be evaluated.
			
//		eg_
//		int x= 10;
//		int y=15;
//		if(++x<10 & ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 11...17
		
		
//		int x= 10;
//		int y=15;
//		if(++x<10 && ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 11...16
		
//		int x= 10;
//		int y=15;
//		if(++x<10 | ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 12...16
		
//		
//		int x= 10;
//		int y=15;
//		if(++x<10 || ++y>15) {
//			x++;
//		}else {
//			y++;
//		}
//		System.out.println(x+"..."+y);// 12...16
		
		
//		eg:- 2-
		
//		int x= 10;
//		if(++x<10 && (x/0>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}// o/p:- Hii
//		
//		int x= 10;
//		if(++x<10 & (x/0>10)) {
//			System.out.println("Hello !!");
//		}else {
//			System.out.println("Hii !!");
//		}// : / by zero
		
//		9.type cast operators
		
//		1. Implicit typecasting
//		2. Explicit Typecasting
		
//		1.Implicit:
//		Compiler is respond to perform ITC.
//		whenever we are assinging smaller Datatype value to bigger datatype variable ITC will be performed.
//		It is also known as widening and upcasting
//		There is no loss of information in this typecasting
//		The following are various possible conversion where ITC will be performed.
		
//		Fig: Typecasting flow : ITC
//		byte--->Short---->
//						----->int-->long-->float-->double
//				char---->
		
//		eg:-
//		int x='a'; 
//		System.out.println(x);// 97// compiler convert char to int automatically by ITC
		
//		double d = 10;
//		System.out.println(d);// 10.0  compiler convert int to double automatically by ITC
		
//		2.Explicit Type casting:
//		Programmer is responsible to perform ETC.
//		whenever we are assinging bigger Datatype value to smaller datatype variable then  ETC will be required.
//		It is also known as narrowing and downcasting
//		There may a chance of loss of information in this typecasting
		
//		The following are various possibilities  where ETC will  required.
		
//		Fig: ETC
//		byte<---Short<----
//						<-----int<--long<--float<--double
//				char<----
		
//		L---R -- Implicit TypeCasting
//		R---L -- Explicit Typecasting
		
//		eg:-
//		int x = 130;
//		byte b = x;
//		System.out.println(b);// Type mismatch: cannot convert from int to byte
		
		
//		int x = 130;
//		byte b = (byte)x;
//		System.out.println(b);// -126
		
//		whenever we are assingnig bigger D.T value to smaller D.T variable by ETC The MSB will be lost
//		We have to consider only LSB
		
//		int x= 150;
//		short s = (short)x;
//		System.out.println(s);// 150
		
//		byte  b = (byte)x;
//		System.out.println(b);// -106
		
//		Float to integral value -- digit after decimal point lost
//		double d = 130.456;
//		int x = (int)d;
//		System.out.println(x);// 130
//		byte b = (byte)d;
//		System.out.println(b);// -126
		
//		Lecture 21: 10.Assignment operators : 
//		Three types
//		1.Simple assingment
//		2.chained 
//		3.compound
		
//		1.Simple:-   int x= 10;
		
//		2.chained:-  
//		int a,b,c,d;
//		a=b=c=d=20;
//		System.out.println(a+".."+b+"..."+c+"..."+d);// 20..20...20...20
		
//		We can't performed chain assingment directly at the time of declaration
//		eg:-
//		 int a =b=c=d=20;
//		 System.out.println(a+".."+b+"..."+c+"..."+d);// b cannot be resolved to a variable
//			c cannot be resolved to a variable
//			d cannot be resolved to a variable
//		 at OperatorsAndAssignment.main(OperatorsAndAssignment.java:555)
		
//		int b,c,d;
//		int a=b=c=d=20;
//		System.out.println(a+".."+b+"..."+c+"..."+d);// 20..20...20...20
		
//		3.Compound Assignment Operator:-
//		Sometime assignment operator mixed with some other operator the we called CAO.
		
//		int a= 20;
//		a+=30;// -- a=a+30
//		System.out.println(a);// 50
		
//		The following are all possible compound assingment operator in java
		
//		+=		&=		>>= right shift operator
//		-=		|=		>>>= unsigned right shift operator
//		*=		^=		<<= left shift operator
//		/=
//		%=   Total === 11
		
//		in case of CAO internal T.C will performed automatically
//		 byte b = 10;
//		 b=b+1;  // max(int,byte,int)
//		 System.out.println(b);// Type mismatch: cannot convert from int to byte
		 
//		 byte b = 10;
//		 b++;
//		 System.out.println(b);// 11
		 
//		 byte b = 10;
//		 b+=1;  // += CAO internal TC is performed.
//		 System.out.println(b);//11
		
//		byte b = 127;
//		b+=1;
//		System.out.println(b);//-128
		
//		byte b = 127;
//		b+=3;
//		System.out.println(b);//-126
		
//		int a,c;
//		int b=20; // simple
//		int d; // simple only declared
//		a=c=d=20; //chained 
//		a+= b-= c*= d/= 2; // compound
//		System.out.println(a+"..."+b+"..."+c+"..."+d);// -160...-180...200...10
		
//		11.conditional operators: (? :) Ternary operator
//		The only possible ternary operator in java is conditional operator
//		Syntax : 
//		int  x= (10<20)? 30:40;
//		is same as in if else condition
//		if(10<20) {
//			System.out.println("30"); // 30
//		}else {
//			System.out.println("40");
//		}
//		System.out.println(x);// 30
//		neasting of conditional operator is also possible
		
//		 int x = (10>20)?30 :(40>50)?60:70;
//		 System.out.println(x);// 70
//		is same as 
//		if(10>20) {
//			System.out.println("30"); 
//		}else if(40>50) {
//			System.out.println("60");
//		}else {
//			System.out.println("70");// 70
//		}
		
//		a++, ++a -- unary operator because only one operand is there i.e "a"
//		a+b -- binary operator because two  operand is there i.e "a" and "b"
//		(c)?b:d; ternary operator because three  operand is there i.e "a" , "b" and "c"
		
//		c,b,d are 3 operand
		
		
//		12.new operators  -- theory only
//		we can use this new operator to create object of class
//		eg:- Test t = new Test();
//		After creating an object constructor will be executing to perform
//		initialization of object not for creation of object
		
		
		
//		13.[] operators -- theory only
		
//		we  can use this operator to declare and create arrays only
//		eg:- 
//		int[] x = new int[10];
//		In general other than arrays we are not going to use this operator anywhere else
		
//		Lecture 22: //		
//		
//		14.operator precedence
		
//		Java operator precedence chart
		
//		1. unary operator
//		[],x++,x--
//		++x,--x,~,|
//		new, <type>
		
//		2.Arithmetic Operator
//		*,/,%
//		+,-
		
//		3.Shift operator
//		>>,>>>,<<
		
//		4.Comparision operator
//		<,<=,>,>=,instanceof
		
//		5.equality operator:
//		==, !=
		
//		6. Bitwise operator
//		&,^,|
		
//		7.Short Circuit operator
//		&&, ||
		
//		8.conditional operator
//		? : 
		
//		9.Assignment operator
//		=, +=, -=, *=.args.clone(). all  11 CAO
		
//		15.Evaluation order of operands
		
//		If we apply any operator  on operand all operand will evaluated from left to right
		
//		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6)); // 32
//		 1+2*3/4+5*6
//		 1+6/4+5*6
//		 1+1+30
//		 2+30
//		 32
		
//		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6)*m1(7)/m1(8)+m1(9)-m1(10));// 27
//	    1+2*3/4+5*6*7/8+9-10
		
//		If multiple operator has same precedence then it execute from left to right
//		and right to left accrdng to associativity.
		
//		For more detail : See Java operator precedence table
		
//		Lecture 23 : 
//		16.new vs newInstance()
//		1.new : - We can use this new operator to create an object , if we know classname at the beggining
//		eg:- 
//		Test t = new Test();
//		Student S = new Student();
//		Customer C = new Customer();
		
//		2. newInstance():- is a method in Class.class we can use newInstance method to create ibject, if we don't
//		 know class name at begginig and it is available sdynamically at runtime from
//		CLA,file,database.
//		eg: above
//		17.instanceOf Vs isInstance()
//		18.ClassNotFoundException Vs NoClassDefFoundError
//		both above 17 & 18 point are theory based and interview question only 
		
		
		
		

	}
//	public static int m1(int i) {
//		System.out.println(i);// 1,2,3,4,5,6
//		System.out.println(i);//1,2,3,4,5,6.7,8,9,10
//		return i;
//	}

}
