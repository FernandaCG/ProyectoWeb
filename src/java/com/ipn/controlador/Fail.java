package com.ipn.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Fail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession();
        String user=(String)session.getAttribute("user");
	PrintWriter out=response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos Erroneos</h1>");
            out.println("<h2>Verifica los datos ingresados</h2>");
            out.println("<h3>Usuario "+user+" no encontrado o contraseña incorrecta.</h3>");
            out.println("<a href='login.html' ><button>Return</button></a>");            
            out.println("</body>");
            out.println("</html>");
    }
}
