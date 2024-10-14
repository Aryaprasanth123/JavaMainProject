package aggregation;

public class Agsub {
	Agmain ag;
	String place;
	public Agsub(Agmain ag,String place)
	{
		this.ag=ag;
		this.place=place;
		
	}
	public void display()
	{
		System.out.println(ag.id);
		System.out.println(ag.name);
		System.out.println(place);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agmain i=new Agmain("Hello",12);
		Agsub j=new Agsub(i,"tvm");
		j.display();

	}

}
