package com.ipn.dao;

import com.ipn.modelo.Usuario;
import java.util.HashMap;
import javax.servlet.http.HttpServletResponse;
import org.jdom.Element;

public interface IUsuarioDAO {

    public String  validarUsuario(String nombre, String passw);
    
    public void crearUsuario(Usuario usuario);

    public HashMap<Integer, Usuario> consultarUsuarios();

    public Usuario consultarUsuarioId(Integer idUsuario);

    public boolean modificarUsuario(Usuario usuario);

    public boolean borrarUsuario(Integer idUsuario);

}
