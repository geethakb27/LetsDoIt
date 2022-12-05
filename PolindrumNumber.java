import java.util.Scanner;
public class PolindrumNumber {

	public static void main(String[] args)
	{
		int n;
		
		int temp=n;
		
		int rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		n=sc.nextInt();
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		if(temp==rev)
		{
			System.out.println("its polindrum  Number :" +temp);
		}
		else
		{
			System.out.println("not a polindrum Number : "+temp);
		}
		

	}

}
