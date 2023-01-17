
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
	
	public void push(int data)
	{
		Node newnode = new Node(data);
		
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
	}
	
	public void pop()
	{
		if(isUnderFlow())
		{
			System.out.println("Stack Is Under Flow");
		}
		else
		{
			
			top = top.next;
		}
		size--;
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
}
