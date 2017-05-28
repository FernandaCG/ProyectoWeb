package com.ipn.controlador;

import com.ipn.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String nombre = request.getParameter("nombre");
        HttpSession sesion=request.getSession();
        sesion.setAttribute("user",nombre);
        String password = request.getParameter("password");
        String rol= " ";
        System.out.println(nombre + " " + password);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        rol = usuarioDAO.validarUsuario(nombre,password);
        
        if(rol.equals("Administrador")){
            response.sendRedirect("Administrador"); 
            System.out.println("Uusuario identificado como Administrador.");
        }else{
            if(rol.equals("Profesor")){
                response.sendRedirect("Profesor");
                System.out.println("Uusuario identificado como Profesor.");
            }else{
              System.out.println("Uusuario no encontrado.");
              response.sendRedirect("Fail");
            }
        }
    }
}
