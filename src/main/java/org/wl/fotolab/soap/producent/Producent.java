package org.wl.fotolab.soap.producent;

import org.wl.fotolab.model.entity.FilmyEntity;

import java.util.List;

public class Producent {

    private int id;
    private String nazwa;
    private String opis;
    private String link;

    private List<FilmyEntity> filmy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<FilmyEntity> getFilmy() {
        return filmy;
    }

    public void setFilmy(List<FilmyEntity> filmy) {
        this.filmy = filmy;
    }
}
