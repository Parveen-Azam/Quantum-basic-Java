package FirstTest;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter  the rows you want : ");
		
		int rows=sc.nextInt();
		
		System.out.println(" ");
		
		for(int i=1; i<=rows; i++)
		{
			
		  {
			for(int j=0; j<rows-i; j++)
				
			System.out.print(" ");
		   }
		
		
		for(int k=1; k<i; k++)
		 
		  {
			System.out.print(k);
		  }
		
		for(int l=i; l>=1; l--)
			
		  {
			System.out.print(l);
		  }
		
		System.out.print("\n");
		
	}
	

}
}