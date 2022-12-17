package model;

public abstract class Base {
	
	protected String name;
	protected int atk;
	
	public Base(String name, int atk) {
		super();
		this.name = name;
		this.atk = atk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public abstract void view();

}
