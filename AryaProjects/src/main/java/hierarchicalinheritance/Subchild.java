package hierarchicalinheritance;

public class Subchild extends Mainparent {
	public void mul()
	{
		int m=a*b;
		System.out.println(m);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subchild j=new Subchild();
		j.read();
		j.mul();

	}

}
