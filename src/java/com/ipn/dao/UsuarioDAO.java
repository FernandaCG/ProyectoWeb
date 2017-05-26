package com.ipn.dao;

import com.ipn.conexion.ConexionDatos;
import com.ipn.modelo.Usuario;
import java.util.HashMap;

public class UsuarioDAO implements IUsuarioDAO {

    @Override
    public void crearUsuario(Usuario usuario) {
        System.out.println("Se ha creado el usuario" + usuario);
    }

    @Override
    public HashMap<String, String> consultarUsuarios() {
        ConexionDatos conexionDatos = new ConexionDatos();
        return conexionDatos.LoginBean("../ProyectoFinal/src/conf/");
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
