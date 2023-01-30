import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchMoveToFront 
{
	static Scanner sc = new Scanner(System.in);
	static class Array
	{
		int a[];
		int length;
		int size;
		
		Array(int a[], int length, int size)
		{
			this.a = a;
			this.length = length;
			this.size = size;
		}
	}
	
	public static int linearSearchMoveToFront(Array arr, int key)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(key == arr.a[i])
			{
				if(i == 0)
				{
					return i;
				}
				else
				{
					int temp = arr.a[i];
					arr.a[i] = arr.a[0];
					arr.a[0] = temp;
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		System.out.println("Array Size");
		int size = sc.nextInt();
		System.out.println("Array Length");
		int length = sc.nextInt();
		int []a = new int[size];
		
		System.out.println("Enter Array Element");
		for(int i = 0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Before Move to Front");
		System.out.println(Arrays.toString(a));
	
		Array arr = new Array(a, length, size);
		
		System.out.println("Which number do you want");
		int key = sc.nextInt();
		
		int index = linearSearchMoveToFront(arr, key);
		if(index == -1)
		{
			System.out.println("The Given Number is not present in the Array");
		}
		else
		{
			System.out.println("Number found "+key+"at index "+index);
		}
		System.out.println("After Move to Front");
		
		System.out.println(Arrays.toString(a));
	}
}
