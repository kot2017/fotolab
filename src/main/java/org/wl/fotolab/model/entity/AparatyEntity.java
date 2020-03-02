package org.wl.fotolab.model.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "aparaty", schema = "foto", catalog = "")
public class AparatyEntity {
    private int id;
    private String nazwa;
    private String model;
    private String opis;
    private String numerSeryjny;
    private String numerInwentarzowy;
    private ProducentEntity producentByProducent;
    private Collection<HistoriaEntity> historiasById;
    private Collection<WywolaniaEntity> wywolaniasById;

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
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
    @Column(name = "numer_seryjny")
    public String getNumerSeryjny() {
        return numerSeryjny;
    }

    public void setNumerSeryjny(String numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }

    @Basic
    @Column(name = "numer_inwentarzowy")
    public String getNumerInwentarzowy() {
        return numerInwentarzowy;
    }

    public void setNumerInwentarzowy(String numerInwentarzowy) {
        this.numerInwentarzowy = numerInwentarzowy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AparatyEntity that = (AparatyEntity) o;

        if (id != that.id) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;
        if (numerSeryjny != null ? !numerSeryjny.equals(that.numerSeryjny) : that.numerSeryjny != null) return false;
        if (numerInwentarzowy != null ? !numerInwentarzowy.equals(that.numerInwentarzowy) : that.numerInwentarzowy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (numerSeryjny != null ? numerSeryjny.hashCode() : 0);
        result = 31 * result + (numerInwentarzowy != null ? numerInwentarzowy.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "producent", referencedColumnName = "ID")
    public ProducentEntity getProducentByProducent() {
        return producentByProducent;
    }

    public void setProducentByProducent(ProducentEntity producentByProducent) {
        this.producentByProducent = producentByProducent;
    }

    @OneToMany(mappedBy = "aparatyById")
    public Collection<HistoriaEntity> getHistoriasById() {
        return historiasById;
    }

    public void setHistoriasById(Collection<HistoriaEntity> historiasById) {
        this.historiasById = historiasById;
    }

    @OneToMany(mappedBy = "aparatyByAparaty")
    public Collection<WywolaniaEntity> getWywolaniasById() {
        return wywolaniasById;
    }

    public void setWywolaniasById(Collection<WywolaniaEntity> wywolaniasById) {
        this.wywolaniasById = wywolaniasById;
    }
}
