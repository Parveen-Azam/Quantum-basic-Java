package FirstTest;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float amount=Float.parseFloat(args[0]);
		float tips=Float.parseFloat(args[1]);
	
		float tipamount=(float)((tips/100)*amount);
		System.out.println(tipamount);
	}

}
