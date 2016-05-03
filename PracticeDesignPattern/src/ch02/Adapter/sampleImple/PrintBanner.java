package ch02.Adapter.sampleImple;

/*
 * 2. ch02 : Adapter ����: �ٲ㼭 ���̿��ϱ�.(������ �̿���)
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
