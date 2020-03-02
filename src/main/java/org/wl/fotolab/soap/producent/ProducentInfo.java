package org.wl.fotolab.soap.producent;


import javax.jws.WebService;

@WebService(targetNamespace = "http://producent.fotolab.ns/")
public interface ProducentInfo {

    String info(String name);

    Producent fullInfo(Integer id);


}
