package model;

public class ThreeStarWeapon extends Base implements Description{
	
	public ThreeStarWeapon(String name, int atk) {
		super(name, atk);
	}

	@Override
	public void displayName() {
		System.out.println(this.name);
		
	}

	@Override
	public void message() {
		System.out.println("============================");
		System.out.println("This weapon can be equipped");
		System.out.println("by any playable character");
		
	}

	@Override
	public void type() {
		System.out.println("*** Weapon");
		
	}

	@Override
	public void view() {
		System.out.println("============================");
		System.out.println("ATK               : " + this.atk);
		System.out.println("============================");
		System.out.println("");
		
	}

}
