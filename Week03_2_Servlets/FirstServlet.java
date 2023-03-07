package com.abhinav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		String op=(String)req.getParameter("operation");
		int k=0;
		if(op.equals("Addition") ){
		k=i+j;
		}
		else if(op.equals("Subtraction")) {
		k=i-j;
		}
		else if(op.equals("Multiplication")){
		k=i*j;
		}
		else if(op.equals("Division")){
		k=i/j;
		}
		PrintWriter out=res.getWriter();
		out.println(op+ " is : " +k);
		// res.getWriter.println("result is : "+k);
	}

}
