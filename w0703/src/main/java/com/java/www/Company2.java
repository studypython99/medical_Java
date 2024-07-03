package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;


@WebServlet("/cp2")
public class Company2 extends HttpServlet {



	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
    	request.setCharacterEncoding("utf-8");// post방식 한글처리

    	String stuNo = request.getParameter("stuNo");
    	String name = request.getParameter("name");
    	int kor = Integer.parseInt(request.getParameter("kor"));
    	int eng = Integer.parseInt(request.getParameter("eng"));
    	int math = Integer.parseInt(request.getParameter("math"));
    	int total = kor+eng+math;
    	double avg = total/3.0;
    	
    	System.out.println("학번: "+stuNo);
    	System.out.println("이름: "+name);
    	System.out.println("국어: "+kor);
    	System.out.println("영어: "+eng);
    	System.out.println("수학: "+math);
    	System.out.println("합계: "+total);
    	System.out.println("평균: "+avg);
	
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doGet(request, response);
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doGet(request, response);
	}

}
