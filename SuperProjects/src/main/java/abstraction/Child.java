package abstraction;

public class Child implements Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob=new Child();
		ob.read();
		ob.display();
		//interface object creation using class
		Parent obj=new Child();
		obj.display();

	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Java world");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

}
