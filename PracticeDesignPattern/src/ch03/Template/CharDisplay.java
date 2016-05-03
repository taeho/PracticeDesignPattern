package ch03.Template;

/*
 * 3. ch03 : temple method ����: ���� Ŭ�������� ��ü������ ó���ϱ�
 * 
 * */

public class CharDisplay extends AbstractDisplay{
			// CharDisplay�� AbstractDisplay�� ���� Ŭ����
	private char ch;	// ǥ���ؾ� �� ����.
	
	public CharDisplay(char ch){	// �����ڿ��� ���޵� ����ch��
		this.ch = ch;				// �ʵ忡 ����� �д�.
	}
	
	@Override
	public void open() {			// ���� Ŭ���������� �߻� �޼ҵ� ����.
									// ���⼭ �������̵��ؼ� �����Ѵ�.
		System.out.print("<<");		// ���� ���ڿ� "<<"�� ǥ���Ѵ�.
	}

	@Override
	public void print() {			// print �޼ҵ嵵 ���⿡�� �����Ѵ�.
									// �̰��� display���� �ݺ��ؼ� ȣ��ȴ�.
		System.out.print(ch);		// �ʵ忡 ����� �� ���ڸ� 1�� ǥ���Ѵ�.
	}

	@Override
	public void close() {			// close �޼ҵ嵵 ���⿡�� �����Ѵ�.
		System.out.println(">>");	// ���� ���ڿ� ">>"�� ǥ��.
	}

}
