import java.util.Scanner;

public class Tester
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Choice : ");
		System.out.println("1. Insert At Last");
		System.out.println("2. Insert At First");
		System.out.println("3. Insert At Position");
		System.out.println("4. Delete At Last");
		System.out.println("5. Count");
		System.out.println("6. Delete At First");
		System.out.println("7. Delete At Position");
		System.out.println("10. Display LinkedList");
		System.out.println("8. Push");
		System.out.println("9. Pop");
		System.out.println("11. Peak");
		System.out.println("12. Stack Size");
		
		//MyLinkedList ml =new MyLinkedList();
		MyCircularSinglyLinkedList ml = new MyCircularSinglyLinkedList();
		//MyStack ml = new MyStack();
		int choice = sc.nextInt();
		do
		{
			switch(choice)
			{
				case 1 : 
					System.out.println("Please Enter Data");
					int data1 = sc.nextInt();
					ml.insertAtLast(data1);
					break;
					
				case 2 : 
					System.out.println("Please Enter Data");
					int data2 = sc.nextInt();
					ml.insertAtFirst(data2);
					break;
					
				case 3 : 
					System.out.println("Please Enter Data & Position");
					int data3 = sc.nextInt();
					int pos1 = sc.nextInt();
					ml.insertAtPosition(data3, pos1);
					break;
					
				case 4 :
					ml.deleteAtLast();
					break;
					
				case 6 : 
					ml.deleteAtFirst();
					break;
					
				case 7 : 
					System.out.println("Please Enter Your Position");
					int pos2 = sc.nextInt();
					ml.deleteAtPosition(pos2);
					break;
					
				case 5 :
					System.out.println(ml.getCount());
					break;
					
				/*case 8 : 
					System.out.println("Please Enter Your Data");
					int data = sc.nextInt();
					ml.push(data);
					break;
					
				case 9 : 
					ml.pop();
					break;
					
				case 11 : 
					ml.peak();
					break;
					
				case 12 : 
					int size = ml.getSize();
					System.out.println("Stack Size = "+size);
					break;*/
					
				case 10 : 
					ml.display();
					break;
					
				default : 
					System.out.println("Invalid Choice Please Try Again");
					break;
			}
			
			System.out.println("Choice");
			choice = sc.nextInt();
			
		}while(choice!=0);
	}
}
