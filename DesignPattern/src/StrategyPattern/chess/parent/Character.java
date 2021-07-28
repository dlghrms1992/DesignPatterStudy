package StrategyPattern.chess.parent;

import StrategyPattern.chess.behaivor.WeaponBehavior;

public class Character {

	protected WeaponBehavior weapon;
	
	public Character() {
		
	}
	
	public void fight() {
		System.out.println("싸움을 시작한다.");
		this.weapon.useWeapon();
		System.out.println("싸움이 끝났다.");
	};
	
	public void setWeapone(WeaponBehavior wb) {
		System.out.println("무기 체인지~!!!");
		this.weapon = wb;
	};
}
