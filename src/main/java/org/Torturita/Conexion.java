package org.Torturita;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mis_datos")
@Produces(MediaType.APPLICATION_JSON)
public abstract class Conexion {
    Persona a1 = new Persona("Alex","Vasquez",15,"Lima","2965","Javiera Prado Este",5);
    @GET
    public Persona Soyyo()
    {
        return this.a1;
    }
}