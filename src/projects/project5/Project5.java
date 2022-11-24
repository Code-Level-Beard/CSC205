package projects.project5;

import project3.characters.*;

public class Project5 {

	public static void main(String[] args) {
		
		BagTeam<GameCharacter> Team1 = new BagTeam<GameCharacter>();
		BagTeam<GameCharacter> Team2 = new BagTeam<GameCharacter>();
		BagTeamBattleRoyal Battle = new BagTeamBattleRoyal();
		
		Team1.add(new Brawler("Donkey Kong", 100, 13, 5));
		Team1.add(new Rogue("Sheik", 50, 6, 15));
		Team1.add(new Defender("Snorlax", 200, 8, 2));
		Team1.add(new Brawler("Kratos", 120, 12, 5));
		Team1.add(new Brawler("Spoon Knight", 110, 10, 6));
		
		Team2.add(new Brawler("Master Chief", 150, 10, 8));
		Team2.add(new Rogue("Lara Croft", 80, 8, 16));
		Team2.add(new Defender("Fork Knight", 200, 8, 2));
		Team2.add(new Brawler("Bowzer", 122, 14, 5));
		Team2.add(new Brawler("Ryu", 90, 18, 6));
		
		System.out.println("The first team is: ");
		for (GameCharacter t: Team1) {
			System.out.println(t.toString());
		}
		
		System.out.println("\nThe second team is: ");
		for (GameCharacter t: Team2) {
			System.out.println(t.toString());
		}
		
		Battle.fight(Team1, Team2);
		
	}
	
}
