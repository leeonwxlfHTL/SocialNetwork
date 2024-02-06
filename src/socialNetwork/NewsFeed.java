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
