package ch04.FactoryMethod.framework;

/*
 * ch04 : Factory Method ����: 
 *   factory�� '����'�̶�� �ǹ�, �ν��Ͻ��� �����ϴ� ������ Template Method �������� ������ ����
 *   Factory Method ����. Factory Method ���Ͽ����� �ν��Ͻ��� ����� ����� ���� Ŭ���� ������ ����������
 *   ��ü���� Ŭ���� �̸������� �������� ����. ��ü���� ������ ��� ���� Ŭ���� ������ ������.
 *   ���� �ν��Ͻ� ������ ���� ���(framework)�� ������ �ν��Ͻ� ������ Ŭ������ �и��ؼ� �����Ҽ� ����. 
 *  
 *  package framework : �ν��Ͻ� ���� ��
 * 	class Factory : �޼ҵ� create�� �����ϰ� �ִ� �߻� Ŭ����
 * 
 * */
public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
