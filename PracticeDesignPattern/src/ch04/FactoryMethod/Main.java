package ch04.FactoryMethod;

import ch04.FactoryMethod.framework.Factory;
import ch04.FactoryMethod.framework.Product;
import ch04.FactoryMethod.idcard.IDCardFactory;

/*
 * ch04 : Factory Method ����: 
 *   factory�� '����'�̶�� �ǹ�, �ν��Ͻ��� �����ϴ� ������ Template Method �������� ������ ����
 *   Factory Method ����. Factory Method ���Ͽ����� �ν��Ͻ��� ����� ����� ���� Ŭ���� ������ ����������
 *   ��ü���� Ŭ���� �̸������� �������� ����. ��ü���� ������ ��� ���� Ŭ���� ������ ������.
 *   ���� �ν��Ͻ� ������ ���� ���(framework)�� ������ �ν��Ͻ� ������ Ŭ������ �и��ؼ� �����Ҽ� ����. 
 *  
 * 	class Main : �׽�Ʈ Ŭ����
 * 
 * */
public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		
		Product card1 = factory.create("ȫ�浿");
		Product card2 = factory.create("�̼���");
		Product card3 = factory.create("������");
		
		card1.use();
		card2.use();
		card3.use();
	}
}
