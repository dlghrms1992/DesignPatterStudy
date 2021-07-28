package StrategyPattern.chess.children;

import StrategyPattern.chess.behaivor.BowAndArrowBehavior;
import StrategyPattern.chess.behaivor.SwordBehavior;
import StrategyPattern.chess.behaivor.WeaponBehavior;
import StrategyPattern.chess.parent.Character;

public class Knight extends Character {
	
	public Knight() {
		System.out.println("���� ����Ʈ �Դϴ�.");
		 this.weapon = new SwordBehavior();
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
