package ch04.FactoryMethod.idcard;

import ch04.FactoryMethod.framework.*;

/*
 * ch04 : Factory Method ����: 
 *   factory�� '����'�̶�� �ǹ�, �ν��Ͻ��� �����ϴ� ������ Template Method �������� ������ ����
 *   Factory Method ����. Factory Method ���Ͽ����� �ν��Ͻ��� ����� ����� ���� Ŭ���� ������ ����������
 *   ��ü���� Ŭ���� �̸������� �������� ����. ��ü���� ������ ��� ���� Ŭ���� ������ ������.
 *   ���� �ν��Ͻ� ������ ���� ���(framework)�� ������ �ν��Ͻ� ������ Ŭ������ �и��ؼ� �����Ҽ� ����. 
 *  
 *  package idcard : ��ü���� ������ �����ϰ� �ִ� ��
 * 	class IDCard : �޼ҵ� use�� �����ϰ� �ִ� Ŭ����
 * 
 * */
public class IDCard extends Product {

	private String owner;
	IDCard(String owner) {
		System.out.println(owner + "�� ī�带 ����ϴ�.");
		this.owner = owner;
	}
	@Override
	public void use() {
		System.out.println(owner + "�� ī�带 ����մϴ�.");
	}
	
	public String getOwner() {
		return owner;
	}

}
