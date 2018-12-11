package org.ashutosh.javabrains.messenger.Resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.ashutosh.javabrains.messenger.Services.messageService;

import model.message;
@Path("/messages")
public class MessageResource {
    messageService m=new messageService();
    
    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    @Path("/{messageId}")
    public message addMessage(@PathParam("messageId") int id,message m1) {
    	m1.setId(id);
    	return m.addMessage(m1);
        
    }
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{messageId}")
    public message update(@PathParam("messageId") int id, message m1) {
    	m1.setId(id);
    	return m.updateMessage(m1);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<message> getMessages(@QueryParam("year") int year,@QueryParam("start") int start,@QueryParam("size") int size){
    	if(year>0) {
    		return m.getAllMessageforYear(year);
    	}
    	if(start>0 && size>0) {
    		return m.paginatedmessages(start, size);
    	}
        return m.getAllmessages();
    }
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    public message getMessage(@PathParam("messageId") int id) {
    	return m.getMessage(id);
    }
    
    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    public message removeMessage(@PathParam("messageId") int id) {
    	return m.removeMessage(id);
    }
    
    @Path("/{messageId}/comments")
    public CommentResource getCommentResource() {
    	CommentResource cr=new CommentResource();
    	return cr;
    }
    
}
