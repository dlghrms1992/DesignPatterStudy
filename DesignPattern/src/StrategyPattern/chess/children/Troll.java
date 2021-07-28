package StrategyPattern.chess.children;

import StrategyPattern.chess.behaivor.AxeBehaivor;
import StrategyPattern.chess.behaivor.WeaponBehavior;
import StrategyPattern.chess.parent.Character;

public class Troll extends Character {
	
	
	public Troll() {
		System.out.println("저는 트롤입니다.");
		this.weapon = new AxeBehaivor();
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
