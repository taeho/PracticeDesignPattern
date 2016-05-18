package ch04.FactoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;

import ch04.FactoryMethod.framework.Factory;
import ch04.FactoryMethod.framework.Product;

/*
 * ch04 : Factory Method ����: 
 *   factory�� '����'�̶�� �ǹ�, �ν��Ͻ��� �����ϴ� ������ Template Method �������� ������ ����
 *   Factory Method ����. Factory Method ���Ͽ����� �ν��Ͻ��� ����� ����� ���� Ŭ���� ������ ����������
 *   ��ü���� Ŭ���� �̸������� �������� ����. ��ü���� ������ ��� ���� Ŭ���� ������ ������.
 *   ���� �ν��Ͻ� ������ ���� ���(framework)�� ������ �ν��Ͻ� ������ Ŭ������ �и��ؼ� �����Ҽ� ����. 
 *  
 *  package idcard : ��ü���� ������ �����ϰ� �ִ� ��
 * 	class IDCardFactory : �޼ҵ� createProduct, registerProduct�� �����ϰ� �ִ� Ŭ����
 * 
 * */
public class IDCardFactory extends Factory {

	private List owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public List getOwners() {
		return owners;
	}

}
