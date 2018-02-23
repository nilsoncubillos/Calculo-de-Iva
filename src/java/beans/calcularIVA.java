/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ncubillos
 */
@Path("calcularIVA")
public class calcularIVA {

    @Context
    private UriInfo context;

    @EJB
    Calcular calcular;
    
    public calcularIVA() {
    }
    @GET
    @Produces("text/html")
    public String getHtml() {
        return "";
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
  
    
    public String calcularPrecioIva(@FormParam("Precio") double r) {
        
        return "<h4> Total: " + calcular.CalcularIva(r)+"</h4>";

    }
}
