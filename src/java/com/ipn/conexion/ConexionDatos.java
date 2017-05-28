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

    public Element Conectar(String ruta) throws JDOMException, IOException {

        SAXBuilder builder = new SAXBuilder();
        File archivoXML = new File(ruta + "archivoXML.xml");
        Document documento = builder.build(archivoXML);
        Element raiz = documento.getRootElement();
        return raiz;
    }

}
