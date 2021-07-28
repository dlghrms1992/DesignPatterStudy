package StrategyPattern.chess.behaivor;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("저는 나이프를 이용해서 사냥합니다.");
	}

}
