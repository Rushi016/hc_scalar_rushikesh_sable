import java.util.Scanner;
import java.util.Arrays;

class MyArray
{
	private static int b[];
	private static int size;
	private static Scanner sc = new Scanner(System.in);
	
	public static int getSize()
	{
		return size;
	}
	

	public void findMin(int a[])
	{
		System.out.println();
		System.out.print("The Minimum Value of Array Is : ");
		
		int min;
		min = a[0];
		for(int i = 0; i<a.length-1; i++)
		{
			if(min>a[i])
			{
				int temp = min;
				min = a[i];
				a[i] = temp;
			}
		}
		
		System.out.println(min);
	}
	
	public void findMax(int a[])
	{
		System.out.println();
		System.out.print("The Maximum Value of Array Is : ");
		
		int max;
		max = a[0];
		for(int i = 0; i<a.length-1; i++)
		{
			if(max<a[i])
			{
				int temp = max;
				max = a[i];
				a[i] = temp;
			}
		}
		
		System.out.println(max);
	}
	
	public void deleteAtPositionShift(int a[])
	{
		System.out.println();
		System.out.println("Delete At Position By Shifting Element");
		System.out.println("Enter Your Position");
		int pos = sc.nextInt();
		
		for(int i = pos-1; i<a.length-1; i++)
		{
			a[pos-1] = a[i+1];
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	public void insertAtPositionShift(int a[])
	{
		System.out.println();
		System.out.println("Insert At Position By Shifting Element");
		System.out.println("Enter Your Position");
		int pos = sc.nextInt();
		System.out.println("Enter Element");
		int element = sc.nextInt();
		
		for(int i = a.length-1; i>pos-1; i--)
		{
			a[i] = a[i-1];
		}
		
		a[pos-1] = element;
		
		System.out.println(Arrays.toString(a));
	}
	
	public void deleteAtPosition(int a[], int size)
	{
		b = new int[size-1];
		
		System.out.println();
		System.out.println("Delete At Position");
		System.out.println("Enter Index");
		int m = sc.nextInt();
		
		for(int i = 0; i<size; i++)
		{
			if(i<m)
			{
				b[i] = a[i];
			}
			else if(i == m)
			{	
				continue;
			}
			else
			{
				b[i-1] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));
	}
	
	public void insertAtPosition(int a[], int size)
	{
		b = new int[size+1];
		
		System.out.println("Insert At Position");
		System.out.println("Enter Index");
		int m = sc.nextInt();
		System.out.println("Enter Value");
		int value = sc.nextInt();
		
		int i = 0;
		while(i<size+1)
		{
			if(i<m)
			{
				b[i] = a[i];
			}
			else if(i == m)
			{
				b[i] = value;
			}
			else
			{
				b[i] = a[i-1];
			}
			
			i++;
		}
		
		System.out.println(Arrays.toString(b));
	}
	
		/*public void isFull(int a[])
		{
			
			
				int b[] = new int[size*2];
				
				for(int i = 0; i<b.length; i++)
				{
					b[i] = sc.nextInt();
				}
				
				a = b;
		}*/
	
	public void createArray(int a[])
	{
		System.out.println();
		System.out.println("Create An Array");
		System.out.println("Please Enter Your Data");
		/*if(size==a.length)
		{
			isFull(a);
		}*/
		for(int i = 0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		//isFull(a);
		System.out.println(Arrays.toString(a));
	}
	
	public void bubbleSortArray(int a[])
	{
		System.out.println();
		System.out.println("Bubble Sorted Array");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<i; j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}