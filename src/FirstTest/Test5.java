package FirstTest;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s=new Scanner(System.in);
		
		System.out.print("Enter any Year");
		
		int year =s.nextInt();
		boolean flag = false;
		
		if(year % 4 == 0)// year is evenly divisible by 4 goto step 2 oth stp 5 
		{
			
		   if(year % 100 == 0)//year is evenly divisible by 100 goto step 3 oth stp 4
		    { 
			   
		      if(year % 400 ==0)//year is evenly divisible by 400 goto step 4 oth stp 5
		

				    flag=true;
			      
			      else
			    	  
			    	flag=false;
			     }
			else
			
				flag=true;
		     }
			
			else
			{
			      flag=false;
			}
				
			if(flag==true)
				System.out.println(year + " is a leap year");// 366 days=leap year
			else 
				System.out.println(year + " is not a leap year");// 365 days= Non leap year
		}
	}
				
			


