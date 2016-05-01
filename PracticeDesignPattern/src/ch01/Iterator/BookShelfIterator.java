package ch01.Iterator;

/*
 *  1. ch01 : Iterator 패턴: 순서대로 지정해서 처리하기.
 *  
 *  BookShelfIterator 클래스: 서가를 검색하는 클래스
 * 
 * */
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
	
}
