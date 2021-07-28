package StrategyPattern.chess.behaivor;

public class AxeBehaivor implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("저는 도끼를 이용해서 공격합니다.~!");
	}
	
}
