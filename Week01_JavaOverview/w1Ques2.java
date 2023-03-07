import java.util.*;
import java.util.Scanner;
public class w1Ques2 {
	private static	Scanner scc=new Scanner(System.in);
	static void FindSecond(int arr[],int size)
	{
		int i;
		if (size<2)
		{
			System.out.print(" Invalid Input ");
			return;
		}
		Arrays.sort(arr);
		for (i=arr.length-2;i >= 0;i--)
		{ 
			if (arr[i]!=arr[size-1])
			{
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.print("There is no second largest element\n");
}
	public static void main(String[] args) {
		int n;
		n=scc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++)  
		{     
		arr1[i]=scc.nextInt(); 
		} 
		FindSecond(arr1, n);
	}
}
