package ch05.Singleton;

/*
 * ch05 : Singleton ����: �ν��Ͻ��� 1���� �����ϴ� Ŭ���� 
 *   - ���α׷��� ������ �� ���� ���� �ν��Ͻ��� ������....
 *   Ŭ������ �ν��Ͻ��� �� �ϳ��� �ʿ��� ��쵵 ����. �ý��۾ȿ��� 1���ۿ� �������� �ʴ°���
 *   ���α׷����� ǥ���ϰ� ������, �������, �ý�����ü�� ǥ���ϴ� Ŭ����,
 *   ������ �ý��� ������ ǥ���� Ŭ����, ������ �ý����� ǥ���� Ŭ����
 *  
 * */
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton(){
		System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
		
}
