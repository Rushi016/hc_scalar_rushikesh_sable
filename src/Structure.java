import java.util.Scanner;

public class Structure 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void dataStructure() throws Exception
	{
		
		System.out.println("******Welcome To Data Structure Using JAVA*******\n");
		System.out.println("@ Which Data Structure You Want");
		
		System.out.println("1. Array");
		System.out.println("2. LinkedList");
		System.out.println("3. Queue");
		System.out.println("4. Stack\n");
		
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		do
		{
			switch(choice)
			{
				case 1 :
					DataStructure.toArrayDataStructure();
					break;
					
				case 2 : 
					DataStructure.toLinkedListDataStructure();
					break;
					
				case 3 : 
					DataStructure.toDequeueDataStructure();
					break;
					
				case 4 :
					DataStructure.toStackDataStructure();
					break;
					
				default :
					System.out.println("Please Enter Valid Choice : ");	
			}
			
		}while(choice != 0);
	}
}
