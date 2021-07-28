package StrategyPattern.chess.children;

import StrategyPattern.chess.behaivor.BowAndArrowBehavior;
import StrategyPattern.chess.behaivor.WeaponBehavior;
import StrategyPattern.chess.parent.Character;

public class King extends Character{
	
	public King() {
		this.weapon = new BowAndArrowBehavior();
		System.out.println("저는 킹입니다.");
	}

	@Override
	public void fight() {
		this.weapon.useWeapon();
	}

	@Override
	public void setWeapone(WeaponBehavior wb) {
		System.out.println("무기체인지");
		this.weapon = wb;
	}
	
	
}
