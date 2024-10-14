package superkeyword;

public class Childsuper extends Parentsuper{
public Childsuper()
{
	super();
	int d=a-b;
	System.out.println(d);
	System.out.println(super.a);
	System.out.println(super.b);
	super.display();

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childsuper i=new Childsuper();

	}

}
