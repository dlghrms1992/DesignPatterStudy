package StrategyPattern.chess.parent;

import StrategyPattern.chess.behaivor.WeaponBehavior;

public class Character {

	protected WeaponBehavior weapon;
	
	public Character() {
		
	}
	
	public void fight() {
		System.out.println("�ο��� �����Ѵ�.");
		this.weapon.useWeapon();
		System.out.println("�ο��� ������.");
	};
	
	public void setWeapone(WeaponBehavior wb) {
		System.out.println("���� ü����~!!!");
		this.weapon = wb;
	};
}
