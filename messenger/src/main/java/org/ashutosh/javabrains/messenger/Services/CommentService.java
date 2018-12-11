package org.ashutosh.javabrains.messenger.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ashutosh.javabrains.messenger.Database.Database;

import model.comments;
import model.message;

public class CommentService {
	private Map<Integer,message> messages=Database.getmessages();
	public comments addcomment(int messageId,comments c) {
		
		message m=messages.get(messageId);
		Map<Integer,comments> commentsmap=m.getCommentsmap();
		c.setId(commentsmap.size()+1);
		return commentsmap.put(c.getId(), c);
	}
	public comments getComments(int commentId,int messageId) {
		message m=messages.get(messageId);
		return m.getCommentsmap().get(commentId);
	}
	public List<comments> getAllComments(int messageId) {
		message m=Database.getmessages().get(messageId);
		Map<Integer,comments> allcomments=m.getCommentsmap();
		return new ArrayList<comments>(allcomments.values());
	}
}
