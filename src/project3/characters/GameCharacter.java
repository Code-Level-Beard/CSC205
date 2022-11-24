package project3.characters;

public abstract class GameCharacter implements Fight {
	
	private String characterName;
	private int health;
	private int power;
	private int agility;
	
	public GameCharacter() {
		this.setCharacterName("Unknown Challenger");
		this.setAgility(0);
		this.setHealth(0);
		this.setPower(0);
	}
	
	public GameCharacter(String uInName, int uInHealth, int uInPower, int uInAgility) {
		this.setCharacterName(uInName);
		this.setHealth(uInHealth);
		this.setPower(uInPower);
		this.setAgility(uInAgility);
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	@Override
	public String toString() {
		return this.characterName + " has " + this.health + " health, " + this.power + " power, and " + this.agility + " agility.";
	}
	
	public boolean isAlive() {
		if (this.getHealth() <= 0) {
			return false;
		}
		else {
			return true;
		}
	}

}
