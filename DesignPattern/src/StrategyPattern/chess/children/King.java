package StrategyPattern.chess.children;

import StrategyPattern.chess.behaivor.BowAndArrowBehavior;
import StrategyPattern.chess.behaivor.WeaponBehavior;
import StrategyPattern.chess.parent.Character;

public class King extends Character{
	
	public King() {
		this.weapon = new BowAndArrowBehavior();
		System.out.println("���� ŷ�Դϴ�.");
	}

	@Override
	public void fight() {
		this.weapon.useWeapon();
	}

	@Override
	public void setWeapone(WeaponBehavior wb) {
		System.out.println("����ü����");
		this.weapon = wb;
	}
	
	
}
