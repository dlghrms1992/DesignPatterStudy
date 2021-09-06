package IteratorAndCompositePattern.pancake;

import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		addItem("K&B ������ũ ��Ʈ", "��ũ����� ���׿� �佺Ʈ�� ��鿩�� ������ũ", true, 2.99);
		addItem("���ַ� ������ũ ��Ʈ", "�ް� �Ķ��̿� �ҽ����� ��鿩�� ������ũ", false, 2.99);
		addItem("K&B ������ũ ��Ʈ", "�ż��� ��纣���� ��纣�� �÷����� ���� ������ũ", true, 3.49);
		addItem("K&B ������ũ ��Ʈ", "���� ���⿡ ���� ��纣���� ���⸦ ���� �� �ֽ��ϴ�.", true, 3.59);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
				
	}

	public ArrayList getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(ArrayList menuItems) {
		this.menuItems = menuItems;
	}
	
	

}
