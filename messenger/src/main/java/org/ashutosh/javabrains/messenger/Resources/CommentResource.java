package org.ashutosh.javabrains.messenger.Resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ashutosh.javabrains.messenger.Services.CommentService;
import org.ashutosh.javabrains.messenger.Services.messageService;

import model.comments;
import model.message;

@Path("/")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class CommentResource {
	CommentService cs=new CommentService();
	
	@POST
	public comments addComments(@PathParam("messageId") int messageId,comments cm) {
		return cs.addcomment(messageId, cm);
		
	}
	
	@GET
	@Path("/{commentId}")
	public comments getcomments(@PathParam("commentId") int commentId,@PathParam("messageId") int messageId) {
		return cs.getComments(commentId,messageId);
	}
	
	@GET
	public List<comments> getAllComments(@PathParam("messageId") int messageId) {
		return cs.getAllComments(messageId);
	}
	
}
