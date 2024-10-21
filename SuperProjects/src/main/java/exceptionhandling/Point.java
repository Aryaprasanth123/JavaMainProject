package exceptionhandling;

public class Point {
	String str=null;
	public void read()
	{
		try
		{
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException caught : "+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point();
		p.read();

	}

}
