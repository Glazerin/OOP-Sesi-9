package model;

public class FourStar extends Base implements Description{
	
	private int hp;
	private int def;
	private int em;
	
	public FourStar(String name, int atk, int hp, int def, int em) {
		super(name, atk);
		this.hp = hp;
		this.def = def;
		this.em = em;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getEm() {
		return em;
	}

	public void setEm(int em) {
		this.em = em;
	}

	@Override
	public void message() {
		System.out.println("============================");
		System.out.println("This is a playable character");
	}

	@Override
	public void type() {
		System.out.println("**** Character");
		
	}

	@Override
	public void view() {
		System.out.println("============================");
		System.out.println("ATK               : " + this.atk);
		System.out.println("HP                : " + this.hp);
		System.out.println("DEF               : " + this.def);
		System.out.println("Elemental Mastery : " + this.em);
		System.out.println("============================");
		System.out.println("");
	}

	@Override
	public void displayName() {
		System.out.println(this.name);
		
	}

}
