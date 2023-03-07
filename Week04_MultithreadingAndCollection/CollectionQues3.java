package com.collection;

import java.util.Scanner;

public class CollectionQues3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array - ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int zero=0;
		System.out.println("Enter elements of array - ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0) {
				zero++;
			}
		}
		for(int i=0;i<zero;i++) {
			arr[i]=0;
		}
		for(int i=zero;i<n;i++) {
			arr[i]=1;
		}
		System.out.println("sorted list is- \n");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
