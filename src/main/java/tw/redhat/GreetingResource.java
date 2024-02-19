package tw.redhat;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @POST
    @Path("/json/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloWorldJSON(String name) {
        System.out.println("name: " + name);
        return "{\"result\":\"" + createHelloMessage(name) + "\"}";
    }

    @POST
    @Path("/xml/{name}")
    @Produces(MediaType.APPLICATION_XML)
    public String getHelloWorldXML(String name) {
        System.out.println("name: " + name);
        return "<xml><result>" + createHelloMessage(name) + "</result></xml>";
    }

    private String createHelloMessage(String name) {
        return "Hello " + name + "!";
    }
}
