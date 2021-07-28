package StrategyPattern.chess.children;

import StrategyPattern.chess.behaivor.BowAndArrowBehavior;
import StrategyPattern.chess.behaivor.SwordBehavior;
import StrategyPattern.chess.behaivor.WeaponBehavior;
import StrategyPattern.chess.parent.Character;

public class Knight extends Character {
	
	public Knight() {
		System.out.println("저는 나이트 입니다.");
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
