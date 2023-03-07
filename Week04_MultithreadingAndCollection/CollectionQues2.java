package com.collection;

import java.util.Scanner;

class Stack{
	int stack[]=new int[5];
	int top=0;
	void push(int data) {
		if(top==5) {
			System.out.println("\nStack full\n");
		}else {
		stack[top]=data;
		top++;}
	}
	int pop() {
		int data=stack[top-1];
		stack[top-1]=0;
		top--;
		return data;
	}
	int peek() {
		int data=stack[top-1];
		return data;
	}
}

public class CollectionQues2 {
	public static void main(String args[]) {
		Stack s1=new Stack();
		int a;
		System.out.println("Enter Choice : 1.Push 2.Pop 3.Peek");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=0){
		switch(a) {
		case 1:
			System.out.println("Enter number to push- ");
			int data=sc.nextInt();
			s1.push(data);
			break;
		case 2:
			System.out.println("Element popped- ");
			System.out.println(s1.pop());
			break;
		case 3:
			System.out.println("Peak element is- ");
			System.out.println(s1.peek());
			break;
		}
		System.out.println("\nEnter Choice : 1.Push 2.Pop 3.Peek");
		a=sc.nextInt();
	}
	}
}
