package StrategyPattern.chess.behaivor;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		 System.out.println("저는 활과 화살로 사냥합니다.");
		
	}

}
