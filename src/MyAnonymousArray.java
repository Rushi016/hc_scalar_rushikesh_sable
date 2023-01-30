
public class MyAnonymousArray
{
	static void printArray(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"-->");
		}
		System.out.println("null");
	}
	
	public static void main(String args[])
	{
		MyAnonymousArray.printArray(new int[] {10, 20, 30});
	}
}
