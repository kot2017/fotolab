package org.wl.fotolab.data;


import org.wl.fotolab.model.entity.ChemikaliaEntity;
import org.wl.fotolab.model.entity.FilmyEntity;
import org.wl.fotolab.model.entity.ProducentEntity;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@SessionScoped
@Model
public class DataProducer {
    
    @Inject
    EntityManager entityManager;
    
    private List<ProducentEntity> producenci;
    
    private List<FilmyEntity>  filmy;
    
    private List<ChemikaliaEntity> chemikalia;

    @Produces
    public List<ProducentEntity> getProducenci() {
        return producenci;
    }

    @Produces
    public List<FilmyEntity> getFilmy() {
        return filmy;
    }

    @Produces
    public List<ChemikaliaEntity> getChemikalia() {
        return chemikalia;
    }


    @PostConstruct
    public void init(){
        producenci = readProducentList();
        filmy = readFilmyList();
        chemikalia = readChemikaliaList();
    }

    public void refreshPrtoducenci(){
        this.producenci = readProducentList();
    }

    public void refreshFilmy(){
        this.filmy = readFilmyList();
    }
    
    private List<ProducentEntity> readProducentList(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ProducentEntity> criteria = cb.createQuery(ProducentEntity.class);
        Root<ProducentEntity> producent = criteria.from(ProducentEntity.class);
        criteria.select(producent).orderBy(cb.asc(producent.get("nazwa")));
        List<ProducentEntity> producenciList = entityManager.createQuery(criteria).getResultList();
        return producenciList;
    }

    private List<FilmyEntity> readFilmyList(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<FilmyEntity> criteria = cb.createQuery(FilmyEntity.class);
        Root<FilmyEntity> root = criteria.from(FilmyEntity.class);
        criteria.select(root).orderBy(cb.asc(root.get("nazwa")));
        List<FilmyEntity> filmyList = entityManager.createQuery(criteria).getResultList();
        return filmyList;
    }


    private List<ChemikaliaEntity> readChemikaliaList(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<ChemikaliaEntity> criteria = cb.createQuery(ChemikaliaEntity.class);
        Root<ChemikaliaEntity> root = criteria.from(ChemikaliaEntity.class);
        criteria.select(root).orderBy(cb.asc(root.get("nazwa")));
        List<ChemikaliaEntity> chemikaliaList = entityManager.createQuery(criteria).getResultList();
        return chemikaliaList ;
    }
    
    
}
