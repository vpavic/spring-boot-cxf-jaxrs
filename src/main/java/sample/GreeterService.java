package sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Path("/greet")
public class GreeterService {

	private static final Logger logger = LoggerFactory.getLogger(GreeterService.class);

	@GET
	@Path("/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String greet(@PathParam("name") String name) {
		logger.info("Greeting {}...", name);
		return "Hello " + name + "!";
	}

}
