
public class Main 
{
	static Driver driver = new Driver();
	
	public static void main(String arg[])
	{
		driver.loadFile();
		driver.createRules();
		driver.display();
	}
	
}
