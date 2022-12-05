
public class PolindromeString 
{

	public static void main(String[] args) 
	{
		  String a = "aba";
		  String  reverseStr=" ";
		  char[] ch =a.toCharArray();
		  
		  
		    for (int i = ch.length-1; i >=0; --i) 
			{
		      reverseStr = reverseStr + ch[i];
		    }

		    if (reverseStr.equals(a))
			{
		      System.out.println(a + " is a Palindrome String.");
		    }
		    else 
			{
		      System.out.println(a + " is not a Palindrome String.");
		    }		 
			
	}
}	

