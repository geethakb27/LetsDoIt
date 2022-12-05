import java.util.*;

class LeapYear1
 {
      public static void main(String args[])
      {
      int year;
 
      Scanner sc=new Scanner(System.in);
 
      System.out.print("Enter the YEAR : ");
      year = sc.nextInt();
      
      if (year % 400 == 0)
      {
       System.out.print(year+" is a Leap Year.");
      }
      else if (year % 100 == 0)
      {
       System.out.print(year+" is not a Leap Year.");
      }
      else if (year % 4 == 0)
      {
       System.out.print(year+" is a Leap Year.");
      }
      else
      {
       System.out.print(year+" is not a Leap Year.");
      }
      
      }
 }
