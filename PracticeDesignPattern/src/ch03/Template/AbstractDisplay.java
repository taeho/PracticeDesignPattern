package ch03.Template;

/*
 * 3. ch03 : temple method ����: ���� Ŭ�������� ��ü������ ó���ϱ�
 * 
 * */
public abstract class AbstractDisplay {	// �߻�Ŭ���� abstractDisplay 
	public abstract void open();		// ���� Ŭ������ ������ �ñ�� �߻� �޼���(1) open
	public abstract void print();		// ���� Ŭ������ ������ �ñ�� �߻� �޼���(2) print
	public abstract void close();		// ���� Ŭ������ ������ �ñ�� �߻� �޼���(3) close
	public final void display() {		// �߻� Ŭ�������� �����ϰ� �ִ� �޼ҵ� display
		open();							// �켱 open�ϰ�..
		for(int i=0; i<5; i++){			// 5�� print�� �ݺ��ϰ� 
			print();
		}
		close();						// ..���������� close �Ѵ�. �̰��� display �޼ҵ忡�� �����ǰ� �ִ� ����.
	}
}
