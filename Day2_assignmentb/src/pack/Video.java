package pack;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int year;
	
	public Video(String director, String genre, int year) {
		super(year, genre, year, year);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
    public void print() {
        System.out.println("Video details: " + toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + year);
    }
	
	
	

}
