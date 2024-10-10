package multilevelinheritance;

public class Childc extends Parentb {
	public void div()
	{
		int e=a/b;
		System.out.println(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childc i=new Childc();
i.read();
i.sub();
i.div();
	}

}
