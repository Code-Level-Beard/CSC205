package projects.project5;

import project3.characters.GameCharacter;

public class BagTeamBattleRoyal {

	public Boolean teamMemberLeft(BagTeam<GameCharacter> team) {
		int teamAliveCharacters = 0;
		for (GameCharacter t: team) {
			if (t.isAlive() == true) {
				teamAliveCharacters++;	
			}
		}
		if (teamAliveCharacters == 0) {
			return false;
		}
		else {
			return true;
		}
	}

	public void fight(BagTeam<GameCharacter> team1, BagTeam<GameCharacter> team2) {

		int roundCount = 1;
		do {
			for (GameCharacter t: team1) {
				for (GameCharacter d: team2) {
					if (t.isAlive() == true && d.isAlive() == true) {
						System.out.println("\n\t\t\t\t\tRound " + roundCount + "\n\t\t\t\t\t  Fight!");
						roundCount++;
					}
					do {
						if (t.isAlive() == true && d.isAlive() == true) {
							t.attack(d);
						}
						if (d.isAlive() == true && t.isAlive() == true) {
							d.attack(t);
						}
					}while (t.isAlive() == true && d.isAlive() == true);
				}
			}
		}while (teamMemberLeft(team1) == true && teamMemberLeft(team2) == true);
		declareWinner(team1, team2);
	}	

	public void declareWinner(BagTeam<GameCharacter> team1, BagTeam<GameCharacter> team2) {
		if (teamMemberLeft(team1) == false) {
			System.out.println("\nTeam 2 is the winner!");
		}
		else {
			System.out.println("\nTeam 1 is the winner!");
		}
	}
}
