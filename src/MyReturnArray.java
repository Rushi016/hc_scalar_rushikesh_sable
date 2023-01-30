
public class MyReturnArray
{
	static int[] getArray()
	{
		return new int[] {10, 20, 30};
	}
	
	public static void main(String args[])
	{
		int arr[] = getArray();
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+"-->");
		}
		
		System.out.println("null");
	}
}
