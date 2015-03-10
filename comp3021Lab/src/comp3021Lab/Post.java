package comp3021Lab;

import java.util.Date;

public class Post {
	private Date date;
	private String content;
	
	
	public Post(Date date, String content) {
		super();
		this.date = date;
		this.content = content;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString(){
		String tostring;
		tostring = date.toString() + '\n' + content;
		return tostring;
	}
	
	@Override
	public boolean equals(Object o){
		boolean ans = true;
		
		if(o == this){
			return true;
		}
		
		if(o == null){
			return false;
		}
		
		
		if(!this.getClass().equals(o.getClass())){
			ans = false;
		}	
		
		Post post = (Post) o;
		if(!this.content.equals(post.content)){
			ans = false;
		}
		
		if(!this.date.equals(post.date)){
			ans = false;
		}
				
		return ans;
		
	}
	
	@Override
	public int hashCode(){
		int hash = 0;
		hash = this.content.hashCode();
		
		return hash;
	}
	
	
	public boolean contains(String keyword){
		boolean ans = false;
		
		if(this.content.contains(keyword)){
			ans = true;
		}
		
		return ans;
	}
	
	
	
}
