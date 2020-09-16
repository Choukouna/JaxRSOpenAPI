package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dao.kanban.UserDAO;
import fr.istic.taa.jaxrs.model.User;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/user")
@Produces({"application/json", "application/xml"})
public class UserResource {
    @GET
    @Path("/{userId}")
    public User getUserById(@PathParam("userId") Integer userId)  {
        // return pet
        return new UserDAO().findOne(userId);
    }

    @POST
    @Consumes("application/json")
    public Response addUser(
            @Parameter(description = "Ajout d'un utilisateur via rest", required = true) User user) {
        UserDAO daoUser = new UserDAO();
        daoUser.save(user);
        return Response.ok().entity("SUCCESS").build();
    }
}
