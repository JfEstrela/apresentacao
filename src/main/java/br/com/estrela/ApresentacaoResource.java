package br.com.estrela;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.estrela.repositoty.entity.Sorteio;
import br.com.estrela.service.SorteioService;

@Path("/apresentacao")
public class ApresentacaoResource {
    
    @Inject
    SorteioService service;

    @POST
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    @Path("/sorteio")
    public Response sortear() {
        this.service.sortear();
        return Response.ok().build();
    }
      
    @GET
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    @Path("/sorteios")
    public List<Sorteio> sorteios() {
        return service.findAll();
    }
}