package pack;

public class Main {

	public static void main(String[] args) {
		   // Create objects
        Book book = new Book(1, "Java Programming", 5, "James");
        Journalpaper journal = new Journalpaper(2, "DSA", 3, "John", 2020);
        Video video = new Video("SSR", "RRR", 2020);
        CD cd = new CD(4, "Thriller", 4, 42, "Michael Jackson", "Pop");

        // Print details
        book.print();
        journal.print();
        video.print();
        cd.print();

        // Demonstrate check out and check in
        book.checkOut();
        System.out.println("After checkout: " + book.getNoc() + " copies left.");
        book.checkIn();
        System.out.println("After checkin: " + book.getNoc() + " copies available.");
        book.checkOut();
        System.out.println("After checkout: " + book.getNoc() + " copies left.");
        book.checkOut();
        System.out.println("After checkout: " + book.getNoc() + " copies left.");
        
    }

}
