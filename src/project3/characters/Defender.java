package project3.characters;

import java.util.Random;

public class Defender extends GameCharacter {
	
	Random numGen = new Random();

	public Defender() {
		super();
	}

	public Defender(String uInName, int uInHealth, int uInPower, int uInAgility) {
		super(uInName, uInHealth, uInPower, uInAgility);
	}

	@Override
	public String getCharacterName() {	
		return super.getCharacterName();
	}

	@Override
	public void setCharacterName(String characterName) {
		super.setCharacterName(characterName);
	}

	@Override
	public int getHealth() {
		return super.getHealth();
	}

	@Override
	public void setHealth(int health) {	
		super.setHealth(health);
	}

	@Override
	public int getPower() {
		return super.getPower();
	}

	@Override
	public void setPower(int power) {	
		super.setPower(power);
	}

	@Override
	public int getAgility() {	
		return super.getAgility();
	}

	@Override
	public void setAgility(int agility) {	
		super.setAgility(agility);
	}

	@Override
	public String toString() {	
		return super.toString();
	}

	public void attack(GameCharacter defender) {
		System.out.println("\n" + this.getCharacterName() + " attacks " + defender.getCharacterName() + "!");
		if (this.getPower() > defender.defend()) {
			System.out.println("\tThe attack succeeded and caused " + this.getPower() + " damage!" );
			defender.setHealth(defender.getHealth() - this.getPower());
			System.out.println("\t\t" + defender.getCharacterName() + " has " + defender.getHealth() + " health left");
		}
		else {
			System.out.println("The attack failed!");
		}
	}

	public int defend() {
		return (this.getAgility() - numGen.nextInt(this.getAgility()));
	}

	@Override
	public boolean isAlive() {
		if (this.getHealth() <= 0) {
			return false;
		}
		else {
			return true;
		}
	}

}
