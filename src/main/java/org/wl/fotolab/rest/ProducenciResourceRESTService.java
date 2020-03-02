package org.wl.fotolab.rest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.wl.fotolab.data.DataProducer;
import org.wl.fotolab.model.entity.ProducentEntity;

import java.util.List;

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

//    @Inject
//    ProducenciListProducer producenciListProducer;

    @Inject
    DataProducer dataProducer;

    @Inject
    private EntityManager em;

//    // The Java method will process HTTP GET requests
//    @GET
//    // The Java method will produce content identified by the MIME Media type "text/plain"
//    @Produces("text/plain")
//    public String getClichedMessage() {
//        // Return some cliched textual content
//        return "producenci ";
//    }



    @GET
@Produces("text/json")
    public String getAllProducent(){
        System.out.println("===  getAllProducent ===");

        List<ProducentEntity> list = dataProducer.getProducenci();// producenciListProducer.retrieveAllProducent();

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
