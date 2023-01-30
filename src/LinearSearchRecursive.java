import java.util.Arrays;
import java.util.Scanner;

class LinearSearchRecursive
{
	static Scanner sc = new Scanner(System.in);
	
	public static int linearSearch(int arr[], int size, int key)
	{ 
		if(size == 0)
		{
			return -1;
		}
		else if(arr[size-1] == key)
		{
			return size-1;
		}
		else
		{
			return linearSearch(arr, size-1, key);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Insert Data Into Array");
		
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Given Array Is : ");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the number which you want to search in Array");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, size, key);
		if(index == -1)
		{
			System.out.println("Number is not present in the given array");
		}
		else
		{
			System.out.println("The Number "+key+"is found at Index "+index);
		}
	}
}