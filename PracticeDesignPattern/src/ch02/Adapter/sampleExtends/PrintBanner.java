package ch02.Adapter.sampleExtends;

/*
 * 2. ch02 : Adapter ����: �ٲ㼭 ���̿��ϱ�.(����� �̿���)
 * 	class PrintBanner : ������� ��Ȱ�� �ϼ�.
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
