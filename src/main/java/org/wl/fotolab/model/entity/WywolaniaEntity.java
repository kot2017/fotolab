package org.wl.fotolab.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "wywolania", schema = "foto", catalog = "")
public class WywolaniaEntity {
    private int id;
    private Date data;
    private Integer asa;
    private String rozcienczenie;
    private String czasWolania;
    private String uwagi;
    private String katalog;
    private String rezultat;
    private String numerNegatywu;
    private Collection<WynikiEntity> wynikisById;
    private FilmyEntity filmyByFilmy;
    private ChemikaliaEntity chemikaliaByChemikalia;
    private ObiektywyEntity obiektywyByObiektywy;
    private AparatyEntity aparatyByAparaty;

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
    @Column(name = "data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "ASA")
    public Integer getAsa() {
        return asa;
    }

    public void setAsa(Integer asa) {
        this.asa = asa;
    }

    @Basic
    @Column(name = "rozcienczenie")
    public String getRozcienczenie() {
        return rozcienczenie;
    }

    public void setRozcienczenie(String rozcienczenie) {
        this.rozcienczenie = rozcienczenie;
    }

    @Basic
    @Column(name = "czas_wolania")
    public String getCzasWolania() {
        return czasWolania;
    }

    public void setCzasWolania(String czasWolania) {
        this.czasWolania = czasWolania;
    }

    @Basic
    @Column(name = "uwagi")
    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    @Basic
    @Column(name = "katalog")
    public String getKatalog() {
        return katalog;
    }

    public void setKatalog(String katalog) {
        this.katalog = katalog;
    }

    @Basic
    @Column(name = "rezultat")
    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

    @Basic
    @Column(name = "numer_negatywu")
    public String getNumerNegatywu() {
        return numerNegatywu;
    }

    public void setNumerNegatywu(String numerNegatywu) {
        this.numerNegatywu = numerNegatywu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WywolaniaEntity that = (WywolaniaEntity) o;

        if (id != that.id) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (asa != null ? !asa.equals(that.asa) : that.asa != null) return false;
        if (rozcienczenie != null ? !rozcienczenie.equals(that.rozcienczenie) : that.rozcienczenie != null)
            return false;
        if (czasWolania != null ? !czasWolania.equals(that.czasWolania) : that.czasWolania != null) return false;
        if (uwagi != null ? !uwagi.equals(that.uwagi) : that.uwagi != null) return false;
        if (katalog != null ? !katalog.equals(that.katalog) : that.katalog != null) return false;
        if (rezultat != null ? !rezultat.equals(that.rezultat) : that.rezultat != null) return false;
        if (numerNegatywu != null ? !numerNegatywu.equals(that.numerNegatywu) : that.numerNegatywu != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (asa != null ? asa.hashCode() : 0);
        result = 31 * result + (rozcienczenie != null ? rozcienczenie.hashCode() : 0);
        result = 31 * result + (czasWolania != null ? czasWolania.hashCode() : 0);
        result = 31 * result + (uwagi != null ? uwagi.hashCode() : 0);
        result = 31 * result + (katalog != null ? katalog.hashCode() : 0);
        result = 31 * result + (rezultat != null ? rezultat.hashCode() : 0);
        result = 31 * result + (numerNegatywu != null ? numerNegatywu.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "wywolaniaByWywolanie")
    public Collection<WynikiEntity> getWynikisById() {
        return wynikisById;
    }

    public void setWynikisById(Collection<WynikiEntity> wynikisById) {
        this.wynikisById = wynikisById;
    }

    @ManyToOne
    @JoinColumn(name = "filmy", referencedColumnName = "ID", nullable = false)
    public FilmyEntity getFilmyByFilmy() {
        return filmyByFilmy;
    }

    public void setFilmyByFilmy(FilmyEntity filmyByFilmy) {
        this.filmyByFilmy = filmyByFilmy;
    }

    @ManyToOne
    @JoinColumn(name = "chemikalia", referencedColumnName = "ID", nullable = false)
    public ChemikaliaEntity getChemikaliaByChemikalia() {
        return chemikaliaByChemikalia;
    }

    public void setChemikaliaByChemikalia(ChemikaliaEntity chemikaliaByChemikalia) {
        this.chemikaliaByChemikalia = chemikaliaByChemikalia;
    }

    @ManyToOne
    @JoinColumn(name = "obiektywy", referencedColumnName = "ID")
    public ObiektywyEntity getObiektywyByObiektywy() {
        return obiektywyByObiektywy;
    }

    public void setObiektywyByObiektywy(ObiektywyEntity obiektywyByObiektywy) {
        this.obiektywyByObiektywy = obiektywyByObiektywy;
    }

    @ManyToOne
    @JoinColumn(name = "aparaty", referencedColumnName = "ID")
    public AparatyEntity getAparatyByAparaty() {
        return aparatyByAparaty;
    }

    public void setAparatyByAparaty(AparatyEntity aparatyByAparaty) {
        this.aparatyByAparaty = aparatyByAparaty;
    }
}
