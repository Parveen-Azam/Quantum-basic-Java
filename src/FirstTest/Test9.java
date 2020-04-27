package FirstTest;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("How many rows: ");
		
		 int noOfRows = sc.nextInt();//initializing the row value
		  
		 int rowCount=1;
		 
		 System.out.println("Here is your pyramid");
		 
		 for (int i=noOfRows; i>0; i--)
		 {
			 for( int j=1; j<=i; j++ )
			 {
				 System.out.print(" ");
			 }
			 
			 for( int j=1; j<=rowCount; j++)
			 {
				 System.out.print(rowCount+" ");
			 }
			 
			 System.out.println();
			 
			 rowCount++;
			 
		 }
		 
		 
				
	}

}
