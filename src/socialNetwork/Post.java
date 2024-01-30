package socialNetwork;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Post {
	
	private UUID id;
	private String publisher;
	private String title;
	private int numOfLikes;
	private ArrayList<Post> comments;
	
	
	public Post(String publisher, String title, int numOfLikes) {
		super();
		this.id = UUID.randomUUID();
		this.publisher = publisher;
		this.title = title;
		this.numOfLikes = numOfLikes;
		this.comments = new ArrayList<Post>();
	}
	public UUID getId() {
		return id;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumOfLikes() {
		return numOfLikes;
	}
	public void setNumOfLikes(int numOfLikes) {
		this.numOfLikes = numOfLikes;
	}
	public ArrayList<Post> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Post> comments) {
		this.comments = comments;
	}
	
	
	
	
}
