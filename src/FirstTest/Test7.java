package FirstTest;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num = 1;
		
		//char ch= 'd';
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Any Number");
		int res=sc.nextInt();
		char ch='f';
		
		
		switch(res)
		{
		
		 case 1:
				
				System.out.println("in Reston Cinemax the currently running movie is: Fast and Furious ") ;
				break;
						
		case 2:
				
				System.out.println("in Arlington Cinemax the currently running movie is: jumanji");
				break;
		case 3:
		
			switch(ch)
			 
			 {
		
			case 'a':
			     System.out.println("in sterling Cinemax the currently running movie is: frozen");
			     break;
			     
			case 'b':
				System.out.println("in herndon Cinemax the currently running movie is: superman");
				break;
				
			case 'c':
				System.out.println("in chantilly Cinemax the currently running movie is: spiderman");
				break;
				
			case 'd':
			     System.out.println("in dulles Cinemax the currently running movie is: frozen2");
			     break;
			     
			case 'e':
				System.out.println("in stephencity Cinemax the currently running movie is: conjuring");
				break;
				
			case 'f':
				System.out.println("in Fairfax Cinemax the currently running movie is: wonderwoman");
				break;
			}
			
	 



}
}
}
