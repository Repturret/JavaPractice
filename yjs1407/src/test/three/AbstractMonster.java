package test.three;

public abstract class AbstractMonster {
	
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	protected AbstractMonster(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	public boolean defense(int enermyAttack) {
		if (defense > enermyAttack) {
			return true;
		}
		else {
			hp -= enermyAttack - defense;
			return false;
		}
	}
	
	public abstract int attack();

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

}
