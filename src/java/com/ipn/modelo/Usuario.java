package com.ipn.modelo;

import java.io.Serializable;

public class Usuario implements Serializable {

    private Integer idUsuario;
    private String nombreUsuario;
    private String rol;
    private String pass;
    private String correo;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombreUsuario, String rol, String pass, String correo) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
        this.pass = pass;
        this.correo = correo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", rol=" + rol + ", pass=" + pass + ", correo=" + correo + '}';
    }

}
