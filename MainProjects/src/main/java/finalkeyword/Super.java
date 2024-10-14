package finalkeyword;

public class Super extends Sub {
	final int a=20;
//	public Super()
//	{
//		 a=20;
//	}
	/*public final void read() 
	{
	final method cannot be override	
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super s=new Super();
System.out.println(s.a);
s.read();//final method can be inherited
	}

}
