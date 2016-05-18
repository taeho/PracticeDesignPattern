package ch04.FactoryMethod.framework;

/*
 * ch04 : Factory Method ����: 
 *   factory�� '����'�̶�� �ǹ�, �ν��Ͻ��� �����ϴ� ������ Template Method �������� ������ ����
 *   Factory Method ����. Factory Method ���Ͽ����� �ν��Ͻ��� ����� ����� ���� Ŭ���� ������ ����������
 *   ��ü���� Ŭ���� �̸������� �������� ����. ��ü���� ������ ��� ���� Ŭ���� ������ ������.
 *   ���� �ν��Ͻ� ������ ���� ���(framework)�� ������ �ν��Ͻ� ������ Ŭ������ �и��ؼ� �����Ҽ� ����. 
 *  
 *  package framework : �ν��Ͻ� ���� ��
 * 	class Product : �߻� �޼ҵ� use �� ���ǵǾ� �ִ� �߻� Ŭ����
 * 
 * */
public abstract class Product {
	public abstract void use();
}
