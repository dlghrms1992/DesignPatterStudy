package StrategyPattern.chess.behaivor;

public class SwordBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("검으로 사냥합니다.");
		
	}

	
}
