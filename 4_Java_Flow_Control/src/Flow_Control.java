
public class Flow_Control {

	public static void main(String[] args) {
		// curly braces is optional everywhere except switch-Case
		// Flow Control
		
//		1. Selection Statement
//		2. Iterative statement
//		3. Transfer Statement
		
//		1.  Selection Statement
//			a. if-else
//		    b. Switch-Case
		
//		2.  Iterative statement
//			a. while()
//			b. do-while()
//			c. for()
//			d. for-each loop
		
//		3.  Transfer Statement
//			a. break
//			b. continue
//			c. return
//			d. try-catch-finally
//			e. assert(1.4v)
		
//		1. a if-else
//		int x = 20;
//		if(x) {// Type mismatch: cannot convert from int to boolean
//			System.out.println("Hello!!");
//		}else {
//			System.out.println("Hii!!");
//		}
//		int x= 10;
//		if(x=20) {// Type mismatch: cannot convert from int to boolean
//			System.out.println("Hello!!");
//		}else {
//			System.out.println("Hii!!");
//		}
//		int x = 10;
//		if(x == 20) {
//			System.out.println("Hello!!");
//		}else {
//			System.out.println("Hii!!");// Hii!!
//		}
//		boolean b = true;
//		if(b=false) {
//			System.out.println("Hello!!");
//		}else {
//			System.out.println("Hii!!");// Hii !!
//		}
//		boolean b= false;
//		if(b=false) {
//			System.out.println("Hello!!");// Hello!!
//		}else {
//			System.out.println("Hii!!");
//		}
//		if(true)
//			System.out.println("Hello");// Hello
//		if(true);
//			
//		if(true)
//			int x=10;//
//		Syntax error, insert ". class" to complete Expression
//		Syntax error, insert "AssignmentOperator Expression" to complete Assignment
//		Syntax error, insert ";" to complete Statement
//		The left-hand side of an assignment must be a variable
//		x cannot be resolved to a variable
		
//		if(true) {
//			int x= 10;
//		}
		
//		if(true)
//			if(true)
//				System.out.println("Hello!!");// Hello!!
//			else
//				System.out.println("Hii!!");
//		int x=10;
//		if(x==90) {
//			System.out.println("Hello 10");
//		}else if(x==20) {
//			System.out.println("Hello 20");
//		}else if(x==30) {
//			System.out.println("Hello 30");
//		}else if(x==10) {
//			System.out.println("Hello 10");// Hello 10
//		}else if(x==10) {
//			System.out.println("Hello 120");
//		}else {
//			System.out.println("Hello 80");
//		}
//		
		
//		b. Switch-Case
//		int x=10;
//		switch(x) {
//			case 1:
//					Action-1;
//					break;
//			case 2:
//				Action 2:
//					break;
//			.
//			.
//			.
//			case n:
//				action n;
//				break;
//				
//			default:
//				default action;
//			
//		}
		
//		byte  b = 120;
//		switch(b) {
//		case 1:
//			System.out.println("case 1");
//		case 2:
//			System.out.println("Case 2");
//		case 120:
//			System.out.println("Case 120");
//		}
//		int x =10;
//		switch(x){
//			// Empty switch Statement is also valid
//		}
//		int x=10;
//		switch(x) {
//			System.out.println("Void switch CTE");// Syntax error on token "{", SwitchLabelDefaultExpr expected after this token
//		}
		
//		int x= 20;
//		int y=30;
//		switch(x) {
//		case 10:
//			System.out.println(10);
//			break;
//		case y;
//			System.out.println(20);// Syntax error, insert ":: IdentifierOrNew" to complete ReferenceExpression, Syntax error, insert ":" to complete SwitchLabel
//			break;
//		}
		
//		int x= 20;
//		final int y=30;
//		switch(x) {
//		case 10:
//			System.out.println(10);
//			break;
//		 case y;
//			System.out.println(20);
//			break;
//		}
		
		
//		int x = 20;
//		switch(x+1) {
//		case 20:
//			System.out.println("case 10 switch label expression");
//			break;
//		case 1+20:
//			System.out.println("constant expression");
//		}
		
//		byte b = 10;
//		switch(b) {
//			case 10:
//			System.out.println("Case 10 in range");
//			case 100:
//				System.out.println("Case 100 in range");
//			case 10000:
//				System.out.println("Case 1000 out of  range");// Type mismatch: cannot convert from int to byte
//		}
		
//		byte b = 10;
//		switch(b+1) {// b+1 -- int dega
//		case 10:
//			System.out.println("Case 10 in range");
//			case 100:
//				System.out.println("Case 100 in range");
//			case 11:
//				System.out.println("Case 11 in range");
//			case 10000:
//				System.out.println("Case 1000 out of  range");
//		}
		
//		int x = 10;
//		switch(x) {
//		case 97:
//			System.out.println("case 97");// Duplicate case
//			break;
//		case 98:
//			System.out.println(98);
//			break;
//		case 99:
//			System.out.println(99);
//			break;
//		case 100:
//			System.out.println(100);
//			break;
//		case 'a':
//			System.out.println("case a");// Duplicate case
//			break;
//		}
		
		
//		Fall through inside switch:
//		int x =0; // 0,1
//		switch(x) {
//		case 0:
//			System.out.println(0);
//		case 1:
//			System.out.println(1);
//			break;
//		case 2:
//			System.out.println(2);
//		}
		
//		int x =1; 
//		switch(x) {// 1
//		case 0:
//			System.out.println(0);
//		case 1:
//			System.out.println(1);// 1
//			break;
//		case 2:
//			System.out.println(2);
//		}
		
//		int x =2; 
//		switch(x) {
//		case 0:
//			System.out.println(0);
//		case 1:
//			System.out.println(1);
//			break;
//		case 2:
//			System.out.println(2);// // 2, deff
//		default:
//			System.out.println("deff");// 2, deff
//		}
//		
//		int x =3; 
//		switch(x) {
//		case 0:
//			System.out.println(0);
//		case 1:
//			System.out.println(1);
//			break;
//		case 2:
//			System.out.println(2);
//		default:
//		System.out.println("deff");//  deff
//		}
		
//		int x =0;
//		switch(x) {
//		default: /// not recommended
//			System.out.println("deff case'");
//		case 0:
//			System.out.println(0);// 0
//			break;
//		case 1:
//			System.out.println(1);
//		case 2:
//			System.out.println(2);
//		}
		
//		int x =1;
//		switch(x) {
//		default: /// not recommended
//			System.out.println("deff case'");
//		case 0:
//			System.out.println(0);
//			break;
//		case 1:
//			System.out.println(1);// 1, 2
//		case 2:
//			System.out.println(2);
//		}
		
		
//		int x =2;
//		switch(x) {
//		default: /// not recommended
//			System.out.println("deff case'");
//		case 0:
//			System.out.println(0);
//			break;
//		case 1:
//			System.out.println(1);
//		case 2:
//			System.out.println(2);// 2
//		}
		
//		int x =3;
//		switch(x) {
//		default: /// not recommended
//			System.out.println("deff case'"); // deff case' , 0
//		case 0:
//			System.out.println(0);
//			break;
//		case 1:
//			System.out.println(1);
//		case 2:
//			System.out.println(2);
//		}
		
		
//		Lecture 27: 
		
//		2.  Iterative statement
//		a. while()
//		b. do-while()
//		c. for()
//		d. for-each loop
		
//		a. while()// when don't know no of iteration in  advance 
		
//		while(1) {
//			System.out.println("Integr type");// Type mismatch: cannot convert from int to boolean
//
//		}
		
//		while (true) {// infinit while loop
//			System.out.println("hello");
//		}
		
//		while(true);
//		while(true)
//			int x =20;
//		while(true) {
//			int x= 20;
//			
//		}
		
//		while(true) {
//			System.out.println("Hello");
//		}
//		System.out.println("Unreachable Statement ");// Unreachable code
		
//		while(false) {// 	Unreachable code
//			System.out.println("Unreachable Statement");
//		}
//		System.out.println("reachable");
//		
		
//		int a=10;
//		int b=20;
//		while(a<b) {
//			System.out.println("Hello");
//		}
//		System.out.println("Reachable code");
		
//		int a=10, b=20;
//		while(a>10) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hii");// Hii
		
		
//		final int a=10;
//		final int b=20;
//		while(a<b) {
//			System.out.println("Hello");
//		}
//		System.out.println("Unreachable code due to final variable");// Unreachable code
		
		
//		
//		final int a=10, b=20;
//		 while(a>10) {// Unreachable code
//
//			System.out.println("Hello");
//		}
//		System.out.println("Hii");
//		
//		 
//		do while() loop
//		boolean x =true;
//		 do;
//			 while(true);
		 
//		do
//			 System.out.println("Fahad");// Infinite do while loop
//		while(true);
//				
//		do;
//		while(true);
		
//		do
//			System.out.println("Fahad");
//		while(false);
		
//		do
//			System.out.println("Fahad");
//		while(true);
		
//		do
//			System.out.println("Fahad");
//		while(true);
//			System.out.println("Fahad");
		
//		do
//			System.out.println("Fahad");// Syntax error, insert "while ( Expression ) ;" to complete BlockStatements
//			System.out.println("Fahad");
//		while(true);
		
//		do
//		{
//			System.out.println("Fahad");
//			System.out.println("Fahad");
//			System.out.println("Fahad");
//		}
//		while(true);
		
//		do
//			int x= 10;
//		while(true);
		
//		do {
//			int x= 10;
//			System.out.println("Fahad");
//			System.out.println(x);
//		}
//		while(true);
		
//		do 
//			while(true)
//			System.out.println("Fahad");
//			while(false);
		
//		do
//			while(true)
//				System.out.println("true");
//		while(false);
		
//		Unreachability:-
		
//		do {
//			System.out.println("Hello !!");
//		}
//		while(true);
//		System.out.println("Fahad");// Unreachable code
		
//		do {
//			System.out.println("Hello!!");
//		}
//		while(false);
//		System.out.println("Hii!!");
		
//		int a=10, b=20;
//		do {
//			System.out.println("Hello");
//		}while(a<b);// true
//		System.out.println("Hii");
//		int a=10, b=20;
//		do 
//		System.out.println("Hello");
//		while(a<b);
//		System.out.println("Hello");
//		
		
//		final int a=10, b=20;
//		do 
//		System.out.println("Hello");
//		while(a<b);
//		System.out.println("Hello"); // Unreachable code due to final a & b variable
		
		
//		int a=10, b=20;
//		do {
//			System.out.println("Hello");
//		}while(a>b);
//		System.out.println("Hii");
		
//		final int a=10, b=20;
//		do {
//			System.out.println("hello");
//		}while(a<b);
//		System.out.println("hii'");// Unreachable code
		
//		final int a=10, b=20;
//		do {
//			System.out.println("hello");
//		}while(a>b);
//		System.out.println("hii'");
		
//		Lecture 28 :- for & for each loop
		
//		For Loop:-
//		If we know the number of iteration in advace then we can go for for loop
		
//		for(Initialization_Section;Condition_ceck;incre_decre_Section) {
//			loop body
//		}
//		
//		Steps of execution of for loop
		
//		1. initialization
//		2. condition check
//		3. execute loop body
//		3. incre-decrem section
//		5. condition check
//		6. execute loop body
//		7. incre-decrem section
//		8. condition check
//		9. execute loop body
		
//		eg: 
//		for(;true;) { // Infinite loop
//			System.out.println("fahad");
//		}
		
//		for(;;) {// Infinite loop
//			System.out.println("fahad");
//		}
  
//		for(int i=0; true;i++)// Infinite loop
//			System.out.println("Fahad");
		
//		for(int i=0;true;i++)
//			int x= 10;
//		Syntax error, insert ". class" to complete Expression
//		Syntax error, insert "AssignmentOperator Expression" to complete Assignment
//		Syntax error, insert ";" to complete Statement
//		The left-hand side of an assignment must be a variable
//		x cannot be resolved to a variable
		
//		for(int i=0;true;i++)
//			;
		
//		for(int i=0;true;i++);
		
//		for(int i=10;i<10;i++)
//			int z=10;
		
//		Initialization section:
		
//		for(int x=9,y=10,z=30;x<10;x++)
//			System.out.println("fahad");
		
//		for(int i=0, int j=0; i<10;i++)// Syntax error on token "int", delete this token
//			System.out.println("Fahad");
		
//		for(String S ="Fahad"; S=="Fahad"; S="Ali")
//			System.out.println("fahad");
		
//		for(String S ="Fahad", int x=10; S=="Fahad"; S="Ali")
//			System.out.println("fahad");// Syntax error on token "int", delete this token
										//Type mismatch: cannot convert from int to String
			
//		for(String S ="Fahad", K="Kite"; S=="Fahad"|| K=="Kite"; S="Ali")
//			System.out.println("fahad");
		
//		for(String S ="Fahad", K="Kite"; S=="fahad"|| K="Kite"; S="Ali")
//			System.out.println("fahad");//The operator <= is undefined for the argument type(s) java.lang.String, java.lang.String
										//Syntax error on token "=", <= expected
		
		
//		for(String S ="Fahad", K="Kite"; S=="fahad"|| K=="Kite"; S="Ali")
//			System.out.println("fahad");
		
		
//		for(String S ="Fahad", K="Kite"; S=="Fahad"&& K=="Kite"; S="Ali")
//			System.out.println("fahad");
		
//		int i=0;
//		for(System.out.println("Hello u are sleeping");i<3;i++)
//		{
//			System.out.println("No U are sleeping");
//		}
//		Hello u are sleeping
//		No U are sleeping
//		No U are sleeping
//		No U are sleeping
		
		
//		Condition check:-
//		we can take any valid java expression but shoul be of type boolean
//		This part is optional and if we are not anything then compiler by default will place true
		
//		eg:
//		for(int x=0;true;x++) {
//			System.out.println("hello");
//		}
		
//		Icrement?Decrement Section:
		
//		int i=0;
//		for(System.out.println("'hello 1");i<3;System.out.println("Hii 2")) {
//			i++;
//		}
		
//		int i=0;
//		for(System.out.println("'hello 1");i<3;System.out.println("Hii 2")) {
//			
//		}
//		all three part of loop independent of each other and optional
//		for(;;) {
//			
//		}
//		for(;;) {
//			System.out.println("Hello");
//		}
		
//		for(;;);// infinite loop
		
//		for(System.out.println("Fahad");;);
		
//		Unreachability:
		
//		for(int i=0;true;i++) {
//			System.out.println("Accessible");
//		}
//		System.out.println("Non-Accessible");// Unreachable code
		
//		for(int i=0;false;i++) {
//			System.out.println("Non-Accessible");// Unreachable code
//		}
//		System.out.println("Accessible");
		
//		for(int i=0; ;i++) {// by default true
//			System.out.println("Reachable");
//		}
//		System.out.println("Unreachable code");
		
//		 int a=10, b=20;
//		for(int i=0;a<b;i++) {
//			System.out.println("Hello");
//		}
//		System.out.println("hii");
		
//		int a=10,b=20;
//		for(int i=10;a>b;i++) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hii");
		
		
//		final int a=10, b=20;
//		for(int i=0;a<b;i++) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hii");
		
//		final int a=10, b=20;
//		for(int i=0;a>b;i++) {
//			System.out.println("Hello");// Unreachable code
//		}
//		System.out.println("Hii");
		
//		For-Each Loop(Enhanced for loop)
//		Introduced in 1.5 v. specially designed for Arrays & Collection to retrive element of array and collection
		
//		Case 1:-
//		To print an element of 1-D Array
		
//		int[] x = {10,20,30,40};
		
//		Normal for loop
		
//		for(int i=0;i<x.length;i++) {
//			System.out.println(x[i]);
//		}
		
//		for(int i=0;i<x.length;i++) {
//			System.out.println("x[i]="+x+""+i+".."+x[i]);
//		}
		
//			  x[i]=[I@2c7b84de0..10
//		      x[i]=[I@2c7b84de1..20
//		      x[i]=[I@2c7b84de2..30
//		      x[i]=[I@2c7b84de3..40
		
//		for(int i=0;i<x.length;i++) {
//			System.out.println("x[i]="+x[i]);
//		}
		
//		for(int x1:x) {
//			System.out.println(x1);
//		}
		
//		To_Print element of 2_D Array
//		int[][] x = {{10,20,30},{40,50}};
		
//		for(int i=0;i<x.length;i++) {
//			for(int j=0;j<x[i].length;j++) {
//				System.out.println(x[i][j]);// 10,20,30,40,50
//			}
//		}
		
//		for(int[] x1 : x) {
//			for(int x2 : x1) {
//				System.out.println(x2);// 10,20,30,40,50
//			}
//		}
		
//		To print element of 3-D array
		
//		int[][][] x= {{{10,20},{30,40}},{{50,60,70},{80,90}}};
		
//		for(int x1[][]:x) {
//			for(int x2[]:x1) {
//				for(int x3:x2) {
//					System.out.println(x3);// 10,20,30,40,50, 60,70,80,90
//				}
//			}
//		}
		
//		for(int i=0;i<x.length;i++) {
//			for(int j=0;j<x[i].length;j++) {
//				for(int k=0;k<x[i][j].length;k++) {
//					System.out.println(x[i][j][k]);// 10,20,30,40,50, 60,70,80,90
//				}
//			}
//		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println("No of Itearion :"+(i+1)+"   With value :"+i);
//		}
//		
//		we can write equivalent for each loop directly for above genral purpose for loop
//		
//		for(int  : x) {
//			System.out.println(); // not possible
//		}
		
//		int[] x = {10,20,30,40,50}; // print element in reverse order
//		for(int i=x.length-1;i>=0;i--) { 
//			System.out.println(x[i]);
//		}
		
//		int[] x= {10,20,30,40,50};
////		for(int x1 : x) {
////			System.out.println(x1);
////		}
//		for(int x1 : x) {
//			System.out.println(x1);
//			
//		}
		
//		Lecture 29: Break and continue  
//		Transfer Statement:
//		1. Break 
//		2. Continue
		
//		Trnafer statement is used ot trnafer the control from one place to another
		
//		 can use break inside switch to stop fall through
		
//		int x=0;
//		switch(x)
//		{
//		case 0:
//			System.out.println(0);// 0
//		case 1:
//			System.out.println(1);// 1
//			break;// 0,1
//		case 2:
//			System.out.println(2);
//		default:
//			System.out.println("def");
//		}
		
		
//		Inside loops: to break loop execution based on some condition:
		
//		for(int i=0;i<10;i++) {
//			if(i==5)
//				break;// 0,1,2,3,4 break means tootna aage nahi jaega.
//			System.out.println(i);
//		}
		
//		Inside lAbeled blocks:to break block execution based on some condition:
		
//		int x=10;
//		l1:{
//		System.out.println("begin");
//		if(x==10)
//			break l1;
//		System.out.println("end");
//		}
//		System.out.println("hello");
//		o/p begin, hello
		
//		byte b= 10;
//		l1:{
//			System.out.println("Begin Label");
//			if(b==10)
//				break l1;
//			System.out.println("END Label");
//			
//		}
//		System.out.println("Hello Label");// Begin Label, 	Hello Label
		
//		int x=10;
//		if(x==10)
//			break;
//		System.out.println("Hello");// break cannot be used outside of a loop or a switch
		
//		Continue statement: 
//		skip current iteration and continue next iteration
		
//		for(int i=0;i<10;i++) {
//			if(i%2==0)
//				continue;
//			System.out.println(i);// 1,3,5,7,9
//			
//		}
//		we can use continue statement pnly inside loop 
		
//		int x=10;
//		if(x==10)
//			continue;
//		System.out.println("hello");// continue cannot be used outside of a loop
		
//		Labelled Break & COntinue:
//		l1:{
//			for() {
//				l2:{
//					for() {
//						for() {
//							break l1;// See video
//							break l2;
//							break;
//						}
//					}
//				}
//			}
		
		
//		}
			
		
//		l1:
//			for(int i=0;i<3;i++) {
//				for(int j=0;j<3;j++) {
//					if(i==j) 
//						continue l1;
//					System.out.println(i+"..."+j);
//					
//				}
//			}
//		O/P
//		1...0
//		2...0
//		2...1
		
//		l1:
//			for(int i=0;i<3;i++) {
//				for(int j=0;j<3;j++) {
//					if(i==j) 	
//						continue;
//					System.out.println(i+"..."+j);
//					
//				}
//			}
		
//		O/P:
//		0...1
//		0...2
//		1...0
//		1...2
//		2...0
//		2...1
		
//		l1:
//			for(int i=0;i<3;i++) {
//				for(int j=0;j<3;j++) {
//					if(i==j) 	
//						break;
//					System.out.println(i+"..."+j);
//					
//				}
//			}
//		O/P:
//		1...0
//		2...0
//		2...1
		
//		l1:
//			for(int i=0;i<3;i++) {
//				for(int j=0;j<3;j++) {
//					if(i==j) 	
//						break l1;
//					System.out.println(i+"..."+j);
//					
//				}
//			}
//		O/P: No output
		
		
//		do-While Loop:Vs Continue/dangerous combination
		
		
//		int x=0;
//		do {
//			x++;
//			System.out.println(x);
//			if(++x<5)
//				continue;
//			x++;
//			System.out.println(x);
//		}while(++x<10);
//		O/P:
//		1
//		4
//		6
//		8
//		10
		
	}

}
