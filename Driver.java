import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	ArrayList<Node> rules = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void loadFile() 
	  {
		File usersFile = new File("../InClassTest/src/rules.txt");    
	      Scanner In;
	      try {
			In = new Scanner(usersFile);
			String delims = ":";			
			while (In.hasNextLine()) 
			{
				String userDetails = In.nextLine();
		        String[] userTokens = userDetails.split(delims);

		        if (userTokens.length == 4)
		        {
		        	int num = Integer.parseInt(userTokens[0]);
		        	String rule = userTokens[1];
		        	int y = Integer.parseInt(userTokens[2]);
		        	int n = Integer.parseInt(userTokens[3]);
		        	Node node = new Node(num, rule, y, n, null, null);
		        	rules.add(node); 
		        }
			}
			Node node1 = new Node(20,"Take it",1, 1, null, null);
			rules.add(node1);
			
	      } catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	  }
	
	public void createRules()
	{
		for(int i = 0; i < rules.size(); i++)
		{	
				rules.get(i).yes = rules.get(rules.get(i).y - 1);
				rules.get(i).no = rules.get(rules.get(i).n - 1);
		}
	}
	
	public void display()
	{
		Node root = rules.get(0);
		while(root.yes != null || root.no != null )
		{
			if(root.rule.equals("Take it"))
			{
				System.out.println("Finish");
				break;
			}
			System.out.println(root.rule);
			String input = sc.nextLine();
			if(input.equals("yes"))
			{
				if(root.yes == null)
				{
					System.out.println("finish");
				}
				root = root.yes;
			}
			if(input.equals("no"))
			{
				if(root.no == null)
				{
					System.out.println("finish");
				}
				root = root.no;
			}
			
		}
	}
}
