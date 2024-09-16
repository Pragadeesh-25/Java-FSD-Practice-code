package pack;

public abstract class WrittenItem extends Item{
	private String authorName;
	public WrittenItem(int uid, String name, int noc,String authorName) {
		super(uid, name, noc);
		this.authorName=authorName;
		// TODO Auto-generated constructor stub
	}
	

	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	  @Override
	    public String toString() {
	        return super.toString() + ", Author: " + authorName;
	    }



	
	
	

}
