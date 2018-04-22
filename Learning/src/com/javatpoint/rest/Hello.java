package com.javatpoint.rest;  
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  
@Path("/hello")  
public class Hello {  
  // This method is called if HTML is requested  
  @GET  
  @Produces(MediaType.TEXT_HTML)  
  public String sayHtmlHello() {  
    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
        + "<body><h1>" + "Hello Balaji HTML" + "</h1></body>" + "</html> ";  
  }
 
  @GET
  @Path("/bye") 
  public String byeMessage() {
	  return "Bye";
  }
}  