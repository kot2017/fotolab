package org.wl.fotolab.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "wyniki", schema = "foto", catalog = "")
public class WynikiEntity {
    private int id;
    private String plik;
    private String opis;
    private WywolaniaEntity wywolaniaByWywolanie;

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
    @Column(name = "plik")
    public String getPlik() {
        return plik;
    }

    public void setPlik(String plik) {
        this.plik = plik;
    }

    @Basic
    @Column(name = "opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WynikiEntity that = (WynikiEntity) o;

        if (id != that.id) return false;
        if (plik != null ? !plik.equals(that.plik) : that.plik != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (plik != null ? plik.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "wywolanie", referencedColumnName = "ID", nullable = false)
    public WywolaniaEntity getWywolaniaByWywolanie() {
        return wywolaniaByWywolanie;
    }

    public void setWywolaniaByWywolanie(WywolaniaEntity wywolaniaByWywolanie) {
        this.wywolaniaByWywolanie = wywolaniaByWywolanie;
    }
}
