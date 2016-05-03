package ch02.Adapter.sampleImple;

/*
 * 2. ch02 : Adapter 패턴: 바꿔서 재이용하기.(위임을 이용한)
 * 	class PrintBanner : 
 * 
 * */
public class PrintBanner extends Print {

	private Banner banner;
	public PrintBanner(String string){
		this.banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
