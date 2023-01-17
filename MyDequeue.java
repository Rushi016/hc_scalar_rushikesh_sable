import java.util.Scanner;

public class MyDequeue
{
	int f;
	int r;
	int n;
	Scanner sc;
	int q[] = new int[n];
	
	MyDequeue()
	{
		f=-1;
		r=-1;
		n=10;
		sc = new Scanner(System.in);
	}
	
	void enQueue(int data)
	{
		if(r==(n-1))
		{
			System.out.println("Queue Is Over Flow");
		}
		else
		{
			System.out.println("Enter Your Data");
			//int data1 = sc.nextInt();
			if(f==-1 && r==-1)
			{
				f=0;
				r=0;
				q[r]=data;
			}
			else
			{
				r = r+1;
				q[r] = data;
			}
		}
	}
	
	void deQueue()
	{
		if(f==-1 && r==-1)
		{
			System.out.println("Queue Is Under Flow");
		}
		else
		{
			f = f+1;
		}
	}
	
	void display()
	{
		for(int i=f; i<r; i++)
		{
			System.out.print(q[i]+"-->");
		}
	}

	public static void main(String[] args)
	{
		MyDequeue md = new MyDequeue();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Please Enter Your Choice");
		choice = sc.nextInt();
		
		do
		{
			switch(choice)
			{
			case 1 : 
				//int n = sc.nextInt();
				int data = sc.nextInt();
				md.enQueue(data);
				break;
				
			case 2 :
				md.deQueue();
				break;
				
			case 3 :
				md.display();
				break;
				
			default :
				System.out.println("Please enter valid choice");
				break;
			}
			
		}while(choice!=0);
	}
}
