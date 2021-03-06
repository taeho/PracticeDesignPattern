package ch04.FactoryMethod;

import ch04.FactoryMethod.framework.Factory;
import ch04.FactoryMethod.framework.Product;
import ch04.FactoryMethod.idcard.IDCardFactory;

/*
 * ch04 : Factory Method 패턴: 
 *   factory는 '공장'이라는 의미, 인스턴스를 생성하는 공장을 Template Method 패턴으로 구성한 것이
 *   Factory Method 패턴. Factory Method 패턴에서는 인스턴스를 만드는 방법을 상위 클래스 측에서 결정하지만
 *   구체적인 클래스 이름까지는 결정하지 않음. 구체적인 내용은 모두 하위 클래스 측에서 수행함.
 *   따라서 인스턴스 생성을 위한 골격(framework)과 실제의 인스턴스 생성의 클래스를 분리해서 생각할수 잇음. 
 *  
 * 	class Main : 테스트 클래스
 * 
 * */
public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("강감찬");
		
		card1.use();
		card2.use();
		card3.use();
	}
}
