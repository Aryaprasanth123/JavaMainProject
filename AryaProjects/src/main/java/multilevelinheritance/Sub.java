package multilevelinheritance;

public class Sub extends Super {
	public void display()
	{
		int tot=pay+hra-pf-ded+bon;
		System.out.println("Total Salary of the employee : "+tot);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sub s=new Sub();
s.read();
s.add();
s.display();
	}

}
