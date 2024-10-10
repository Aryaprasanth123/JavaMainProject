package hierarchicalinheritance;

public class Superchild extends Mainparent{
	public void sub()
	{
		int s=a-b;
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Superchild i=new Superchild();
		i.read();
		i.sub();

	}

}
