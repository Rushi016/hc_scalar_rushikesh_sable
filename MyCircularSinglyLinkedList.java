
public class MyCircularSinglyLinkedList
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
	
	public Node head;
	public int count;
	
	public MyCircularSinglyLinkedList()
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
	
	public void deleteAtFirst()
	{
		if(isEmpty())
		{
			System.out.println("List Is Empty");
		}
		else if(count == 1)
		{
			head = null;
			System.out.println("null");
			count--;
		}
		else
		{
			Node trav = head;
		
			while(trav.next != head)
			{
				trav = trav.next;
			}
			trav.next = head.next;
			head = head.next;
			count--;
		}
	}
	
	public void deleteAtLast()
	{
		if(count == 1)
		{
			deleteAtFirst();
			count--;
		}
		else
		{
			Node trav = head;
			
			while(trav.next.next != head)
			{
				trav = trav.next;
			}
			
			trav.next = head;
			count--;
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
			int counter = 1;
			Node trav = head;
			
			while(counter<pos-1)
			{
				trav = trav.next;
			}
			trav.next = trav.next.next;
			count--;
		}
	}
	
	public void insertAtFirst(int data)
	{
		Node trav = head;
		Node newnode = new Node(data);
		
		if(isEmpty())
		{
			head = newnode;
			newnode.next = head;
		}
		else
		{
			newnode.next = head;
			while(trav.next != head)
			{
				trav = trav.next;
			}
			trav.next = newnode;
			head = newnode;
		}
		count++;
	}
	
	public void insertAtLast(int data)
	{
		Node newnode = new Node(data);
		if(isEmpty())
		{
			head = newnode;
			newnode.next = head;
		}
		else
		{
			Node trav = head;
			while(trav.next != head)
			{
				trav = trav.next;
			}
			trav.next = newnode;
			newnode.next = head;
		}
		count++;
	}
	
	public void insertAtPosition(int pos, int data)
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
			int counter = 0;
			Node newnode = new Node(data);
			Node trav = head;
			
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
	
	public void display()
	{
		Node trav = head;
		
		if(count == 1)
		{
			System.out.print(trav.data+"-->");
		}
		else
		{
			while(trav.next != head)
			{
				System.out.print(trav.data+"-->");
				trav = trav.next;
			}
			System.out.print(trav.data+"-->");
		}
		System.out.println("null");
	}
}
