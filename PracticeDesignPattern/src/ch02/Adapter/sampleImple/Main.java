package ch02.Adapter.sampleImple;

/*
 * 2. ch02 : Adapter ����: �ٲ㼭 ���̿��ϱ�.(������ �̿���)
 * 
 * */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
