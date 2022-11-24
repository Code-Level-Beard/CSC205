package activities.activity6;

import project3.characters.*;

public class Activity6 {

	public static void main(String[] args) {
		LinkedListTeam<GameCharacter> team1 = new LinkedListTeam<GameCharacter>();
		LinkedListTeam<GameCharacter> team2 = new LinkedListTeam<GameCharacter>();
		
		team1.add(new Brawler("Donkey Kong", 100, 13, 5));
		team1.add(new Rogue("Sheik", 50, 6, 15));
		team1.add(new Defender("Snorlax", 200, 8, 2));
		team1.add(new Brawler("Kratos", 120, 12, 5));
		team1.add(new Brawler("Spoon Knight", 110, 10, 6));
		
		team2.add(new Brawler("Master Chief", 150, 10, 8));
		team2.add(new Rogue("Lara Croft", 80, 8, 16));
		team2.add(new Defender("Fork Knight", 200, 8, 2));
		team2.add(new Brawler("Bowzer", 122, 14, 5));
		team2.add(new Brawler("Ryu", 90, 18, 6));

		System.out.println(team1);
		System.out.println();
		
		System.out.println(team2);

	}

}
