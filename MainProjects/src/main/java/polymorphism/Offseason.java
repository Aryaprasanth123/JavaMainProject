package polymorphism;

public class Offseason extends Onseason {
	public void discount()
	{
		super.discount();
		double dm=0.40;
		double d=p-(p*dm);
		System.out.println("Off Season amount : "+d);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason os=new Offseason();
		os.discount();

	}

}
