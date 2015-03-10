package comp3021Lab;

import java.util.Date;

public class FriendsPost extends Post{

	private User friend = null;
	
	public FriendsPost(Date date, String content) {
		super(date, content);
		// TODO Auto-generated constructor stub
	}
	
	public FriendsPost(Date date, String content, User user){
		super(date, content);
		friend = user;
	}

}
