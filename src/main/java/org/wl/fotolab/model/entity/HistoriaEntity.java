package org.wl.fotolab.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "historia", schema = "foto", catalog = "")
public class HistoriaEntity {
    private int idHistoria;
    private Timestamp data;
    private Integer aparat;
    private ZdarzenieEntity zdarzenieByZdarzenie;
    private ObiektywyEntity obiektywyByObiektyw;
    private ChemikaliaEntity chemikaliaByChemikalia;
    private FilmyEntity filmyByFilmy;
    private AparatyEntity aparatyById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_historia")
    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    @Basic
    @Column(name = "data")
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "aparat")
    public Integer getAparat() {
        return aparat;
    }

    public void setAparat(Integer aparat) {
        this.aparat = aparat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoriaEntity that = (HistoriaEntity) o;

        if (idHistoria != that.idHistoria) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (aparat != null ? !aparat.equals(that.aparat) : that.aparat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHistoria;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (aparat != null ? aparat.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "zdarzenie", referencedColumnName = "ID")
    public ZdarzenieEntity getZdarzenieByZdarzenie() {
        return zdarzenieByZdarzenie;
    }

    public void setZdarzenieByZdarzenie(ZdarzenieEntity zdarzenieByZdarzenie) {
        this.zdarzenieByZdarzenie = zdarzenieByZdarzenie;
    }

    @ManyToOne
    @JoinColumn(name = "obiektyw", referencedColumnName = "ID")
    public ObiektywyEntity getObiektywyByObiektyw() {
        return obiektywyByObiektyw;
    }

    public void setObiektywyByObiektyw(ObiektywyEntity obiektywyByObiektyw) {
        this.obiektywyByObiektyw = obiektywyByObiektyw;
    }

    @ManyToOne
    @JoinColumn(name = "chemikalia", referencedColumnName = "ID")
    public ChemikaliaEntity getChemikaliaByChemikalia() {
        return chemikaliaByChemikalia;
    }

    public void setChemikaliaByChemikalia(ChemikaliaEntity chemikaliaByChemikalia) {
        this.chemikaliaByChemikalia = chemikaliaByChemikalia;
    }

    @ManyToOne
    @JoinColumn(name = "filmy", referencedColumnName = "ID")
    public FilmyEntity getFilmyByFilmy() {
        return filmyByFilmy;
    }

    public void setFilmyByFilmy(FilmyEntity filmyByFilmy) {
        this.filmyByFilmy = filmyByFilmy;
    }

    @ManyToOne
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    public AparatyEntity getAparatyById() {
        return aparatyById;
    }

    public void setAparatyById(AparatyEntity aparatyById) {
        this.aparatyById = aparatyById;
    }
}
