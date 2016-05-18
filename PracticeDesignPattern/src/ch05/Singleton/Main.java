package ch05.Singleton;

/*
 * ch05 : Singleton 패턴: 인스턴스가 1개만 존재하는 클래스 
 *   - 프로그램을 실행할 때 보통 많은 인스턴스가 생성됨....
 *   클래스가 인스턴스가 단 하나만 필요한 경우도 있음. 시스템안에서 1개밖에 존재하지 않는것을
 *   프로그램으로 표현하고 싶을때, 예를들어, 시스템자체를 표현하는 클래스,
 *   현재의 시스템 설정을 표현한 클래스, 윈도우 시스템을 표현한 클래스
 *  
 * 
 * */
public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1과 ojb2는 같은 인스턴스입니다.");
		} else {
			System.out.println("obj1과 ojb2는 '다른' 인스턴스입니다.");
		}
		System.out.printf("End.");
	}
}
