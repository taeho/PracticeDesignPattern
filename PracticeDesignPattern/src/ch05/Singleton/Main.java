package ch05.Singleton;

/*
 * ch05 : Singleton ����: �ν��Ͻ��� 1���� �����ϴ� Ŭ���� 
 *   - ���α׷��� ������ �� ���� ���� �ν��Ͻ��� ������....
 *   Ŭ������ �ν��Ͻ��� �� �ϳ��� �ʿ��� ��쵵 ����. �ý��۾ȿ��� 1���ۿ� �������� �ʴ°���
 *   ���α׷����� ǥ���ϰ� ������, �������, �ý�����ü�� ǥ���ϴ� Ŭ����,
 *   ������ �ý��� ������ ǥ���� Ŭ����, ������ �ý����� ǥ���� Ŭ����
 *  
 * 
 * */
public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1�� ojb2�� ���� �ν��Ͻ��Դϴ�.");
		} else {
			System.out.println("obj1�� ojb2�� '�ٸ�' �ν��Ͻ��Դϴ�.");
		}
		System.out.printf("End.");
	}
}
