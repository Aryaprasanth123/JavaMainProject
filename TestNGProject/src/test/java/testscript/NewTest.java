package testscript;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 1)
  public void pdisplay() {
	  System.out.println("Hello World");
  }
  @Test(priority = 2)
  public void dread()
  {
	  System.out.println("Hello");
  }
  @Test
  public void show()
  {
	  System.out.println("Welcome");
  }
}
