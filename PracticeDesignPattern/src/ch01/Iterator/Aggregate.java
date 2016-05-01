package ch01.Iterator;

/*
 *  1. ch01 : Iterator 패턴: 순서대로 지정해서 처리하기.
 *  
 *  Aggregate 인터페이스: 집합체를 나타내는 인터페이스
 * 
 * */

public interface Aggregate {
	public abstract Iterator iterator();
}
