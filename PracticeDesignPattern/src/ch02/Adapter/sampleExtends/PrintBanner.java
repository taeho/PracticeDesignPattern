package ch02.Adapter.sampleExtends;

/*
 * 2. ch02 : Adapter 패턴: 바꿔서 재이용하기.(상속을 이용한)
 * 	class PrintBanner : 어댑터의 역활을 완수.
 * 
 * */

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
