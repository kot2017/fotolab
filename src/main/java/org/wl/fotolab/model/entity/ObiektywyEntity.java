package org.wl.fotolab.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "obiektywy", schema = "foto", catalog = "")
public class ObiektywyEntity {
    private int id;
    private String nazwa;
    private String jasnosc;
    private Integer ogniskowa;
    private Integer srednica;
    private Date dataZakupu;
    private String zrodloZakupu;
    private String montowanie;
    private Integer column10;
    private Collection<HistoriaEntity> historiasById;
    private ProducentEntity producentByProducent;
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
    @Column(name = "jasnosc")
    public String getJasnosc() {
        return jasnosc;
    }

    public void setJasnosc(String jasnosc) {
        this.jasnosc = jasnosc;
    }

    @Basic
    @Column(name = "ogniskowa")
    public Integer getOgniskowa() {
        return ogniskowa;
    }

    public void setOgniskowa(Integer ogniskowa) {
        this.ogniskowa = ogniskowa;
    }

    @Basic
    @Column(name = "srednica")
    public Integer getSrednica() {
        return srednica;
    }

    public void setSrednica(Integer srednica) {
        this.srednica = srednica;
    }

    @Basic
    @Column(name = "data_zakupu")
    public Date getDataZakupu() {
        return dataZakupu;
    }

    public void setDataZakupu(Date dataZakupu) {
        this.dataZakupu = dataZakupu;
    }

    @Basic
    @Column(name = "zrodlo_zakupu")
    public String getZrodloZakupu() {
        return zrodloZakupu;
    }

    public void setZrodloZakupu(String zrodloZakupu) {
        this.zrodloZakupu = zrodloZakupu;
    }

    @Basic
    @Column(name = "montowanie")
    public String getMontowanie() {
        return montowanie;
    }

    public void setMontowanie(String montowanie) {
        this.montowanie = montowanie;
    }

    @Basic
    @Column(name = "column_10")
    public Integer getColumn10() {
        return column10;
    }

    public void setColumn10(Integer column10) {
        this.column10 = column10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObiektywyEntity that = (ObiektywyEntity) o;

        if (id != that.id) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (jasnosc != null ? !jasnosc.equals(that.jasnosc) : that.jasnosc != null) return false;
        if (ogniskowa != null ? !ogniskowa.equals(that.ogniskowa) : that.ogniskowa != null) return false;
        if (srednica != null ? !srednica.equals(that.srednica) : that.srednica != null) return false;
        if (dataZakupu != null ? !dataZakupu.equals(that.dataZakupu) : that.dataZakupu != null) return false;
        if (zrodloZakupu != null ? !zrodloZakupu.equals(that.zrodloZakupu) : that.zrodloZakupu != null) return false;
        if (montowanie != null ? !montowanie.equals(that.montowanie) : that.montowanie != null) return false;
        if (column10 != null ? !column10.equals(that.column10) : that.column10 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (jasnosc != null ? jasnosc.hashCode() : 0);
        result = 31 * result + (ogniskowa != null ? ogniskowa.hashCode() : 0);
        result = 31 * result + (srednica != null ? srednica.hashCode() : 0);
        result = 31 * result + (dataZakupu != null ? dataZakupu.hashCode() : 0);
        result = 31 * result + (zrodloZakupu != null ? zrodloZakupu.hashCode() : 0);
        result = 31 * result + (montowanie != null ? montowanie.hashCode() : 0);
        result = 31 * result + (column10 != null ? column10.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "obiektywyByObiektyw")
    public Collection<HistoriaEntity> getHistoriasById() {
        return historiasById;
    }

    public void setHistoriasById(Collection<HistoriaEntity> historiasById) {
        this.historiasById = historiasById;
    }

    @ManyToOne
    @JoinColumn(name = "producent", referencedColumnName = "ID")
    public ProducentEntity getProducentByProducent() {
        return producentByProducent;
    }

    public void setProducentByProducent(ProducentEntity producentByProducent) {
        this.producentByProducent = producentByProducent;
    }

    @OneToMany(mappedBy = "obiektywyByObiektywy")
    public Collection<WywolaniaEntity> getWywolaniasById() {
        return wywolaniasById;
    }

    public void setWywolaniasById(Collection<WywolaniaEntity> wywolaniasById) {
        this.wywolaniasById = wywolaniasById;
    }
}
