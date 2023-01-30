import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch
{
	static Scanner sc = new Scanner(System.in);
	
	public static int linearSearch(int arr[], int x)
	{
		int N = arr.length;
		
		for(int i = 0; i<N; i++)
		{
			if(arr[i] == x)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Please Enter Your Data");
		
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Given Array Is : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the number which you want to search in Array");
		int num = sc.nextInt();
		
		int result = linearSearch(arr, num);
		
		if(result == -1)
		{
			System.out.println("Number is not present in Array");
		}
		else
		{
			System.out.println("Number found at index : "+result);
		}
	}
}

//Output :
//Enter Size of Array
//10
//Please Enter Your Data
//10
//20
//30
//40
//50
//60
//70
//80
//90
//100
//The Given Array Is : 
//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
//Enter the number which you want to search in Array
//11
//Number is not present in Array


//Output : 
//Enter Size of Array
//10
//Please Enter Your Data
//11
//22
//33
//44
//55
//66
//77
//88
//99
//110
//The Given Array Is : 
//[11, 22, 33, 44, 55, 66, 77, 88, 99, 110]
//Enter the number which you want to search in Array
//55
//Number found at index : 4

