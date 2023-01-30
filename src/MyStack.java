
public class MyStack
{
	private Node top;
	private int size;
	
	MyStack()
	{
		this.top = null;
		this.size = 0;
	}
	
	static class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public boolean isUnderFlow()
	{
		return top == null;
	}
	
	public void peak()
	{
		if(isUnderFlow())
		{
			System.out.println("Stack is not available");
		}
		else
		{
			System.out.println(top.data+"-->");
		}
		
		display();
	}
	
	public void pop() throws Exception
	{
		
		try
		{
			if(isUnderFlow())
			{
				throw new Exception("Stack Is Under Flow");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		top = top.next;
		size--;
		
		display();
	}

	public void push(int data2)
	{
		
		Node newnode = new Node(data2);
		
		if(top == null)
		{
			top = newnode;
		}
		else
		{
			newnode.next = top;
			top = newnode;
		}
		size++;
		
		display();
	}
	
	public void display()
	{
		Node trav = top;
		
		while(trav!= null)
		{
			System.out.print(trav.data+"-->");
			trav = trav.next;
		}
		System.out.println("null");
	}

	public int getCount()
	{
		
		return 0;
	}
}
