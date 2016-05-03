package ch02.Adapter.sampleExtends;

/*
 * 2. ch02 : Adapter 패턴: 바꿔서 재이용하기.(상속을 이용한)
 * 
 * */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
