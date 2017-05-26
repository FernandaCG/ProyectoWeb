package com.ipn.conexion;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ConexionDatos {

    HashMap<String, String> mapaUsuarios = new HashMap();

    public HashMap<String, String> LoginBean(String ruta) {
        try {
            SAXBuilder builder = new SAXBuilder();
            File archivoXML = new File(ruta + "archivoXML.xml");
            Document documento = builder.build(archivoXML);
            Element raiz = documento.getRootElement();
        
            List hUsuario = raiz.getChildren("usuario");
//            System.out.println(raiz);
//            System.out.println(hUsuario);
            for (int i = 0; i < hUsuario.size(); i++) {
                Element elemento = (Element) hUsuario.get(i);
                String cadena = elemento.getAttributeValue("nombre");
                String pass = elemento.getAttributeValue("password");
                String rol = elemento.getAttributeValue("rol");
//                System.out.println(cadena + " " + pass + " " + rol);
                mapaUsuarios.put(cadena, pass);
            }
            System.out.println("Mapa de usuarios "+ mapaUsuarios);
        } catch (JDOMException | IOException e) {
            e.getMessage();
        }
        return mapaUsuarios;
    }
    

}
