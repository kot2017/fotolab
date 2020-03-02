package org.wl.fotolab.model.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "producent", schema = "foto", catalog = "")
public class ProducentEntity {
    private int id;
    private String nazwa;
    private String opis;
    private String link;
    private Collection<AparatyEntity> aparatiesById;
    private Collection<ChemikaliaEntity> chemikaliasById;
    private Collection<FilmyEntity> filmiesById;
    private Collection<ObiektywyEntity> obiektywiesById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nazwa")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Basic
    @Column(name = "link")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProducentEntity that = (ProducentEntity) o;

        if (id != that.id) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "producentByProducent")
//    public Collection<AparatyEntity> getAparatiesById() {
//        return aparatiesById;
//    }
//
//    public void setAparatiesById(Collection<AparatyEntity> aparatiesById) {
//        this.aparatiesById = aparatiesById;
//    }
//
//    @OneToMany(mappedBy = "producentByProducent")
//    public Collection<ChemikaliaEntity> getChemikaliasById() {
//        return chemikaliasById;
//    }
//
//    public void setChemikaliasById(Collection<ChemikaliaEntity> chemikaliasById) {
//        this.chemikaliasById = chemikaliasById;
//    }
//
//    @OneToMany(mappedBy = "producentByProducent")
//    public Collection<FilmyEntity> getFilmiesById() {
//        return filmiesById;
//    }
//
//    public void setFilmiesById(Collection<FilmyEntity> filmiesById) {
//        this.filmiesById = filmiesById;
//    }
//
//    @OneToMany(mappedBy = "producentByProducent")
//    public Collection<ObiektywyEntity> getObiektywiesById() {
//        return obiektywiesById;
//    }
//
//    public void setObiektywiesById(Collection<ObiektywyEntity> obiektywiesById) {
//        this.obiektywiesById = obiektywiesById;
//    }
}
