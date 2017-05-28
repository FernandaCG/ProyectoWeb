package com.ipn.dao;

import com.ipn.conexion.ConexionDatos;
import com.ipn.modelo.Usuario;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.Element;
import org.jdom.JDOMException;
import javax.servlet.http.HttpServletResponse;

public class UsuarioDAO implements IUsuarioDAO {

    
    HashMap<Integer, Usuario> mapaUsuarios = new HashMap<Integer, Usuario>();
    ConexionDatos cd = new ConexionDatos();
    Element raiz;

    @Override
    public void crearUsuario(Usuario usuario) {
        System.out.println("Se ha creado el usuario" + usuario);
    }

    @Override
    public HashMap<Integer, Usuario> consultarUsuarios() {
        try {
            raiz = cd.Conectar("C:/Users/campos04/Documents/NetBeansProjects/ProyectoFinal/src/conf/");
        } catch (JDOMException | IOException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        List hUsuario = raiz.getChildren("usuario");
        for (int i = 0; i < hUsuario.size(); i++) {
             Usuario a = new Usuario();
            Element elemento = (Element) hUsuario.get(i);
            //System.out.println(elemento);
            String id1 = elemento.getAttributeValue("id");
            int id = Integer.parseInt(id1);
            String cadena = elemento.getAttributeValue("nombre");
            String pass = elemento.getAttributeValue("password");
            String rol = elemento.getAttributeValue("rol");
            String correo = elemento.getAttributeValue("correo");
            a.setIdUsuario(id);
            a.setNombreUsuario(cadena);
            a.setPass(pass);
            a.setRol(rol);
            a.setCorreo(correo);
           // System.out.println("ELEMENT:"+id1 + " " + cadena + " " + pass + " " + rol + " " + correo);
            //System.out.println("OBJETO: "+a);
            System.out.println("GET:"+a.getIdUsuario() + " " + a.getNombreUsuario() + " " + a.getPass() + " " + a.getRol());
            System.out.println("ID: "+id+"OBJETO: "+a);
            mapaUsuarios.put(id, a);
        }
        System.out.println("Mapa de usuarios " + mapaUsuarios);
        return mapaUsuarios; 
    }

    @Override
    public String validarUsuario(String nombre, String passw) {
        //Cómo acceder a al mapa desde el Servlet de Login-controlador para validar el usuario
        try {
            raiz = cd.Conectar("C:/Users/campos04/Documents/NetBeansProjects/ProyectoFinal/src/conf/");
        } catch (JDOMException | IOException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        List hUsuario = raiz.getChildren("usuario");
        String rol = " ";
        for (int i = 0; i < hUsuario.size(); i++) {
            rol = " ";
            Element elemento = (Element) hUsuario.get(i);
            System.out.println(elemento);
            String cadena = elemento.getAttributeValue("nombre");
            String pass = elemento.getAttributeValue("password");
           // System.out.println(cadena + " " + pass);
          //mapaUsuarios.put(cadena, pass);
            
            if(nombre.equals(cadena) && passw.equals(pass)){
               System.out.println(cadena + " " + pass + " "+ rol); 
               rol = elemento.getAttributeValue("rol");
               break;
            }else
                rol="fail";
       // System.out.println("Mapa de usuarios " + mapaUsuarios);
        }
        return rol;
    }

    @Override
    public Usuario consultarUsuarioId(Integer idUsuario) {
        throw new UnsupportedOperationException("Not supported yet.");
        //ConexionDatos conexionDatos = new ConexionDatos();
        //Regresar sólo un usuario, mandar el id del usuario a la conexión, y solo enviar el que corresponde al id.
    }

    @Override
    public boolean modificarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarUsuario(Integer idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Modificar Servlet de ConexionDatos, para sólo consultar el arbol.
    }

}
