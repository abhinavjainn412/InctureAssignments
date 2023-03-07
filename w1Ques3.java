import java.util.Scanner;

public class w1Ques3 {
	private static	Scanner scc=new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		n=scc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++)  
		{     
		arr1[i]=scc.nextInt(); 
		} 
		for(int i=0;i<arr1.length;i++) {
			int sum=0;
			for(int j=i;j<arr1.length;j++) {
				sum=sum+arr1[j];
				if(sum==0) {
					for(int k=i;k<=j;k++) {
						System.out.print(arr1[k]+" ");
					}
					 System.out.print("\n");
				}
			}
		}
	}

}
