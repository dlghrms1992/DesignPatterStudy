package StrategyPattern.chess.children;

import StrategyPattern.chess.behaivor.BowAndArrowBehavior;
import StrategyPattern.chess.behaivor.WeaponBehavior;
import StrategyPattern.chess.parent.Character;

public class Queen extends Character{
	
	public Queen() {
		System.out.println("���� ���Դϴ�.");
		this.weapon = new BowAndArrowBehavior();
	}

	@Override
	public void fight() {
		this.weapon.useWeapon();
	}

	@Override
	public void setWeapone(WeaponBehavior wb) {
		this.weapon = wb;
	}
	
	
}
