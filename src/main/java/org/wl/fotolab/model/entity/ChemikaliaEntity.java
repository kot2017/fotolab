package org.wl.fotolab.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "chemikalia", schema = "foto", catalog = "")
public class ChemikaliaEntity {
    private int id;
    private String nazwa;
    private Date dataProdukcji;
    private String expDate;
    private String sklad;
    private String uwagi;
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
    @Column(name = "data_produkcji")
    public Date getDataProdukcji() {
        return dataProdukcji;
    }

    public void setDataProdukcji(Date dataProdukcji) {
        this.dataProdukcji = dataProdukcji;
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
    @Column(name = "sklad")
    public String getSklad() {
        return sklad;
    }

    public void setSklad(String sklad) {
        this.sklad = sklad;
    }

    @Basic
    @Column(name = "uwagi")
    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChemikaliaEntity that = (ChemikaliaEntity) o;

        if (id != that.id) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (dataProdukcji != null ? !dataProdukcji.equals(that.dataProdukcji) : that.dataProdukcji != null)
            return false;
        if (expDate != null ? !expDate.equals(that.expDate) : that.expDate != null) return false;
        if (sklad != null ? !sklad.equals(that.sklad) : that.sklad != null) return false;
        if (uwagi != null ? !uwagi.equals(that.uwagi) : that.uwagi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (dataProdukcji != null ? dataProdukcji.hashCode() : 0);
        result = 31 * result + (expDate != null ? expDate.hashCode() : 0);
        result = 31 * result + (sklad != null ? sklad.hashCode() : 0);
        result = 31 * result + (uwagi != null ? uwagi.hashCode() : 0);
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

    @OneToMany(mappedBy = "chemikaliaByChemikalia")
    public Collection<HistoriaEntity> getHistoriasById() {
        return historiasById;
    }

    public void setHistoriasById(Collection<HistoriaEntity> historiasById) {
        this.historiasById = historiasById;
    }

    @OneToMany(mappedBy = "chemikaliaByChemikalia")
    public Collection<WywolaniaEntity> getWywolaniasById() {
        return wywolaniasById;
    }

    public void setWywolaniasById(Collection<WywolaniaEntity> wywolaniasById) {
        this.wywolaniasById = wywolaniasById;
    }
}
