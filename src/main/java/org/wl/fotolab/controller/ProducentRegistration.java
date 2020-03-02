package org.wl.fotolab.controller;


import org.wl.fotolab.data.DataProducer;
import org.wl.fotolab.model.entity.ProducentEntity;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

@Stateful
@Model
public class ProducentRegistration {


    @Inject
    private Logger log;

    @Inject
    private EntityManager entityManager;

    @Inject
    DataProducer dataProducer;

    @Inject
    private Event<ProducentEntity> producentEntityEvent;

    private ProducentEntity producent;

    public void setProducent(ProducentEntity producent) {
        this.producent = producent;
    }


    public ProducentEntity getProducent(){
        return  producent;
    }


    public void register() throws Exception{
        log.info("Registering " + producent.getNazwa());
        entityManager.persist(producent);
        producentEntityEvent.fire(producent);
        initProducent();
        dataProducer.refreshPrtoducenci();
    }


    @PostConstruct
    private void initProducent(){
        producent = new ProducentEntity();

    }

}
