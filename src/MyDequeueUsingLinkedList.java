
public class MyDequeueUsingLinkedList
{
	private Node f;
	private Node r;
	private int size;
	
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	MyDequeueUsingLinkedList()
	{
		f = null;
		r = null;
		size = 0;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public boolean isUnderFlow()
	{
		return f == null;
	}
	
	public void deQueue() throws Exception {
		
		try 
		{
			if(isUnderFlow())
			{
				throw new Exception("Queue Is Under Flow");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		f = f.next;
		size--;
		
		display();
	}

	public int getCount() {
		return 0;
	}

	public void enQueue(int data) {
		 Node newnode =new Node(data);
			
			if(f==null && r==null)
			{
				f=newnode;
				r=newnode;
				size++;
			}
			else
			{
				r.next = newnode;
				r = newnode;
				size++;
			}
			
			display();
	}
	
	public void display()
	{
		Node trav = f;
		
		while(trav!= null)
		{
			System.out.print(trav.data+"-->");
			trav = trav.next;
		}
		
		System.out.println("null");
	}
}
