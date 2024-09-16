package pack;

public class Journalpaper extends WrittenItem {

	private int yop;
	
	public Journalpaper(int uid, String name, int noc,String author,int yop) {
		super(uid, name, noc,author);
		this.yop=yop;
		// TODO Auto-generated constructor stub
	}
	public void checkIn() {
		setNoc(getNoc()+1);
	}
	
	public void checkOut() {
		setNoc(getNoc()-1);
	}
	 @Override
	    public void print() {
	        System.out.println("JournalPaper details: " + toString() + ", Year Published: " + yop);
	    }

}
