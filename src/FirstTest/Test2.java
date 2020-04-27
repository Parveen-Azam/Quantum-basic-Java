package FirstTest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Number");
		
		int res=sc.nextInt();
		
		if((res < 200) && (res % 2 == 0))
			
		{
		
		System.out.println("The Number is:" +res);
		
		}
		
		else
		{
			System.out.println("Invalid Number");
			
		}

}
}

