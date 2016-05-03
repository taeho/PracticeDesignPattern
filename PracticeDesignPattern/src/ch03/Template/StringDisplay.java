package ch03.Template;

/*
 * 3. ch03 : temple method ����: ���� Ŭ�������� ��ü������ ó���ϱ�
 *    
 *    open : ���ڿ� "+-----+"�� ǥ���Ѵ�.
 *    print : �����ڿ��� �־��� ���ڿ��� | �� | ���̿� ǥ���Ѵ�.
 *    close : ���ڿ� "+-----+"�� ǥ���Ѵ�.
 * 
 * */

public class StringDisplay extends AbstractDisplay {
	// StringDisplay�� AbstractDisplay�� ���� Ŭ���� 
	
	private String string;		// ǥ���ؾ� �� ���ڿ�
	private int width;			// ����Ʈ ������ ����� ���ڿ��� '����'
	public StringDisplay(String string){	// �����ڿ��� ���޵� ���ڿ� string ��
		this.string = string;				// �ʵ忡 ���
		this.width = string.getBytes().length;	// �׸��� ����Ʈ ������ ���̵� �ʵ忡 ����صΰ�
												// ����� �ΰ� ���߿� ����Ѵ�.
	}
	
	@Override
	public void open() {		// �������̵��ؼ� ������ open �޼���
		printLine();			// �� Ŭ������ �޼ҵ� printLine���� ���� �׸���.
	}

	@Override
	public void print() {		// print �޼ҵ��
		System.out.println("|" + string + "|");	// �ʵ忡 ����� �� ���ڿ��� ���Ŀ� | �� �ٿ��� ǥ��
	}						

	@Override
	public void close() {		// close �޼ҵ��
		printLine();			// openó�� printLine �޼ҵ忡�� ���� �׸���.
	}
	
	private void printLine() {	// open�� close���� ȣ��� printLine �޼ҵ��̴�.
		System.out.print("+");	// private �̱� ������ �� Ŭ���� �ȿ����� ���ȴ�.
		for(int i=0; i<width; i++) {	// �µθ��� �𼭸��� ǥ���ϴ� "+" ��ũ�� ǥ��
			System.out.print("-");		// width�� ������ŭ "-"�� ǥ���ϰ� �׵θ������� �̿��Ѵ�.
		}
		System.out.println("+");	// �׵θ��� �𼭸��� ǥ���ϴ� "+" ��ũ�� ǥ��
	}

}
