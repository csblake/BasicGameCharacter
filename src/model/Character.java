/**
 * @author clayblake - csblake
 * CIS175 - Fall 2021
 * Jan 25, 2022
 */
package model;

public class Character {
	// properties
	private String name;
	private int age;
	private int lvl;
	private int strength;
	private int charisma;
	private int healthPoints;
	
	public Character() {
		// default constructor
	}
	
	public Character(String name) {
		// basic non-default constructor
		this.name = name;
	}
	
	public Character(String name, int age, int lvl, int strength, int charisma,
			int healthPoints) {
		// full non-default constructor
		this.name = name;
		this.age = age;
		this.lvl = lvl;
		this.strength = strength;
		this.charisma = charisma;
		this.healthPoints = healthPoints;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	
}
