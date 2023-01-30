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
}
