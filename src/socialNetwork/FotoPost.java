package socialNetwork;

public class FotoPost extends Post{

	private String linkToPicture;
	
	public FotoPost(String publisher, String title, int numOfLikes, String linkToPicture) {
		super(publisher, title, numOfLikes);
		this.linkToPicture = linkToPicture; 
	}

	public String getLinkToPicture() {
		return linkToPicture;
	}

	public void setLinkToPicture(String linkToPicture) {
		this.linkToPicture = linkToPicture;
	}
	
}
