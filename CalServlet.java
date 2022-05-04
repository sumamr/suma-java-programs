package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/CalServlet")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		double n1=Double.parseDouble(request.getParameter("num1"));
		double n2=Double.parseDouble(request.getParameter("num2"));
		double ans;
		
		PrintWriter out=response.getWriter();
		String bn=request.getParameter("operation");
		
		switch(bn)
		{
		case "Add": ans=n1+n2;
		             out.println("Sum of "+n1+" and "+n2+" is "+ans);
		             break;
		case "Sub":  ans=n1-n2;
		             out.println("Subtraction of "+n1+" and "+n2+" is "+ans);
		             break;
		case "Mul":  ans=n1*n2;
		              out.println("Multiplication of "+n1+"  and "+n2+" is "+ans);
		              break;
		case "Div" : 
			         if(n2==0)
			         {
			        	 out.println("Divide by zero error");
			         }
			         else
			         {
			        	 ans=n1/n2;
			        	 out.println("Quotient of "+n1+" and "+n2+" is "+ans);
			        	 break;
			         }
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
