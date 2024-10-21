package exceptionhandling;

public class Exhand {
	public void read()
	{
		try
		{
		int a=10/0;
		System.out.println(a);
	}
		catch(ArithmeticException b)
		{
			System.out.println("Exception handling"+b);
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("ArrayIndexBoundsException Caught : "+i);
		}
		catch(Exception e)
		{
			System.out.println("General Exception : "+e);
		}
		finally
		{
			System.out.println("Hello world");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exhand ob=new Exhand();
		ob.read();

	}

}
