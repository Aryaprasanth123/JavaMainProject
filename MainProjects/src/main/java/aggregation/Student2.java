package aggregation;

public class Student2 {
	Studmain sm;
	String address;
	public Student2(Studmain sm,String address)
	{
		this.sm=sm;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Student name : "+sm.name);
		System.out.println("Student Rollno : "+sm.rno);
		System.out.println("Student Address : "+address);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studmain i=new Studmain("Arya",12);
		Student2 j=new Student2(i,"AryaNivas");
		j.display();
		
		

	}

}
