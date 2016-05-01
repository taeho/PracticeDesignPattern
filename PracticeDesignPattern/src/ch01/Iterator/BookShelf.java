package ch01.Iterator;

/*
 *  1. ch01 : Iterator 패턴: 순서대로 지정해서 처리하기.
 *  
 *  BookShelf 클래스: 서가를 나타내는 클래스
 * 
 * */
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last = 0;
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int index){
		return books[index];
	}
	
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	
	public int getLength(){
		return last;
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}

}
