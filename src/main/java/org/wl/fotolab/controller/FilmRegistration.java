package org.wl.fotolab.controller;


import org.wl.fotolab.data.DataProducer;
import org.wl.fotolab.model.entity.FilmyEntity;
import org.wl.fotolab.model.entity.ProducentEntity;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.logging.Logger;

@Stateful
@Model
public class FilmRegistration {

    @Inject
    private Logger log;

    @Inject
    EntityManager entityManager;

    @Inject
    DataProducer dataProducer;

    @Inject
    private Event<FilmyEntity> filmyEntityEvent;

    private FilmyEntity film;


    private Object selectedOption;
    public Object getSelectedOption() {
        return selectedOption;
    }
    public void setSelectedOption(Object selectedOption) {
        this.selectedOption = selectedOption;
    }

    private String asa;

    @Produces
    @Named
    public String getAsa() {
        return asa;
    }

    public void setAsa(String asa) {
        this.asa = asa;
    }

    private String typ;

    @Produces
    @Named
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Produces
    @Named
    public FilmyEntity getFilm() {
        return film;
    }


    public void register() throws Exception {
        log.info("registering film " + film.getTyp());
        log.info("selected option - wybrany producent:  " + selectedOption.toString() + "   " + selectedOption.getClass());

        film.setNominalAsa(asa);
        film.setTyp(typ);
        for (ProducentEntity p : dataProducer.getProducenci()
        ) {
            int id = Integer.parseInt(selectedOption.toString());
            if (p.getId() == id) {
                film.setProducentByProducent(p);
                log.info(" nazwa producenta  = " + film.getProducentByProducent().getNazwa());
            }
        }
        entityManager.persist(film);
        filmyEntityEvent.fire(film);
        initFilm();
        dataProducer.refreshFilmy();

    }


    @PostConstruct
    private void initFilm() {
        film = new FilmyEntity();
    }


}
