package encapsulation;

public class Amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User ob=new User();
		ob.setter(1001);
		ob.getter();
		if(ob.getter())
		{
			System.out.println("Valid pin number");
		}
		else
		{
		System.out.println("Invalid pin number");
		}
	}
}

	
	

