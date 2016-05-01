package ch01.Iterator;
/*
 *  1. ch01 : Iterator 패턴: 순서대로 지정해서 처리하기.
 *  
 *  동작을 테스트
 * 
 * */
public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
		
	}

}
