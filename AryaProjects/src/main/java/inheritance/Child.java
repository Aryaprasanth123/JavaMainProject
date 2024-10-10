package inheritance;

public class Child extends Parent{
	public void display()
	{
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child d=new Child();
		d.display();
		d.read();

	}

}
