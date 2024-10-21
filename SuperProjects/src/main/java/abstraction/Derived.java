package abstraction;

public class Derived extends Super{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d=new Derived();
		d.read();
		d.display();
		Super.write();

	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
	}

}
