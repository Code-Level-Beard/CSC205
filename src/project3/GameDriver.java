package project3;

import java.util.Random;

import project3.characters.*;


public class GameDriver {

	public static void main(String[] args) {
		int deathCounter = 0;
		int firstRanFighter;
		int secondRanFighter;
		Random fighterSelector = new Random();
		GameCharacter[] fighterGroup = {
				new Brawler("Donkey Kong", 100, 13, 5),
				new Rogue("Sheik", 50, 6, 15),
				new Defender("Snorlax", 200, 8, 2),
				new Brawler("Master Chief", 150, 10, 8),
				new Rogue("Lara Croft", 80, 8, 16),
				new Defender("Knight", 150, 7, 3)};
		
		System.out.println("Introducting your fighters!\n");
		for (int ii = 0; ii < fighterGroup.length; ii++) {
			System.out.println(fighterGroup[ii].toString());
		}
		
		firstRanFighter = fighterSelector.nextInt(fighterGroup.length);
		
		secondRanFighter = fighterSelector.nextInt(fighterGroup.length);
		do {
			secondRanFighter = fighterSelector.nextInt(fighterGroup.length);
		} while (firstRanFighter == secondRanFighter);

		System.out.println("\nLet the Batlle Royal Begin!!!!");

		for (int ii = 0; ii < fighterGroup.length-1; ii++) {
			System.out.println("\nFight #" + (ii + 1));
			do {
				if (fighterGroup[firstRanFighter].isAlive() == true) {
					fighterGroup[firstRanFighter].attack(fighterGroup[secondRanFighter]);
				}

				if (fighterGroup[secondRanFighter].isAlive() == true) {
					fighterGroup[secondRanFighter].attack(fighterGroup[firstRanFighter]);
				}

			} while (fighterGroup[firstRanFighter].isAlive() == true && fighterGroup[secondRanFighter].isAlive() == true);
			
			deathCounter++;
			
			if (deathCounter == fighterGroup.length -1) {
				break;
			}
			
			if (fighterGroup[firstRanFighter].isAlive() == false) {
				System.out.println("\n" + fighterGroup[secondRanFighter].getCharacterName() + " has won the fight!");
				firstRanFighter = fighterSelector.nextInt(fighterGroup.length);
				do {
					firstRanFighter = fighterSelector.nextInt(fighterGroup.length);
				} while (firstRanFighter == secondRanFighter || fighterGroup[firstRanFighter].isAlive() == false);
				if (fighterGroup[firstRanFighter].isAlive() == true) {
					System.out.println(fighterGroup[secondRanFighter].getCharacterName() + " will fight " + fighterGroup[firstRanFighter].getCharacterName() + " next!");
				}
			}

			else {
				System.out.println("\n" + fighterGroup[firstRanFighter].getCharacterName() + " has won the fight!");
				secondRanFighter = fighterSelector.nextInt(fighterGroup.length);
				do {
					secondRanFighter = fighterSelector.nextInt(fighterGroup.length);
				} while (firstRanFighter == secondRanFighter || fighterGroup[secondRanFighter].isAlive() == false);
				if (fighterGroup[secondRanFighter].isAlive() == true) {
					System.out.println(fighterGroup[firstRanFighter].getCharacterName() + " will fight " + fighterGroup[secondRanFighter].getCharacterName() + " next!");
				}
			}
		}
		
		if (fighterGroup[firstRanFighter].isAlive() == false) {
			System.out.println("\n" + fighterGroup[secondRanFighter].getCharacterName() + " has won the Battle Royal!");
			}
		else {
			System.out.println("\n" + fighterGroup[firstRanFighter].getCharacterName() + " has won the fight!");
		}
	}

}
