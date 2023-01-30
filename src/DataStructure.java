import java.util.Scanner;

public class DataStructure
{
	static Scanner sc = new Scanner(System.in);
	
	public static void toArrayDataStructure() throws Exception
	{	
		System.out.println("**You Choose Array Data Structure**");
		MyArray arr = new MyArray();
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int a[] = new int[size];
	
		do
		{
			System.out.println("1. Create Array");
			System.out.println("2. Insert At Position");
			System.out.println("3. Insert At Position By Shifting");
			System.out.println("4. Delete At Position");
			System.out.println("5. Delete At Position By Shifting");
			System.out.println("6. Find Minimum Number");
			System.out.println("7. Find Maximum Number");
			System.out.println("8. Bubble Sort Array");
			System.out.println("9. Back");
			System.out.println("@ Which Operation You Have To Perform : ");
			
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1 : arr.createArray(a);
					break;
				
				case 2 : arr.insertAtPosition(a, size);
					break;
				
				case 3 : arr.insertAtPositionShift(a);
					break;
				
				case 4 : arr.deleteAtPosition(a, size);
					break;
				
				case 5 : arr.deleteAtPositionShift(a);
					break;
				
				case 6 : arr.findMin(a);
					break;
				
				case 7 : arr.findMax(a);
					break;
					
				case 8 : arr.bubbleSortArray(a);
					break;
					
				case 9 : 
					Structure.dataStructure();
				
				default : System.out.println("Invalid Choice");
				
			}
			
		}while(true);
	}
	
	public static void toLinkedListDataStructure() throws Exception
	{
		System.out.println("**You Choose LinkedList Data Structure**");
		MyLinkedList ml = new MyLinkedList ();
	
			do
			{
				System.out.println("1. Insert At Last");
				System.out.println("2. Insert At First");
				System.out.println("3. Insert At Position");
				System.out.println("4. Delete At Last");
				System.out.println("5. Delete At First");
				System.out.println("6. Delete At Position");
				System.out.println("7. Back");
				System.out.println("@ Which Operation You Have To Perform : ");
				
				int ch = sc.nextInt();
				
				switch(ch)
				{
					case 1 :
						try
						{
							System.out.println("Enter Your Data");
							int data1 = sc.nextInt();
							ml.insertAtLast(data1);
						}
						catch(Exception e)
						{
							System.out.println("Invalid Input");
						}
						
						break;
					
					case 2 : 
						System.out.println("Enter Your Data");
						int data2 = sc.nextInt();
						ml.insertAtFirst(data2);
						break;
					
					case 3 : 
						System.out.println("Enter Your Data");
						int data3 = sc.nextInt();
						System.out.println("Enter Your Position");
						int pos = sc.nextInt();
						ml.insertAtPosition(data3, pos);
						break;
					
					case 4 : ml.deleteAtLast();
						break;
					
					case 5 : ml.deleteAtFirst();
						break;
					
					case 6 : 
						System.out.println("Enter Your Position");
						int pos1 = sc.nextInt();
						ml.deleteAtPosition(pos1);
						break;
					
					case 7 : 
						Structure.dataStructure();
					
					default : System.out.println("Invalid Choice");
					
				}
				
			}while(true);
	}
	
	public static void toDequeueDataStructure() throws Exception
	{
		System.out.println("**You Choose Queue Data Structure**");
		MyDequeueUsingLinkedList md = new MyDequeueUsingLinkedList();
		
			do
			{
				System.out.println("1. EnQueue");
				System.out.println("2. DeQueue");
				System.out.println("3. Back");
				System.out.println("@ Which Operation You Have To Perform : ");
				
				int ch = sc.nextInt();
				
				switch(ch)
				{
					case 1 :
						System.out.println("Enter Your Data");
						int data1 = sc.nextInt();
						md.enQueue(data1);
						break;
					
					case 2 : 
						md.deQueue();
						break;
					
					case 3 : 
						Structure.dataStructure();
					
					default : System.out.println("Invalid Choice");
					
				}
				
			}while(true);
	}
	
	public static void toStackDataStructure() throws Exception
	{
		System.out.println("**You Choose Stack Data Structure**");
		MyStack ms = new MyStack();
		
			do
			{
				System.out.println("1. Push");
				System.out.println("2. Pop");
				System.out.println("3. Peak");
				System.out.println("@ Which Operation You Have To Perform : ");
				
				int ch = sc.nextInt();
				
				switch(ch)
				{
					case 1 :
						System.out.println("Enter Your Data");
						int data2 = sc.nextInt();
						ms.push(data2);
						break;
					
					case 2 : 
						ms.pop();
						break;
					
					case 3 : 
						ms.peak();
						break;
					
					case 4 : 
						Structure.dataStructure();
					
					default : System.out.println("Invalid Choice");
				}
				
			}while(true);
	}
}
