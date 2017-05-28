package com.ipn.controlador;

import com.ipn.dao.UsuarioDAO;
import com.ipn.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mostrar extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        HashMap mapUsuarios = usuarioDAO.consultarUsuarios();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Usuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Usuarios</h1>");
            
            out.println("<table id='tablaUsuarios' border='1'>\n"
                    + "    <tr>\n"
                    + "        <th>ID Usuario</th>\n"
                    + "        <th>Usuario</th>\n"
                    + "        <th>Correo</th>\n"
                    + "        <th>Rol</th>\n"
                    + "        <th>Modificar</th>\n"
                    + "        <th>Eliminar</th>\n"
                    + "    </tr>");
            for (int i = 0; i < mapUsuarios.size(); i++) {
                Usuario u=(Usuario) mapUsuarios.get(i+1);
                int id = u.getIdUsuario();
                String nombre = u.getNombreUsuario();
                String correo = u.getCorreo();
                String rol = u.getRol();
                
                out.println("<tr>");
                out.println("<td><input type='text' name='id' value='" + id + "'/></td>");
                out.println("<td>" + nombre + "</td>");
                out.println("<td>" + correo + "</td>");
                out.println("<td>" + rol + "</td>");
                out.println("<td><a href='Modificar'>Modificar</a></td>");
                out.println("<td><a href='Eliminar'>Eliminar</a></td>");
                out.println("</tr>");
            
            }
            out.println("</table>\n");
            out.println("</body>");
            out.println("</html>");
    }

}