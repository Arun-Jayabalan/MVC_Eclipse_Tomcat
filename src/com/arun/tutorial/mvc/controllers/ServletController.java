package com.arun.tutorial.mvc.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arun.tutorial.mvc.model.PersonModel;


@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getServletContext().getRequestDispatcher("/jspIntial.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonModel person = new PersonModel();
		String name = request.getParameter("name");
		person.setName(name);
		String mail = request.getParameter("mail");
		person.setMail(mail);
		person.doSomething();
		
		request.setAttribute("person", person);
		
		request.getServletContext().getRequestDispatcher("/jspView.jsp").forward(request, response);
	}
	

}
