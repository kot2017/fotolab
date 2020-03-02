package org.wl.fotolab.model.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "filmy", schema = "foto", catalog = "")
public class FilmyEntity {
    private int id;
    private String nazwa;
    private String typ;
    private String nominalAsa;
    private String expDate;
    private String seria;
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
    @Column(name = "typ")
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Basic
    @Column(name = "nominal_asa")
    public String getNominalAsa() {
        return nominalAsa;
    }

    public void setNominalAsa(String nominalAsa) {
        this.nominalAsa = nominalAsa;
    }

    @Basic
    @Column(name = "exp_date")
    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Basic
    @Column(name = "seria")
    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilmyEntity that = (FilmyEntity) o;

        if (id != that.id) return false;
        if (typ != null ? !typ.equals(that.typ) : that.typ != null) return false;
        if (nominalAsa != null ? !nominalAsa.equals(that.nominalAsa) : that.nominalAsa != null) return false;
        if (expDate != null ? !expDate.equals(that.expDate) : that.expDate != null) return false;
        if (seria != null ? !seria.equals(that.seria) : that.seria != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (typ != null ? typ.hashCode() : 0);
        result = 31 * result + (nominalAsa != null ? nominalAsa.hashCode() : 0);
        result = 31 * result + (expDate != null ? expDate.hashCode() : 0);
        result = 31 * result + (seria != null ? seria.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "producent", referencedColumnName = "ID", nullable = false)
    public ProducentEntity getProducentByProducent() {
        return producentByProducent;
    }

    public void setProducentByProducent(ProducentEntity producentByProducent) {
        this.producentByProducent = producentByProducent;
    }

    @OneToMany(mappedBy = "filmyByFilmy")
    public Collection<HistoriaEntity> getHistoriasById() {
        return historiasById;
    }

    public void setHistoriasById(Collection<HistoriaEntity> historiasById) {
        this.historiasById = historiasById;
    }

    @OneToMany(mappedBy = "filmyByFilmy")
    public Collection<WywolaniaEntity> getWywolaniasById() {
        return wywolaniasById;
    }

    public void setWywolaniasById(Collection<WywolaniaEntity> wywolaniasById) {
        this.wywolaniasById = wywolaniasById;
    }
}
