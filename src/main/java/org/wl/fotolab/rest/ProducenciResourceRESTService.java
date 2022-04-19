package org.wl.fotolab.rest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.wl.fotolab.data.DataProducer;
import org.wl.fotolab.model.entity.ProducentEntity;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/producenci")
@RequestScoped
public class ProducenciResourceRESTService {
    @Inject
    private Logger log;

    @Inject
    DataProducer dataProducer;

    @Inject
    private EntityManager em;


    @GET
    @Produces("text/json")
    public String getAllProducent(){
        log.info("===  getAllProducent ===");

        List<ProducentEntity> list = dataProducer.getProducenci();

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";
        try {
            jsonString = mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

}
