public class MyLinkedList
{
	public static class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private int count;
	
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	public void insertAtLast(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
		{
			head = newnode;
		}
		else
		{
			Node trav = head;
			while(trav.next!=null)
			{
				trav = trav.next;
			}
			trav.next = newnode;
		}
		
		count++;
	}
	
	public void insertAtFirst(int data)
	{
		Node newnode = new Node(data);
		
		if(isEmpty())
		{
			head = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
		
		count++;
	}
	
	public void insertAtPosition(int data, int pos)
	{
		if(pos == 1)
		{
			insertAtFirst(data);
		}
		else if(pos == count)
		{
			insertAtLast(data);
		}
		else if(pos>count || pos<1)
		{
			System.out.println("Invalid Position");
		}
		else
		{
			Node newnode = new Node(data);
			Node trav = head;
			int counter = 1;
			
			while(counter<pos-1)
			{
				trav = trav.next;
				counter++;
			}
			
			newnode.next = trav.next;
			trav.next = newnode;
			count++;
		}
	}
	
	public void deleteAtPosition(int pos)
	{
		if(pos == 1)
		{
			deleteAtFirst();
		}
		else if(pos == count)
		{
			deleteAtLast();
		}
		else if(pos>count || pos<1)
		{
			System.out.println("Invalid Position");
		}
		else
		{
			Node trav = head;
			int counter = 1;
			while(counter < pos-1)
			{
				trav = trav.next;
				counter++;
			}
			trav.next = trav.next.next;
			count--;
		}
	}
	
	public void deleteAtLast()
	{
		if(count == 1)
		{
			head = null;
			count--;
		}
		else
		{
			Node trav = head;
			int counter = 1;
			
			while(counter < count-1)
			{
				trav = trav.next;
				counter++;
			}
			
			trav.next = null;
			count--;
		}
	}
	
	public void deleteAtFirst()
	{
		if(head == null)
		{
			System.out.println("List Is Empty");
		}
		else if(count == 1)
		{
			head = null;
			count--;
		}
		else
		{
			head = head.next;
			count--;
		}
	}
	
	public void display()
	{
		Node trav = head;
		
		while(trav != null)
		{
			System.out.print(trav.data+"-->");
			trav = trav.next;
		}
		
		System.out.println("null");
	}
}
