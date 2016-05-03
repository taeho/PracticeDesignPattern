package ch02.Adapter.sampleExtends;

/*
 * 2. ch02 : Adapter 패턴: 바꿔서 재이용하기. (상속을 이용한)
 * 	class Banner : 미리 제공되어 있는 클래스라고 가정
 * 
 * */

public class Banner {
	private String string;
	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithParen(){
		System.out.println("(" + string + ")");
	}
	
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
