package ch02.Adapter.sampleExtends;

/*
 * 2. ch02 : Adapter ����: �ٲ㼭 ���̿��ϱ�. (����� �̿���)
 * 	class Banner : �̸� �����Ǿ� �ִ� Ŭ������� ����
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
