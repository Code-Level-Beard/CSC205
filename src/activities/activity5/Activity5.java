package activities.activity5;

import project3.characters.*;

public class Activity5 {

	public static void main(String[] args) {
		
		ArrayListTeam<GameCharacter> Team1 = new ArrayListTeam<GameCharacter>();
		ArrayListTeam<GameCharacter> Team2 = new ArrayListTeam<GameCharacter>();
		
		
		
		int team1AttackPower = 0;
		int team2AttackPower = 0;
		
		Team1.add(new Brawler("Donkey Kong", 100, 13, 5));
		Team1.add(new Rogue("Sheik", 50, 6, 15));
		Team1.add(new Defender("Snorlax", 200, 8, 2));
		Team1.add(new Brawler("Kratos", 120, 12, 5));
		Team1.add(new Brawler("Spoon Knight", 110, 10, 6));
		
		Team2.add(new Brawler("Master Cheif", 150, 10, 8));
		Team2.add(new Rogue("Lara Croft", 80, 8, 16));
		Team2.add(new Defender("Fork Knight", 200, 8, 2));
		Team2.add(new Brawler("Bowzer", 122, 14, 5));
		Team2.add(new Brawler("Ryu", 90, 18, 6));
		
		
		for (GameCharacter t: Team1) {
			team1AttackPower += t.getPower();
		}
		
		for (GameCharacter t: Team2) {
			team2AttackPower += t.getPower();
		}
		
		if (team1AttackPower > team2AttackPower) {
			System.out.println("Team 1 has a greater attack power, their total power is: " + team1AttackPower);
			System.out.println("Team 2 has a lesser attack power, their total power is: " + team2AttackPower);
		}
		else {
			System.out.println("Team 2 has a greater attack power, their total power is: " + team2AttackPower);
			System.out.println("Team 1 has a lesser attack power, their total power is: " + team1AttackPower);
			
		}
		
		

	}

}
