package abstraction;

public class Stud implements Student,Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s=new Stud();
		s.read();
		s.display();

	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
	}

}
