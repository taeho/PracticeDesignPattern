package ch03.Template;

/*
 * 3. ch03 : temple method 패턴: 하위 클래스에서 구체적으로 처리하기
 * 		상위 클래스 쪽에 템플릿에 해당하는 메소드가 정의되어 있고, 그메서드의 정의 안에는
 *      추상메소드가 사용되고 있다. 따라서 상위 클래스의 프로그램만 보면 추상 메소드를 어떻게 호출하고 
 *      있는지 알수 있지만, 최종적으로 어떤 처리가 수행되는지 알수없음.
 *      
 *      추상메소드를 실제로 구현하는 것은 하위 클래스임. 하위 클래스 측에서 메소드를 구현하면
 *      구체적인 처리가 결정된다.. 서로 다른 하위 클래스가 서로 다른 구현을 실행하면
 *      서로다른 처리가 실행된다. 그러나 어떤 하위클래스에서 어떤 구현을 하더라도 처리의 큰흐름은
 *      상위 클래스에서 결정한대로 됨.
 *      
 *      이와 같이 상위클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 구체적인 내용을 결정하는 디자인 패턴을 
 *      template method 패턴이라고 부름.
 * */

public class Main {
	
	public static void main(String[] args) {
		// 'H'를 가진 charDisplay 인스턴스를 1개를 만든다.
		AbstractDisplay d1 = new CharDisplay('H');
		// "Hello, world"를 가진 StringDisplay의 인스턴스를 1개를 만든다.
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		// "안녕하세요"를 가진 StringDisplay의 인스턴스를 1개 만든다.
		AbstractDisplay d3 = new StringDisplay("안녕하세요.");
		
		// d1, d2, d4 모두 같은 AbstractDisplay의 하위클래스의 인스턴스이기 때문에
		// 상속한 display메소드를 호출할 수 있다.
		// 실제 동작은 chardisplay나 stringdisplay에서 결정한다.
		d1.display();
		
		d2.display();
		
		d3.display();
	}

}
