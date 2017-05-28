package com.ipn.util;

import com.ipn.conexion.ConexionDatos;
import com.ipn.dao.UsuarioDAO;
import com.ipn.modelo.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import org.jdom.Element;

public class Pruebas {

    public static void main(String[] args) {
        
        Usuario fernanda = new Usuario(1, "Fernanda", "admin", "pass", "fernanda.hell@gmail.com");
        Usuario cesar = new Usuario(2, "Cesar", "achichincle", "pass", "cesar.hell@gmail.com");
        //System.out.println(Fernanda);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        /*Mostrar todos los usuarios*/
       // mapUsuarios.putAll(usuarioDAO.consultarUsuarios());
       //HashMap<Integer, Usuario> mapUsuarios = usuarioDAO.consultarUsuarios();
       //System.out.println(usuarioDAO.consultarUsuarios());
       /*HashMap mapUsuarios = usuarioDAO.consultarUsuarios();
       System.out.println(mapUsuarios);
       //.out.println(mapUsuarios.get(1));
        for(int i=0; i<3; i++){
           Usuario u=(Usuario) mapUsuarios.get(i+1);
           System.out.println("GET:"+u.getIdUsuario() + " " + u.getNombreUsuario() + " " + u.getPass() + " " + u.getRol());
        }*/
        //usuarioDAO.crearUsuario(fernanda);
//        System.out.println(usuarioDAO.consultarUsuarios());
//        ConexionDatos conexionDatos = new ConexionDatos();
//        conexionDatos.LoginBean("C:/Users/campos04/Documents/NetBeansProjects/ProyectoFinal/src/conf/");
//        ArrayList<Usuario> usuariosList = new ArrayList();
//        usuariosList.add(fernanda);
//        usuariosList.add(cesar);
//        System.out.println(usuariosList);
//        System.out.println(usuariosList.get(0));
        //HashMap<Integer, Usuario> mapaUsuarios = new HashMap();
       // mapaUsuarios.put(1, fernanda);
//        mapaUsuarios.put(2, "fernanda");
//        mapaUsuarios.put(3, "calabacin");
        // System.out.println(mapaUsuarios.get(3));
       // Usuario u = mapaUsuarios.get(1);
       // System.out.println(u.getIdUsuario() + " " + u.getNombreUsuario() + " " + u.getPass() + " " + u.getRol());

       // System.out.println(usuarioDAO.consultarUsuarios());
       // usuarioDAO.consultarUsuarios();
       /*  VALIDAR USUARIO
       String rol="";
       rol=usuarioDAO.validarUsuario("Cesar", "pass");
       
        if(rol.equals("administrador")){
            System.out.println("Administrador: "+ rol); 
        }else{
            if(rol.equals("profesor")){
                System.out.println("Profesor: "+ rol); 
            }else
                System.out.println("fail"); 
      
        }*/
//        System.out.println(mapaUsuarios);
//        Stack pila = new Stack();
//        pila.push(fernanda);
//        pila.push(cesar);
//        System.out.println(pila);
//        pila.pop();
//        System.out.println(pila);
//        pila.pop();
//        System.out.println(pila);
    }
}
