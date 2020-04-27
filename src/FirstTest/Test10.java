package FirstTest;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int num, count, total=0;
			
			System.out.println("Enter the Value of n:");
			
			Scanner sc=new Scanner(System.in);
			
			num=sc.nextInt();
			
			sc.close();
			
			for(count=1; count<= num; count++)
			{
				total= total+count;
			}
			
			System.out.println("Sum of First" +num+ "natural numbers is:" +total);
		}
	}

}
