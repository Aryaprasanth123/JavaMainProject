package superkeyword;

public class Addition2 extends Addition1 {
	public void display(int a,int b)
	{
		int sum=super.add(a,b);
		if(sum%10==0)
		{
			System.out.println("Addition is divisible by 10");
		}
		else
		{
			System.out.println("Addition is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition2 i=new Addition2();
		i.display(30,20);
		
		
		
		
		

	}

}
