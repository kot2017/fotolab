package org.wl.fotolab.soap.producent;


import org.wl.fotolab.model.entity.FilmyEntity;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "org.wl.fotolab.soap.producent.ProducentInfo",
        targetNamespace = "http://producent.fotolab.ns/",
        name = "ProducentInfo",
        serviceName = "ProducentInfoService",
        portName = "ProducentInfoPort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class ProducentInfoImpl  implements ProducentInfo {


    @Override
    public String info(String name) {
        System.out.println(name);
        return "info " + name;
    }

    @Override
    public Producent fullInfo(Integer id) {
        System.out.println(id);
        Producent p = new Producent();
        p.setId(id);
        p.setNazwa("nazwa-"+id);
        List<FilmyEntity> filmy = new ArrayList<FilmyEntity>();
        FilmyEntity f1 = new FilmyEntity();
        f1.setTyp("EXR100T");
        filmy.add(f1);
        FilmyEntity f2 = new FilmyEntity();
        f2.setTyp("EXR50D");
        filmy.add(f2);
        p.setFilmy(filmy);
        return p;
    }
}
