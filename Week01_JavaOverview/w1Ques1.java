import java.util.Scanner;
public class w1Ques1 {
private static	Scanner scc=new Scanner(System.in);
	private static void FindCommon(String[] arr1,String[] arr2){
		String[] common = new String[arr1.length];
		int k=0;
		for (int i = 0; i < arr1.length; i++){
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					common[k]=arr1[i];
					k++;
					break;
				}
			}
		}
		for (int i = 0; i < common.length; i++){
			if(common[i]!=null)
			System.out.println(common[i]);
			
		}
	}
public static void main(String[] args) {
	
	int n;
	int m;
	n=scc.nextInt();
	m=scc.nextInt();
	String[] arr1 = new String[n];
	String[] arr2 = new String[m];
	for(int i=0; i<n; i++)  
	{     
	arr1[i]=scc.next(); 
	} 
	for(int j=0; j<m; j++)  
	{    
	arr2[j]=scc.next();  
	} 
	FindCommon(arr1, arr2);
}
}
