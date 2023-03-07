package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Solution {
    boolean isValid(String s) {
    	Deque<Character> ss = new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
        	char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                ss.push(ch);
            }
            else if(ss.isEmpty()||(ch=='}'&&ss.peek()!='{') || (ch==')'&&ss.peek()!='(') || (ch==']'&&ss.peek()!='[')){
                return false;
            }
            else
            ss.pop();
        }
    return ss.isEmpty();
    }
};
public class CollectionQues4 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a string: ");  
		String str= sc.nextLine(); 
		Solution s1=new Solution();
		System.out.println(s1.isValid(str));
	}
}
