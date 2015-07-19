package uk.co.reformtheempire.games.items.armor.player;

import uk.co.reformtheempire.games.items.armor.Armor;

public class Boots implements Armor{
	
	private int level;
	private int damage;
	private int defence;

	public Boots(int level, int damage, int defence) {
		super();
		this.level = level;
		this.damage = damage;
		this.defence = defence;
	}

	public int getLevel() {
		return level;
	}

	public int getDamage() {
		return damage;
	}

	public int getDefence() {
		return defence;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
}
