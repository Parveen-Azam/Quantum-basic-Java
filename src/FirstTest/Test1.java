package FirstTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a= Integer.parseInt(args[0]);
		
		//int b= Integer.parseInt(args[1]);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Number");
	
		int a=sc.nextInt();
		
		int b=100;
		
		int res= (a>b)? (a) :(b);
		
		if(a>b)
			
		{
			System.out.println("Number is Greater than 100");
		}
		
		else
		{
			System.out.println("Number is Less than 100");
		}
		

	}

}
