import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchRepeatedNumbers
{
	static Scanner sc = new Scanner(System.in);
	static int count = 1;
	
	public static int linearSearchRepeatedNumbers(int arr[], int num)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(num == arr[i])
			{
				count++;
				return i;
			}
			continue;
		}
		
		return count;
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
		
		int count = linearSearchRepeatedNumbers(arr, key);
		System.out.println("Count : "+count);
		
		int index = linearSearchRepeatedNumbers(arr, key);
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
