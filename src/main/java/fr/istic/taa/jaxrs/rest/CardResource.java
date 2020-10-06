package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dao.kanban.CardDAO;
import fr.istic.taa.jaxrs.model.Card;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/card")
@Produces({"application/json", "application/xml"})
public class CardResource {
    @GET
    @Path("/{cardId}")
    public Card getCardById(@PathParam("cardId") Integer cardId)  {
        return new CardDAO().findOne(cardId);
    }

    @POST
    @Consumes("application/json")
    public Response addCard(
            @Parameter(description = "Card object that needs to be added to the store", required = true) Card carte) {
        new CardDAO().save(carte);
        return Response.ok().entity("SUCCESS").build();
    }
}
