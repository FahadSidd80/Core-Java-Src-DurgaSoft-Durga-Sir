import java.util.Objects;

import javax.sound.sampled.AudioFileFormat.Type;

import com.sun.tools.javac.code.Attribute.Array;

import jdk.internal.math.FormattedFloatingDecimal.Form;

public class Java_Fundamentals { // class name  : Java_Fundamentals

	public static void main(String[] args) { // method name : main  //predefined java class name : String // name of array : args
//		int x = 20;  // variable name : x
		
 // Topic 1. these all are identifiers. can be used for identification purpose
		
		// ex : int Number = 10;
		// int NUMBER = 10;
		// int number = 10;
		// all above line has different meaning.
//		int String = 344;
//		System.out.println(String);	// o/p: 344
		
//		int runnable = 900;
//		System.out.println(runnable); // o/p : 900
//		 int   total_number = 10;
//		 int 123_total = 40;
//		 int total_123 = 121;
		
//		int java2share = 10;
//		int total123 = 20;
////		int 123total = 50;
//		System.out.println(total123);
		
//		int _$_$_$_$_$_$_$ = 20;
//		int $_$_$_$ = 90;
//		System.out.println($_$_$_$);
//		
		
//		All WRAPPER CLASS/ PRE-DEFINED JAVA CLASS
//		int Integer = 29;
//		int Int = 30;
//		int String = 31;
//		int Char = 32;
//		int Float = 33;
//		int Double = 34;
//		int Long = 35;
//		int Short = 36;
//		int Byte = 37;
//		int Boolean = 38;
//		int Character = 39;
//		
//		System.out.println(Integer);    29   int
//		System.out.println(Int); 		30
//		System.out.println(String);		31   Non-Primitive
//		System.out.println(Char);		32
//		System.out.println(Float);		33  float
//		System.out.println(Double);		34  double
//		System.out.println(Long);		35  long
//		System.out.println(Short);		36  short
//		System.out.println(Byte);		37  byte
//		System.out.println(Boolean);	38  boolean
//		System.out.println(Character);	39  char  -- there is nothing exist like character
	
	

		
//		int int = 20;
//		int char = 21;
//		int float = 22;
//		int bool = 23;
//		int boolean = 25;
		/* int Boolean = 29; */
//		int byte = 24;
//		int short = 25;
//		int long = 26;
//		int double = 27;
//		int boolean = 28;
//		int char = 29;
		
//		System.out.println(int);
//		System.out.println(char);
//		System.out.println(float);
//		System.out.println(bool);
//		System.out.println(boolean);
		/* System.out.println(Boolean); */
//		System.out.println(byte);
//		System.out.println(short);
//		System.out.println(long);
//		System.out.println(double);
//		System.out.println(boolean);
//		System.out.println(char);
		
//		int character = 20;
//		System.out.println(character);
		
//	Topic 2 . Reserved words
		
//	Reserved keyword for Primitive DT	Non_Premitive DT/Wrapper class
		
//	1.	byte							Byte
//	2.	short							Short
//	3.	int								Integer
//	4.	long							Long
//		
//	5.	float 							Float
//	6.	double							Double
//		
//  7.	char							Character
//	8.	boolean							Boolean
	 
		
//		String are literal
		
//		Reserved words are 53 in java
//		resreved keyword are 50 - but 48 are used and rest 2 are unused- goto, const
//		reserved literals are 3  - true, false, null
		
		/*
		 *  Its never too late to start !!
		 *  This too shall pass !!
		 */		
//		
		
//		PRIMITVE DATA TYPE : Numeric DT -> Integral datatype
//		1 . Byte  Range (-128 to 127)  1 byte = 8 bit
		
//		byte x = 128;
//		byte y = 127;
//		byte z =-128;
//		byte a = -129;
////		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println(a);
		
//		Except boolean and char datatype all are sign data type because we can represent in both +ve and -ve value
		
//		byte b = 10.5;
//		System.out.println(b); Type mismatch: cannot convert from double to byte
//		byte b = true;
//		System.out.println(b); Type mismatch: cannot convert from boolean to byte
//		byte b = "fahad";
//		System.out.println(b); Type mismatch: cannot convert from String to byte
		
//		Two types of stream :
//		Character stream and byte stream
		
//		 2. Short  DT - most rarely used 
//		range (-2^15 to 2^15-1) (-32768 to 32767)  2 byte = 16 bit.
		
//		short s = 32767;
//		System.out.println(s);
//		
//		Short s = 32768;
//		System.out.println(s); Type mismatch: cannot convert from int to Short
		
//		short s = -32768;
//		System.out.println(s);
//		
//		short s = -32769;
//		System.out.println(s); Type mismatch: cannot convert from int to short
		
//		short s = 10.5;  
//		System.out.println(s); Type mismatch: cannot convert from double to short
		
//		short s = = true;
//		System.out.println(s);   Type mismatch: cannot convert from boolean to short
		
		
//		3. int data type 
//		range (-2^31 to 2^31-1) (-2147483648  to 2147483647)  4 byte = 32 bits
		
//		int x = -2147483648;
//		System.out.println(x);
		
//		int x = 2147483647;
//		System.out.println(x);
	
//		Note : Every integarl number by default going to be considered  as int type. So, error in int will be different.
		
//		int x = 2147483648;
//		System.out.println(x);  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//								The literal 2147483648 of type int is out of range : means integer ki range se bahar hai
		
//		int x = 2147483648l;  // treated as long : special case
//		System.out.println(x); Type mismatch: cannot convert from long to int
		
//		long x = 2147483648; // The literal 2147483648 of type int is out of range 
//		System.out.print(x);
		
//		long l = 2147483647;
//		System.out.print(l); // but treated as int not long one.
		
//		long x =  2147483648l;
//		System.out.print(x);
		
//		int x = true;
//		System.out.println(x); Type mismatch: cannot convert from boolean to int
		
//		4. Long : 
//			Range (-2^63 to 2^63-1) 8 bytes = 64 bits
//		long l = 2147483647;
//		long l1 = 2147483647l;
//		System.out.println(l);
//		System.out.print(l1);
		
//		long l = 12209342084092184901284091284298429849249249249292929239218989128921892189; // The literal 12209342084092184901284091284298429849249249249292929239218989128921892189 of type int is out of range 
//		System.out.println(l);
		
//		long l2 = 1220934208409999999l;
//		System.out.println(l2);
		
//		long l = 12209342084092184901284091284298429849249249249292929239218989128921892189l; // The literal 12209342084092184901284091284298429849249249249292929239218989128921892189l of type long is out of range 
//		System.out.print(l);
		
//		long l = 1073741824l;
//		long l1 = 1152921504606846976l;
//		long l3 = 8l;
//		long mull = (l1*l3);  // -9223372036854775808
////		long mul = (l*l);
//		System.out.print(mull);
		
//		FLOATING POINT DATA TYPES : 1. FLOAT  2. DOUBLE
		
//		1. Float 
//		 5 to 6 didgits accuracy.
//		single precision
//		size : 4 bytes = 32 bits
//		 range : (1.7 * 10^38 to ) -3.4 e^38 to 3.4e^38
		
//		float f = 12f;
//		float fn = 29/7; //  4.0
//		System.out.println(fn);
//		float f = 1234/232;
//		System.out.println(f); // 5.0
		
//		2. Double 
//		 14 to 15 digits accuracy
//		 double precision
//		 size 8 bytes = 64bits
//		 range : -1.7e^308 to 1.7e^308 
		
//		double d = 29.121313;
//		
//		System.out.println(d);
		
//		double d = 1212323.2321321;
//		System.out.println(d);
		
		
//		Non Numeric data type.
//		Boolean 
//		SIze : N.A (size depends upon machine only)
//		Range : N.A (true/false only allowed value)
		
//		boolean b = true;
//		boolean b1 = 0; // Type mismatch: cannot convert from int to boolean
//		System.out.println(b1); 
//		 boolean b = True; // True cannot be resolved to a variable
//		 System.out.println(b);
		
//		boolean b = s; // s cannot be resolved to a variable
//		System.out.println(b);
		
//		boolean b = 'A'; // Type mismatch: cannot convert from char to boolean
//		System.out.println(b);
		
//		boolean b = "String"; Type mismatch: cannot convert from String to boolean
//		System.out.println(b);
//		
		
		
		
//		int x = 0;
//		if(x) // Type mismatch: cannot convert from int to boolean
//		{
//			System.out.println("Hello");
//		}else
//		{
//			System.out.println("Hii");
//		}
//		
//		while(1)  // Type mismatch: cannot convert from int to boolean
//		{
//			System.out.print("Hello");
//			
//		}
		
//		2. Char 
//		Size - 2 byte = 16 bit
//		Range - (0 to 65535)	
		
		
//		char ch = null;
//		System.out.println(ch); // Type mismatch: cannot convert from null to char
//	
//		 
		
//		int x = 19;  19 is literal/constant value
		
//		Decimal literals 
//		int x = 10; // by default decimal
//		int x1 = 010; // here 0 means octal
//		int x2 = 0x10; // here 0x means hexadecimal
//		System.out.println(x);  10
//		System.out.println(x1); 8
//		System.out.println(x2); 16
		
//		int x = 0X10;
//		System.out.println(x); // 16  from a to f java is not case sensitive. we can use both caps and small letter to represent number in hexa deciaml vale.
		
//		int x =0x1021a;
//		System.out.println(x);
		
//		int x = 0x00112abcdfe; // The literal 0x00112abcdfe of type int is out of range
//		System.out.println(x);
		
//		long l = 0x00112abcdefl;
//		System.out.print(l);
		
//		int x = 0212132137;
//		System.out.println(x);
//		
//		int x1 = 0786;  // The literal 0786 of type int is out of range 
//		System.out.println(x1);
		
//		int x = 00023327;
//		System.out.println(x);
			
//		int x = 001234567012;
//		System.out.println(x);
		
		
//		int x = 017777777777;
//		System.out.println(x); // 2147483647
		
//		int y = 0177777777777;
//		System.out.print(y); // The literal 0177777777777 of type int is out of range
		
//		
//		int  x= 0XFace;
//		System.out.println(x);
//		int x = 0XBeef;
////		int x = 0xBeer; // Syntax error on token "r", delete this token
//		System.out.print(x);
		
//		int x = 10;
//		int y = 010;
//		int  z = 0x10;
//		System.out.println(x+".."+y+".."+z); // 10..8..16
		
		
//		int x = 10l;
//		int y = 010l;
//		int z = 0x10l;
//		System.out.println(x+".."+y+".."+z); 
//		Type mismatch: cannot convert from long to int
//		Type mismatch: cannot convert from long to int
//		Type mismatch: cannot convert from long to int
		
		
//		long l1 = 10;
//		long l2 = 010;
//		long l3 = 0x10;
//		System.out.println(l1+".."+l2+".."+l3); // 10..8..16
		
		
//		byte b = 127;
//		byte b = 128;
//		System.out.println(b);
//		
//		short s = 32767;
////		short s = 32768; // Type mismatch: cannot convert from int to short
//		System.out.println(s);
//		
		
		
//		FLOATING POINT LITERALS.
//		
//		float f = 123.567; // Type mismatch: cannot convert from double to float
//		System.out.print(f);
//		
//		double d = 123.456;
//		System.out.print(d);
		
//		float f = 123.456f;
//		float f = 123.456F;
//		System.out.print(f); // 123.456
		
////		double d = 123.456d;
//		double d = 123.456D;
//		System.out.print(d);
		
//		float f = 123.456d;
//		System.out.print(f); // 	Type mismatch: cannot convert from double to float
		
		
//		double d = 123.456;
//		double d = 0123.456; // it is decimal literal but not ocatal literal.
//		double d = 0x123.456; // Invalid hex literal number
//		System.out.print(d);
		
//		double d = 0786; // The literal 0786 of type int is out of range 
//
//		System.out.println(d);
		
//		double d = 0786.0;
//		System.out.print(d);  // 786.0
		
//		double d = 0xFace;
//		double d = 0786.0;
//		System.out.println(d);
		
//		double d = 0xFace.0; // Invalid hex literal number
//		double d1 = 10;
//		double d2 = 0777;
////		System.out.println(d);
//		System.out.println(d1);
//		System.out.println(d2); // 511.0
		
//		int x = 10.0;
//		System.out.print(x); // Type mismatch: cannot convert from double to int
		
//		FLoating point literal in exponential form
		
//		double d = 1.2e3;
//		System.out.println(d); // 1200.0
		
//		float f = 1.2e3;
//		System.out.println(f); // Type mismatch: cannot convert from double to float  size means byte ka lafda hai.. from double 8 byte to float 4 byte.

//		float f = 1.2e3f;
//		float f = 1.2e3F;
//		System.out.print(f); // 1200.0
		
		
//		Non-Numeric  literal
//		1.Boolean  true/false
//		2. Char
//		
//		boolean b = true;
//		System.out.println(b);
//		boolean b = 0;
//		boolean b1 = True;
//		boolean b2 = "True";
////		System.out.println(b);  // Type mismatch: cannot convert from int to boolean
////		System.out.println(b1); //  True cannot be resolved to a variable
//		System.out.println(b2); // Type mismatch: cannot convert from String to boolean
		
//		int x = 0;
//		if(x)  // Type mismatch: cannot convert from int to boolean
//		{
//			System.out.println("Hii..");
//		}
//		else 
//		{
//			System.out.println("Hello..");
//		}

		
//		
//		while(1)  // Type mismatch: cannot convert from int to boolean
//		{
//			System.out.println("Hello..");
//		}
//		
		
//		Char literal :
		
//		char ch = 'a';
//		System.out.println(ch);
		
//		char ch = a;
//		System.out.println(ch); // a cannot be resolved to a variable
		
//		char ch = "a"; // Type mismatch: cannot convert from String to char
//		char ch = 'ab';  //Invalid character constant
//		System.out.println(ch);
		
//		char ch = 0;
//		char ch = 97; // a
//		char ch = 0xFace; // ?means no value exist corresponding to this unicode value in this machine.
//		char ch = 0XFace; // ? means no value exist corresponding to this unicode value in this machine.
//		char ch = 0XFACE;  // ? means no value exist corresponding to this unicode value in this machine.
//		char ch = 0777; // ?means no value exist corresponding to this unicode value in this machine.
//		char ch = 65535; // ? means no value exist corresponding to this unicode value in this machine.
//		char ch = 65536; // Type mismatch: cannot convert from int to char
//		System.out.println(ch);
		
//		char ch = '/u0061'; //Invalid character constant
//		System.out.println(ch);
//		
////		char ch = 97; // a
//		char ch = 197; // A
////		System.out.println(ch);
//		System.out.println(ch);
//		
//		char ch = 1970;
//		System.out.println(ch); // ?
		
//		char ch = 1971; // ?
//		char ch = 19710; // ?
//		System.out.println(ch);
		
//		Every escape character is a valid escape character 
		
//		char ch = '\n';
//		char ch = '\t';
//		char ch = '\m'; // Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
//		System.out.println(ch);
		
//		char ch = '\n'; // new line
//		char ch1 = '\t';// horizontal tab
//		char ch2 = '\r';  // carriage return
//		char ch3 = '\b';  //  back space
//		char ch4 = '\f';  //  form feed
//		char ch5 = '\"'; // " double quote
//		char ch6 = '\'';  // ' single quote
//		char ch7 = '\\';// \ back slash symbol
//		System.out.println(ch); // new line
//		System.out.println(ch1); // horizontal tab
//		System.out.println(ch2); // carriage return
//		System.out.println(ch3); //  back space
//		System.out.println(ch4); //  form feed
//		System.out.println(ch5); // " double quote
//		System.out.println(ch6); // ' single quote
//		System.out.println(ch7); // \ back slash symbol
		
//		System.out.println("This is a \' single quote sysmbol");
//		System.out.println("This is a \" double quote symbol  ");
//		System.out.println("this is a \\ back slash symbol ");
		
//		System.out.println("this is file path C:\\\\ durga.classess "); // this is file path C:\\ durga.classess 
		
		
		/*
		 *  Its never too late to start !!
		 *  This too shall pass !!
		 */		
		
//		STRING LITERAL
		
//		Any sequence of character within double quote is treated as literal.
		
//		int x = 0b1111;
//		int x = 0B1111;
//		int x = 0b001;
//		int x = 0b011;
//		int x = 0b010;
//		System.out.println(x);
		
//		int y = 0b111; // Binary - 0b - 0,1 - but works on 1.7vrsn or above.
//		int z = 010;   // octal - 0 - 0-7
//		int x = 0x100; // hexa - 0x -0-9 10=a to15=f
//		int c = 10; // decimal - 0-9
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println(x);
//		System.out.println(c);
		
		
////		usage of underscore symbol -it can be used between only digits.
//		
//		double d = 1234.456;
//		double d2 = 1_2_3_4.4_5_6;
//		System.out.println(d); // 1234.456
//		System.out.println(d2);  // 1234.456
		
//		double d = _123.456; // _123 cannot be resolved to a variable
//		double d = 123_.349;  // Underscores have to be located within digits
//		double d = 123_._234; // Underscores have to be located within digits
//		double d = 123_.23323_; // Underscores have to be located within digits
//		System.out.println(d);
		
//		float f = 10l;  // Exceptional case  need to study further
//		System.out.println(f);
		
		
		

		
//		float f = 10000l;
//		System.out.println(f);
		
		
//		byte b = 10;
//		short s = 20;
//		int x = 10;
//		long l = 200l;
//		long sum = b + s+x+l;
//		System.out.println("Sum = "+ sum);
		
//		short s = 10.5;
//		System.out.println(s);
		
//		*************--START OF ARRAY CONCEPT BY DURGA SIR-************
//		array start
//		 An array is a indexed collection of fixed no of homogeneous data elements
		
//		int x =10;
//		int [] x = new int[10];
//	 Three type of array declaration
		
//		1_Dimensional array declaration.
//		2-D Array.
//		3-D Array.
		
//		1-D Array declaration.
		
//	int[]  x; // recommended because name is clearly seperate from type.
//		
//		int  []x; // here  int is array type. and X is name of array.  [] - this bracket represent  symbol/dimension.
//		int   x[];
//		
//		int[6]  x;  //  Unresolved compilation problem: 
//		System.out.println(x);  // Syntax error on token "6", delete this token
 //		int[] x;  // at the time of declaration we can't specify the the size of the array.
//		System.out.println(x);
		
//		2-D Array declaration.
//		
//		int[][]  x;
//		int  [][]x;
//		int  x[][];
//		
//		
//		int[]   []x;
//		int[]    x[];
//		int     []x[];  all are valid.
		
//		conclusion/concept regarding dimension:
		
//		int[]  a,b;  // a=1,b=1
//		int[]  a[],b; // a=2, b=1
//		int[]  a[],b[]; // a=2,b=2
//		int[]  []a,b;   // []  []  this space is ignored by compiler.  a=2,b=2
//		
//		int[]  []a,b[]; // a=2,b=3
//		int[]  []a,[]b;  // a=2, but b is not valid. CE:
		
//		if you want to declare the dimension before the variable, then this rule will applicable only for the first variable in a declaration.
//		(of 2-D array). not for the second variable. If we will try to apply for next/onwards/remaining variable the we will get CTE.
		
//		int[]  []a[]b,[]c; // a=2, b=error, c=error
		
//		3-D Array
//		
//		int[][][]   a;
//		int		[][][]a;
//		int		a[][][];
//		int[]	[][]a;
//		int[]	a[][];
//		int[]	[]a[];
//		int[][]	 []a;
//		int[][]	 a[];
//		int		[][]a[];
//		int 	[]a[][];  /// all are valid
//		
		
//		Conclusion: AT the time of decalration we cant specify the size of array.
//		To represent dimension before the variable this rule is applicable only for the first variable not for second and so on.
		
//		Array Creation
		
//		every array in java is object only hence we can create array by using new keyword/operator only.
		
//		int[]  a = new  int[3];  ==> 1-D Array
		
		
//		int = data type
//		[] = dimension & array symbol
//		a = reference variable/ name of array
//		new = reserved keyword use for creating object
//		[3] = 3 => size of array
		
//		usually we can create object only for classess, so that every array type corresponding classes will be there.
//		every array type correspond classess are there but these classesa are only available at language level not for programmer level.
		
//		To see the class:
//			sops(a.getClass().getName());
		
//		int[] a = new int[9];
//		System.out.println(a.getClass().getName());  // [I
//		
//		byte[] a = new byte[9];
//		System.out.println(a.getClass().getName()); // [B
//		System.out.println(a); // [B@2c7b84de
//////		
//		short[] s = new short[9];
////	System.out.println(s.getClass().getName()); // [S
//		System.out.println(s);  // [S@2c7b84de

////		
//		long[] l = new long[7];
////		System.out.println(l.getClass().getName()); // [J
//		System.out.println(l); // [J@2c7b84de
////		
//		float[] f = new float[9];
////		System.out.println(f.getClass().getName()); // [F
//		System.out.println(f);  // [F@3fee733d
////		
//		double[] d= new double[9];
////		System.out.println(d.getClass().getName()); // [D
//		System.out.println(d); // [D@5acf9800
		
//		
//		boolean[] b = new boolean[9];
//		System.out.println(b); // [Z@2c7b84de
//		System.out.println(b.getClass().getName()); // [Z
		
		
//		char[] c = new char[9];
//		System.out.println(c);
//		System.out.println(c.getClass().getName()); // [C
//		
		
//		2-D Array
//		int[][]  a = new int[9][7];
//		System.out.println(a.getClass().getName()); // [[I
		
//		byte[][] b = new byte[4][9];
//		System.out.println(b.getClass().getName()); // [[B
//		
//		short[][] s = new short[8][2];
//		System.out.println(s.getClass().getName()); // [[S
//		
//		long[][] l = new long[9][3];
//		System.out.println(l.getClass().getName()); // [[J
		
//		
//		float[][] f = new float[9][9];
//		System.out.println(f.getClass().getName()); // [[F
//		
//		double[][] d = new double[9][8];
//		System.out.println(d.getClass().getName()); // [[D
//		
//		boolean[][] b = new boolean[1][3];
//		System.out.println(b.getClass().getName()); // [[Z
//		
//		char[][]  c= new char[2][3];
//		System.out.println(c.getClass().getName()); // [[C
		
		
//		Loophole related to array cretion
		
		
//		1.At the time of array creatin compulsory we should specify the size of array otherwise we will get CTE
//		int[] x = new int[];
//		System.out.println(x); // Variable must provide either dimension expressions or an array initializer
		
		
//		int [] x = new int[9];
//		System.out.println(x);  // [I@2c7b84de
		
//		int[] x = new int[0]; // 2.it is legal to have array with size 0 in java
		
//	    3. if we are trying to specify some negative value then it will get some RTE. say: NegativeArraySizeException
		
//		int[] x = new int[-9];
//		System.out.println(x);  // Exception in thread "main" java.lang.NegativeArraySizeException: -9
		
//		Because the job of compiler is to check whether we are applying the size to array or not either its +ve or -ve doesn't matter.
//		 along with that it is int value or not..along sign =ve and -ve are not checked by compiler.
//		and at runtime JVM reserved the memory for size of array when JVM see +ve and -ve size/sign then through RE.
		
//		To specify array size the allowed datat types are in java is onlt byte, short,int,char
		
//		if we trying to apply any other datat type  then we will get CTE. because maximum allowed size  in array is only 2147483647 which is int maximum value.
		
//		So that data type which can implicitly converted into int type are only allowed.
		
//		int [] x = new int[2147483647]; Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit.
//		int[] x = new int[2147483648]; // The literal 2147483648 of type int is out of range 
//		System.out.println(x);  // 
		
//		Even in this first case we will get RTE if sufficient heap memory is not available in our machine/VM.
		
//		2-D array creation-
		
//		In java 2-D array is  not implemented in matrix style some people follow array of arrays approach for multidimentional array creation.
		
//		the main advanatge of this approach is memory utilization will be improved.
		
//		int[][] x = new int[x][]; // Type mismatch: cannot convert from int[][] to int
//		x[0] =new int[2];
//		x[1] =new int[3];
//		
//		System.out.println(x);
		
//		int[][] x = new int['x'][]; 
//		x[0] =new int[2];
//		x[1] =new int[3];
//		
//		System.out.println(x);
//		
//		
//		int[][][] x = new int[2][][];
//		x[0] = new int[3][];
//		x[0][0] = new int[1];
//		x[0][1] = new int[2];
//		x[0][2] = new int[3];
//		x[1] = new  int[2][2];
//		
//		System.out.println(x); // [[[I@2c7b84de
		
//		 Which of the  folowing array are valid.
		
//		int[] a  = new  int[];  // Variable must provide either dimension expressions or an array initializer
//		int[]  a = new int[3];  // [I@2c7b84de
//		int[][]  a = new int[][];  // Variable must provide either dimension expressions or an array initializer
//		int[][]  a = new int[3][];  // [[I@2c7b84de
//		int[][] a = new  int[][4];  // Cannot specify an array dimension after an empty dimension
//		int[][]  a = new int[3][4]; // [[I@2c7b84de
//		int[][]  a = new int[3][3];  // [[I@2c7b84de
//		int[][][]  a = new int[3][4][5];  // [[[I@2c7b84de
//		int[][][]  a = new int[3][4][];  // [[[I@2c7b84de
//		int[][][]  a = new int[3][][5];  // Cannot specify an array dimension after an empty dimension
//		int[][][]  a = new  int[][4][5];  // Cannot specify an array dimension after an empty dimension
//		System.out.println(a); 
		
//		Array Initialization.
		
//		Once  we create an array every array element initialized with default element i.e. 0.
//		int[] x = new int[3];
//		
//		System.out.println(x.getClass().getName()); // [I
		
//		System.out.println(x[0]); // 0
		
//		whenever we are trying to print any reference variable x, internally toString() method will be called which is implemented by default  to return the string with the following form.
//		classname@hashcode_in_Hexadecimalform.
		
//		int[][] x = new int[2][3];
//		
////		System.out.println(x.getClass().getName()); // [[I
//		System.out.println(x[0]); // [I@2c7b84de
//		System.out.println(x[0][0]);  // 0
//		
		
//		int[][] x = new int[2][];
//		System.out.println(x);  // [[I@2c7b84de
//		System.out.println(x[0]); // null
//		System.out.println(x[0][0]); // Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "x[0]" is null
//		
		// If we are trying to perform any operation on  null then we will get NullPointerException.
		
//		index = array length-1
//		int[] x = new int[6];
//		x[0]=10;
//		x[1]=20;
//		x[2]=30;
//		x[3]=30;
//		x[4]=40;
//		x[5]=50;
//		
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
//		System.out.println(x[3]);
//		System.out.println(x[4]);
//		System.out.println(x[5]);
		
//		System.out.println(x[6]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
		
//		 we create an array every array by default initialized with default value i.e. 0.
		
//		System.out.println(x[-6]); // "main" java.lang.ArrayIndexOutOfBoundsException: Index -6 out of bounds for length 6
		
//		System.out.println(x[2.5]); // Type mismatch: cannot convert from double to int
		
//		NOTE :- Compiler only going to check syntactical mistake at compile time.
//		like in array whether it is valid int value or not. if type of array is int. otherwise  it produce error called compile time error.
		
//		But JVM is going to check logical mistake at runtime.
//		like in array whether valid int value is in range , -ve, +ve any other mistake and when found error called runtime exception.
		
//		Array declaration,creation,initialization in a single line.
		
//		int[]  x; // array declaration
//		x = new int[3]; //array creation
//		x[0]=10; // array initialization.
//		x[1]=20;  // array initialization.
//		x[2]=30;  // array initialization.
			
//		
//		int[] x = {10,20,30,40};
//		System.out.println(x[0]); // 10
		
//		char[] x = {'a','b','c','d'};
//		System.out.println(x[0]); // a
		
//		String[] s = {"A","D","AA","","","123","1","2.3","true"};	  // S is caps because it is Non-Premitive Data type.
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(s[2]);
//		System.out.println(s[3]);
//		System.out.println(s[4]);
//		System.out.println(s[5]);
//		System.out.println(s[6]);
//		System.out.println(s[7]);
//		System.out.println(s[8]);
		
		
//		int[][]  x = {{10,20,30},{40,50,60}};  2-D Array - declaaration,creation, initialaization
//		here bracket representation dimentions.
//		System.out.println(x[0]);
//		System.out.println(x[0][0]);
//		System.out.println(x[0][1]);
//		System.out.println(x[0][2]);
//		System.out.println(x[1][0]);
//		System.out.println(x[1][1]);
//		System.out.println(x[1][2]);
		
//		3-D array declaaration,creation, initialaization
		
//		int[][][]  x = {{{10,20,30},{40,50,60,70},{80,90,100,110}}};
//		System.out.println(x[0][0][0]);
//		System.out.println(x[0][0][1]);
//		System.out.println(x[0][0][2]);
//		System.out.println(x[0][1][0]);
//		System.out.println(x[0][1][1]);
//		System.out.println(x[0][1][2]);
//		System.out.println(x[0][1][3]);
//		System.out.println(x[0][2][0]);
//		System.out.println(x[0][2][1]);
//		System.out.println(x[0][2][2]);
//		System.out.println(x[0][2][3]);
		
//		System.out.println(x[0]);  // [[I@2c7b84de
//		System.out.println(x[0][0]); // [I@2c7b84de
		
		
//		int[][][]  x = {{{10,20,30},{40,50,60,70,80}},{{90,100,110,120},{130,140,150,160}}};
//		System.out.println(x[0][0][0]);
//		System.out.println(x[0][0][1]);
//		System.out.println(x[0][0][2]);
//		System.out.println(x[0][1][0]);
//		System.out.println(x[0][1][1]);
//		System.out.println(x[0][1][2]);
//		System.out.println(x[0][1][3]);
//		System.out.println(x[0][1][4]);
//		System.out.println(x[1][0][0]);
//		System.out.println(x[1][0][1]);
//		System.out.println(x[1][0][2]);
//		System.out.println(x[1][0][3]);
//		System.out.println(x[1][1][0]);
//		System.out.println(x[1][1][1]);
//		System.out.println(x[1][1][2]);
//		System.out.println(x[1][1][3]);
//		System.out.println(x[0][1][4]);
		
		
//		System.out.println(x[0][0][8]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 3
//		System.out.println(x[0][4][0]); // Index 4 out of bounds for length 2
//		System.out.println(x[1][0][2]); // 110
//		System.out.println(x[1][5][8]); // Index 5 out of bounds for length 2
//		System.out.println(x[6][5][8]); //  Index 6 out of bounds for length 2
//		System.out.println(x[1][1][8]);
//		System.out.println(x[1][5][8]);
//		System.out.println(x[1][5][8]);
		
//	    int x; // declare
//	    x = 10; // initialize
//	    System.out.println(x); // 10
		
//		int[] x;
//		x = {10,20,30,40,50,60,70}; // Array constants can only be used in initializers
//		System.out.println(x[0]);
		
//		So, from above we can say that if we want  to use this  shortcut we can perform all the activities in a single line, otherwise if perform and divide in multiple line the we will get CTE.
		
		
//		Length  Vs   Length()
//		var     Vs   method
//		
//		int[] x = new int[6];
////		System.out.println(x.length()); // Cannot invoke length() on the array type int[]
//		System.out.println(x.length); // 6
		
//		length is a final variable applicable for array.
//		length variable represent size of array.
		
//		length():-
//		String s = "durga";
//		System.out.println(s.length()); // 5
//		System.out.println(s.length); // length cannot be resolved or is not a field
		
//		length() methosd is final methos applicable for string objects
//		length() method returns no of characters present in the String
		
//		Concept:-
//		
//		final class String
//		{
//			length()
//			{
//				
//			}
//		}
//		
//		Now, length() method present in string class and string class is final. so its not possible to create child and also cant override this method.
//		because we can overrride only in child class.args thats why this method is bydefault always final.
		
//		Conclusion:-
//		Every method present in final class is always final.
		
//		lenght variable applicable for array but not for string Objects.class whereas length() method applicable for String objects but not for array
		
//		String[] s = {"A","AA","AAA"};
//		System.out.println(s.length); //3
//		System.out.println(s.length()); // Cannot invoke length() on the array type String[]
//		System.out.println(s[0].length); // length cannot be resolved or is not a field
//		System.out.println(s[0].length()); // 1
		
//		int[][] x = new int[6][3];
////		System.out.println(x.length); // 6
//////		In Multidimentional arrays length var. represent only base size but not total size of array
////		System.out.println(x[0].length); // 3
////		?There is no direct way to find total length of multidimentional Array.class but indirectly we can find 
//		
//		System.out.println(x.length+x[0].length+x[1].length+x[2].length+x[3].length+x[4].length+x[5].length);  // 24
		
//		Anonymous array :-
//		Sometime we can declare array without name such type of  nameless array called anonymous array
//		The main purpose of anonymous array  is for instant use(one time use).
		 
//		sum(new int[] {10,20,30,40});	
		
//		new   int[]{10,20,30,40}; // anonymous array
		
//		While we creating anonymous array we cant specify the size.
		
//		new int[] {10,20,30,40};// true
//		new int[4] {10,20,30,40};  // false
		
		
//		we can create multidimentional anonymous array also.
//		 new int[][] {{10,20,30},{40,50,60}}; // 2-D array
//		Based on our requirement we can give the name of array so it will no longer anonymous array.
//		
//		 ex :-
		
//		int[] x = {10,20,30,40,50}; // x[0] == 10
//		int[] x = new int[] {10,20,30,40,50}; // x[0]  == 10
//		System.out.println(x[0]);
		
//		int[] x = new int[5];
//		System.out.println(x[0]); // 0
//		System.out.println(x[1]);  // 0
//		System.out.println(x[4]);  // 0
		
//		 In the above example just to call sum method we requires an array but after completing sum method call we are not using that array
//		anymore, hence for this one time requirement anonymous array is the best coice.
		
		
//		Array Element Assigment:-
		
//		Case1:-
//				In the case of primitive types array as array element we cna provide any type which can be implicitly promoted to declared type.
		 
//		int[] x = new int[5];
//		x[0]=10;
//		x[1]='a';
//		byte b = 20;
//		x[2]=b;
//		short s = 30;
//		x[3]=s;
////		x[4]=10l;  // Type mismatch: cannot convert from long to int
//		
//		System.out.println(x[0]); // 10
//		System.out.println(x[1]); // 97
//		System.out.println(x[2]); // 20
//		System.out.println(x[3]); // 30
//		System.out.println(x[4]);  // Type mismatch: cannot convert from long to int
		
		
//		Case 2 :-
//				In the case of float type arraya the allowed datatype are byte,short,int,char,long,float.
		
//		float[] f = new float[6];
//		f[0]=10;
//		byte b = 20;
//		f[1]=b;
//		short s = 30;
//		f[2]=s;
//		long l = 40l;
//		f[3]=l;
//		f[4]='A';
//		f[5]= 1.3f;
//		System.out.println(f[0]);
//		System.out.println(f[1]);
//		System.out.println(f[2]);
//		System.out.println(f[3]);
//		System.out.println(f[4]);
//		System.out.println(f[5]);
		
//		Case 3:-
//				In the case of object type arrays as array element we can provide either declared type object or its child class objects
//		 Object[]  a = new Object[10];  // object is parent 
//		 a[0]= new Object();           // object is child.
//		 a[1]= new String("durga");   // String is child
//		 a[2]= new Integer(10);      // Integer is child
//		 
//		 System.out.println(a[0]);  // java.lang.Object@2c7b84de
//		 System.out.println(a[1]);  // durga
//		 System.out.println(a[2]);  // 10
		 
		 
		 
		
//		Number[] n = new Number[10];
//		n[0]=new Integer(10);  // 10
//		n[1]=new Double(10.5);  // 10.5
//		n[2]=new String("durga");   // Type mismatch: cannot convert from String to Number
//		 System.out.println(n[0]);
//		 System.out.println(n[1]);
//		 System.out.println(n[2]); //  Type mismatch: cannot convert from String to Number
		
//		Case 3:-
//				for interface type arrays as array element its implimentation class objects are allowed.
		
//		Runnable[] r = new Runnable[10];
//		r[0]= new Thread();
//  	r[1]= new String("Durga");
//		System.out.println(r[0]);  // Thread[Thread-0,5,main]
//		System.out.println(r[1]); // Type mismatch: cannot convert from String to Runnable
		
//		Array Variable assingment:-
		
//		Case1:-
//				Element level promotion are  applicable at array level.
//		ex :- char element can be promoted to int Type. whereas char[] can not be prormoted ot int[] array.
//		int[] x = {10,20,30,40,50};
//		char[] ch = {'A','B','C','D'};
//		
//		int[] b = x;
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);
//		System.out.println(b[3]);
//		
//		System.out.println(ch[0]); // A
////		int[] c = ch;
//		System.out.println(c[0]); // Type mismatch: cannot convert from char[] to int[]
		
//		String[] s = {"A","BB","CCC"};
//		Object[] a = s;
//		
//		
//		System.out.println(a[0]); // A
//		System.out.println(a[1]);  // BB
//		System.out.println(a[2]);// CCC
		
//		Here Object is parent and String is child--- So int his case  of object type arrays child class type arrya can be promroted to pareb=nt type array.
		
//		char--> int == true
//		char[]--> int[] == flase
//		int--> double  == true
//		int[]--> double[] == false
//		float--> int  == false
//		float[]--> int[] == false
//		String--> Object == true
//		String[]--> Object[] == true  need to cross check with help of example
		
//		int[] x = {10,20,'A','B'};
//		System.out.println(x[2]); //  char--> int == true
		
//		char[] ch = {'A','B','C'};
//		int[] x = ch; // char[]--> int[] == flase
//		System.out.println(x[0]); // 	Type mismatch: cannot convert from char[] to int[]
		
//		double[] d= {10,20,30,40};
//		System.out.println(d[0]); // 10.0
//		System.out.println(d[1]); // 20.0
//		System.out.println(d[2]);
//		System.out.println(d[3]);
		
//		int[] x = {10,20,30,40};
//		double[] d = x;
//		System.out.println(d[0]); // Type mismatch: cannot convert from int[] to double[]
		
//		Case 2 :-
		
//		whenever we are assigning one array to another array internal element won't be copied. just reeference variable will be reassigned
//		but both the variable have same type.
		
//		int[] x = {10,20,30,40,50,60,70};
//		int[] y = {90,100,110,120,130,140,150};
//		x=y;
//		y=x;
//		System.out.println(y[0]); // 90
//		System.out.println(y[1]); // 100
//		System.out.println(y[2]);  // ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//		System.out.println(y[3]);
//		System.out.println(y[4]);
//		System.out.println(y[5]);
//		System.out.println(y[6]);
//		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
//		System.out.println(x[3]);
//		System.out.println(x[4]);
//		System.out.println(x[5]);
//		System.out.println(x[6]);
//	
//		Form above.above.compareTo( whenever we are trying to assign one array to another array both dimension and size  must be matched. but in size are not required to matched.	)
		
//		int x[]= {10,20,30,40};
//		int[] y= {50,60,70};
//		
//
//		y=x;
//		System.out.println(x[0]); // 50
//		System.out.println(x[1]); // 60
//		System.out.println(x[2]); // 70

//		
//		System.out.println(y[0]);  // 10
//		System.out.println(y[1]); // 20
//		System.out.println(y[2]);  // 30
//		System.out.println(y[3]);  // 40
		
//		int x[] = {10,20,30,40};
//		int y[] = {50,60,70,80,90,100};
//		
//		x=y;
////		y=x;
//		System.out.println(y[0]);
//		System.out.println(y[1]);
//		System.out.println(y[2]);
//		System.out.println(y[3]);
//		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
//		System.out.println(x[3]);
//		System.out.println(x[4]);
//		System.out.println(x[5]);
	
		
//		Case 3:-
//				Whenevr we assign one array to another array dimension must be matched.
		
//		ex:-
//			int[][] x = new int[3][];
//			
//			x[0] = new int[3][4];
//			System.out.println(x[0]); // Type mismatch: cannot convert from int[][] to int[]
//			
//			x[0]= 10;  // Chahiye int[] array but insert kar rahe int value
//			System.out.println(x[0]);  // Type mismatch: cannot convert from int to int[]
			
//			x[0]= new int[2];
//			System.out.println(x[0]); // [I@2c7b84de
//		
//		 for(int i=0; i<args.length;i++)
//		 {
//			 System.out.println(args[i]);
//		 }
		
//		String[] argh = {"x","y","z"};
//		args=argh;
//		for(String s: args) {
//			System.out.println(s);
//		}
		
//		int[][] a = new int[4][3];
//		a[0]=new int[4];
//		a[1]= new int[2];
//		a=new  int[3][2];
		
//		System.out.println(a[4][3]); // Index 4 out of bounds for length 3
//		System.out.println(a[0][2]); // : Index 2 out of bounds for length 2  
//		Object created == 11
//		Eligible for GC == 7
		
//		*************--END OF ARRAY CONCEPT BY DURGA SIR-************ (596-1279= 683 line me concept)
//        array end
		

		
		
		
		
		
		
		
//		 
		
		
		

		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		} //-- main method end
	
	
	
	
//	public static  void sum(int x) 
//	{
//		int total =0;
//		for(int x1 :x) {
//			total = total + x1;
//		}
//		System.out.println("The sum is : " + total); // The method sum(int) in the type Java_Fundamentals is not applicable for the arguments (int[])
//	}

}  //-- class end






















































/*
 * java is case sensitive means caps and small letters have different meaning.
 * there is no limit for java identifiers. NOTE : we can't used reserved words
 * for java identifiers eg : if, else, for, while EXCEPTION : but but all
 * predefined java class name like WRAPPER CALSS- Integer but not int, String
 * but not char and interface name we can use as java identifier, but can't
 * recommended.
 * 
 * 
 */
