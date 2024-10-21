package exceptionhandling;

public class Eligible {
	int a=12;
	public void read()
	{
		if(a>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
		//	System.out.println("Not Eligible");
		throw new ArithmeticException("You are not Eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligible ob=new Eligible();
		ob.read();
		
		

	}

}
