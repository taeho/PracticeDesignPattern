package ch01.Iterator;

/*
 *  1. ch01 : Iterator 패턴: 순서대로 지정해서 처리하기.
 *  
 *  Iterator 인터페이스: 하나씩 나열하면서 검색을 실행하는 인터페이스
 * 
 * */

public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
