package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reach> getIt() {
		List<Reach> result = null;
		
		//Without Mybatis
//		result = new ArrayList<Reach>();
//		result.add(new Reach());
		
		//With Mybatis
		try {
			result = new ReachDAO().getReaches("BIBE");
		} catch (Exception e) {
			// nothin
		}
		
        return result;
    }
}
