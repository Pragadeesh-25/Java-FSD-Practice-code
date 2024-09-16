package pack;

public class Book extends WrittenItem{

	public Book(int uid, String name, int noc,String author) {
		super(uid, name, noc,author);
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
		// TODO Auto-generated method stub
		 System.out.println("Book details: " + toString());
		
	}

}
