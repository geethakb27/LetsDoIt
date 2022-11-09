1. Explain JRE, JDK,JVM
  
  JVM stands for Java virtual Machine
  byte code is an intermediate which is neither low level or nor highlevel language it use jvm convert to machine leve code source code
  execute line by line.
  JRE : Java RunTime Environment which is present inside the JDK contains the set of libraries and java virtual machine to execute the byte code .

	JDK: JAVA DEVELOPMENT KIT : which contains the JRE and JVM which is used to develop and execute the java program.
	
	JVM : JAVA VIRTUAL MACHINE : which is not physically exist .present inside the JRE which will perform the functions such as:
			* loads the byte code.
			*verifies the byte code
			*interpret the byte code line by line.
			*executes the byte code .
			
  
 2.class:is virtual machine
         it act as blueprint for objects
		 class is used for stroing related variables and method
  object: object is a real world entity
		  we use ne keyword for creating object
  public : its a access modiifer it can use anywhere in the class
 private : its is   also a access modifer it can accessed in that class only
 
ii]Public static void main(String a[]):
			public is the access specifier which the file can be accessed anywher in the system java compiler will load that file .

			static is the non access modifier which will allocate the memory in the compilation time.

			void is the return type which will not return any value to the user .

			main is the methode name wher the execution will began jvm will search for the main methode for the execution purpose.

			String is the non primitive datatype which will store the data which are passed in the command line in an String array.  
		  
		iii]System.out.println(); it will prints the output in the console .for the user 

3]:Array : we can store more than one similar type of elements into the single variable with the help of array . 

			int arr[]={1,2,3,4};

4]: class Program
	{
		 static int num[] = {23,45,56,67,8,12,3,5,7,9,102,34,4,5};
		
		static int count=0;
		static int count1=0;
		
	static boolean checkForPrime()
		{
		boolean isItPrime = true;
		for (int i = 0; i<num.length; i++)
	{		

	if(num[i] <= 1) 
	{
	isItPrime = false;

	return isItPrime;
	}
	else
	{
	for (int j = 2; j<= num[i]/2; j++) 
	{	
	if ((num[j] % 2) == 0)
	{
	isItPrime = false;

	break;
	}
	}

	return isItPrime;
	}
	}
		}

	static void oddEven(){
		for (int i = 0; i<num.length; i++){
			
		if(num[i]%2==0)
		{
			count++;
			System.out.println("even number is"+num[i]+""+count);
			
		}
		else{
			count1++;
			System.out.println("odd number is"+num[i]+""+count1);
			
		}
		}
		
	}
	
	static void size()
	{
		int len=num.length;
		System.out.println("size is"+len);
		
		
	}
	
	public static void main(String[] a)
	{
		checkForPrime();
		checkForPrime();
		
		boolean isItPrime = checkForPrime();

		if (isItPrime)
		{
		System.out.println(" is a prime number.");
		}
		else
		{ 
		System.out.println(" is not a prime number.");
		}
		oddEven();
		size();
		
	}
		}

7.constructor : by used constructor we can initialize object
				constructor name should be a same as class name
				it has no return type.
				->yes class will contain a multiple constructor.
				2 types of constructor
				 * default constructor
				 * parameterized constructor
                   -> defaulf constructor has a no arguments
				   the java complier supplies as a default constructor for that class
					ex: class num()
					{
					}
					->parameterized constructor we can pass the arguments
					class num(int n,int m)
					{
					 this.int a=a;
					 this.int b=b;
					}
8.java features:
*easy : becouse it can easy to run the program
*scure and simple: it cannont be easy hack by others
* gardbage collector: its can stores the data and it will delete the uncessary data
* high level
* multi thread
* robust
*protable
*Extensible

9. what is gives java its write once and run anywhere nature?
WRITE ONCE RUN ANYWHERE NATURE means the program which is developed & compiled using one platform it can be executed in other 
	platform whitout any compilation.

5.datatype
 datatype is used to indicate the different type of data into a variables 
2 type of datatype
 primitive datatype
 int
 byte
 short
 long
 double
 float
 boolean
 char
 non primitive datatype
 String ,System etc
All class name which start with upper case letter

 variables :
 it is a register area allocated in a memory
 4types of variables
  static : it can be initialized inside the class outside the main method
  local :it can be declared  inside class and main method
  instance: it can be decalred inside the class and outside the main method
  parameterized: it is used pass the parameter inside it.
  12]:reverse a number

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		int rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=s.nextInt();
		
		while(n!=0)
		{
			 int rem=n%10;
			 rev=rev*10+rem;
			n=n/10;
			
			
		}
		System.out.println(rev);

	}

}

13]:factorial

public class Facto {	
	static int factorial(int n)
	{
		if(n!=0)
		{
			return n*factorial(n-1);
		}
			else
			{
				return 1 ;
			
		}
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		int n=s.nextInt();
		
		int fac=factorial(n);
		System.out.println(fac);
	

	}

}

14]: input : 234 out:9

import java.util.*;
public class Sum {

	public static void main(String[] args)
	{
		int summ=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=s.nextInt();
		
		while(n!=0)
		{
			 int rem=n%10;
			 summ=summ+rem;
			n=n/10;
			
			
		}
		System.out.println(summ);

	}

}
  
 