package socialNetwork;

public class TextPost extends Post{
	
	private String message;

	public TextPost(String publisher, String title, int numOfLikes, String message) {
		super(publisher, title, numOfLikes);
		this.message =  message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
