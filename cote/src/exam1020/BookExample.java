package exam1020;

public class BookExample {

	public static void main(String[] args) {
		
		Book[] b = new Book[3];
		
		b[0] = new Book("first", "kim", "1-1-1-1-1");
		b[1] = new Book("second", "lee", "2-4-8-16-32", 10000);
		b[2] = new Book("third", "park", "3-9-27-81-243", 17000);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(b[i].getTitle());
			System.out.println(b[i].getAuthor());
			System.out.println(b[i].getIsbn());
			System.out.println(b[i].getPrice());
			System.out.println();
		}

	}

}
