import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// El path del servicio sera "/helloworld"
@Path("/helloworld")
public class HelloWorld {
    // El metodo sera de tipo GET
    @GET
    // El producto MIME sera un texto plano
    @Produces("text/plain")
    public String bienvenida() {
        // Lo que se le mostrará a la persona
        return "Hello World";
    }
}