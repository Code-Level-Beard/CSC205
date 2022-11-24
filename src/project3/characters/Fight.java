package project3.characters;

public interface Fight {
	
	public void attack(GameCharacter defender);
	
	public int defend();
	
	public boolean isAlive();

}
