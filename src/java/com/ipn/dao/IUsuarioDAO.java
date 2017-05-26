package com.ipn.dao;

import com.ipn.modelo.Usuario;
import java.util.HashMap;

public interface IUsuarioDAO {

    public void crearUsuario(Usuario usuario);

    public HashMap<String, String> consultarUsuarios();

    public Usuario consultarUsuarioId(Integer idUsuario);

    public boolean modificarUsuario(Usuario usuario);

    public boolean borrarUsuario(Integer idUsuario);

}
