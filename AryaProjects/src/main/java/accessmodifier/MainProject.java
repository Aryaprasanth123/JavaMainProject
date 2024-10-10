package accessmodifier;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MainProject m=new MainProject();
m.display();
m.read();
m.add();
m.sub();
	}
	public void display()
	{
		System.out.println("Hello");
	}
	private void read()
	{
		System.out.println("World");
	}
	protected void add()
	{
		System.out.println("Welcome");
	}
	void sub()
	{
		System.out.println("Hai");
	}

}
