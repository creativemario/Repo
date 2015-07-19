package uk.co.reformtheempire.games.items.armor.player;

import uk.co.reformtheempire.games.items.armor.Armor;

public class Helmet implements Armor {

	private int level; // needs to change
	private int damage;
	private int defence;

	public Helmet(int level, int damage, int defence) {
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
