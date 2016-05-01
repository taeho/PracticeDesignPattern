package ch01.Iterator;

/*
 *  1. ch01 : Iterator 패턴: 순서대로 지정해서 처리하기.
 *  
 *  Book 클래스: 책을 나타내는 클래스
 * 
 * */
public class Book {
	private String name;
	public Book(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
