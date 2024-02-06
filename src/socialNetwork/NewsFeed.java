package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Post> posts;

	public NewsFeed() {
		super();
		posts = new ArrayList<>();
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}
	/**
	 * in this Method a Post will be added to the Feed
	 * @param post this is the Post which will be added
	 */
	public void addPostToFeed(Post post) {
		posts.add(post); 
	}
	/**
	 * In this Method a Post will be removed
	 * @param post is the complete Post which should be removed
	 */
	public void removePostFromFeed(Post post) {
		posts.remove(post);
	}
	/**
	 * In this Method a Post will be removed
	 * @param index is the position of the Post which should be removed
	 */
	public void removePostFromFeed(int index) {
		posts.remove(index);
	}
	
	
	
}
