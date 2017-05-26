package com.ipn.dao;

import com.ipn.conexion.ConexionDatos;
import com.ipn.modelo.Usuario;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.Element;
import org.jdom.JDOMException;

public class UsuarioDAO implements IUsuarioDAO {

    HashMap<String, String> mapaUsuarios = new HashMap();

    @Override
    public void crearUsuario(Usuario usuario) {
        System.out.println("Se ha creado el usuario" + usuario);
    }

    @Override
    public HashMap<String, String> consultarUsuarios() {
        ConexionDatos cd = new ConexionDatos();
        Element raiz;
        try {
            raiz = cd.Conectar("C:/Users/campos04/Documents/NetBeansProjects/ProyectoFinal/src/conf/");
            List hUsuario = raiz.getChildren("usuario");

            for (int i = 0; i < hUsuario.size(); i++) {
                Element elemento = (Element) hUsuario.get(i);
                String cadena = elemento.getAttributeValue("nombre");
                String pass = elemento.getAttributeValue("password");
                String rol = elemento.getAttributeValue("rol");
//                System.out.println(cadena + " " + pass + " " + rol);
                mapaUsuarios.put(cadena, pass);
            }
            System.out.println("Mapa de usuarios " + mapaUsuarios);

        } catch (JDOMException | IOException ex ) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mapaUsuarios;
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
