package com.ipn.controlador;

import com.ipn.dao.UsuarioDAO;
import com.ipn.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Usuario usuario = new Usuario();
        String nombre = request.getParameter("nombre");
        String password = request.getParameter("password");
        System.out.println(nombre + " " + password);
        usuario.setPass(password);
        usuario.setNombreUsuario(nombre);
        System.out.println(usuario);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        // ->usuarioDAO.crearUsuario(usuario);
        validarUsuario(usuario);
    }
    
    public void validarUsuario(Usuario u){
        //Traer, de ConexionDatos cada uno de los nodos y compararlos.
        //sendredirect
    }
}
