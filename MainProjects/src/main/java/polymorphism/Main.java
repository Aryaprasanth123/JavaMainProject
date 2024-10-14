package polymorphism;

public class Main extends Poly1 {
	public void read()
	{
		super.read();
		int d=a-b;
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main p=new Main();
		p.read();
		

	}

}
