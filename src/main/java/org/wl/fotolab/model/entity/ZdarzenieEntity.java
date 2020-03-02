package org.wl.fotolab.model.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "zdarzenie", schema = "foto", catalog = "")
public class ZdarzenieEntity {
    private int id;
    private String nazwa;
    private String opis;
    private Integer historia;
    private Collection<HistoriaEntity> historiasById;

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
    @Column(name = "historia")
    public Integer getHistoria() {
        return historia;
    }

    public void setHistoria(Integer historia) {
        this.historia = historia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZdarzenieEntity that = (ZdarzenieEntity) o;

        if (id != that.id) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;
        if (historia != null ? !historia.equals(that.historia) : that.historia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (historia != null ? historia.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "zdarzenieByZdarzenie")
    public Collection<HistoriaEntity> getHistoriasById() {
        return historiasById;
    }

    public void setHistoriasById(Collection<HistoriaEntity> historiasById) {
        this.historiasById = historiasById;
    }
}
