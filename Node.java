
public class Node 
{
	int num,y,n;
	String rule;
	Node yes;
	Node no;
	
	
	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}

	public String getRule() 
	{
		return rule;
	}
	
	public void setRule(String rule) 
	{
		this.rule = rule;
	}
	
	public Node getYes() 
	{
		return yes;
	}
	
	public void setYes(Node yes) 
	{
		this.yes = yes;
	}
	
	public Node getNo() 
	{
		return no;
	}
	
	public void setNo(Node no) 
	{
		this.no = no;
	}
	
	public Node(int num, String rule,int y, int n, Node yes, Node no) 
	{
		this.num = num;
		this.rule = rule;
		this.y = y;
		this.n = n;
		this.yes = yes;
		this.no = no;
	}
	
	
}
