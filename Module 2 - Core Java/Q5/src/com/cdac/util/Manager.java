package com.cdac.util;

import com.cdac.players.CricketPlayer;
import com.cdac.players.FootballPlayer;
import com.cdac.players.Players;

public class Manager {

	public void populatePlayers(Players[] players) {
		players[0] = new CricketPlayer("Virat",22,"Blue",0,0,0);
		players[1] = new CricketPlayer("Dhoni",24,"Blue",0,0,0);
		players[2] = new CricketPlayer("Raina",30,"Blue",0,0,0);
		players[3] = new CricketPlayer("Sachin",31,"Green",0,0,0);
		players[4] = new CricketPlayer("Jadeja",24,"Green",0,0,0);
		players[5] = new CricketPlayer("Lazy",45,"Green",0,0,0);
		
		players[6] = new FootballPlayer("Ronaldo",22,"Red",0,0,0);
		players[7] = new FootballPlayer("Mappa",22,"Red",0,0,0);
		players[8] = new FootballPlayer("XYZ",22,"Red",0,0,0);
		players[9] = new FootballPlayer("Messi",22,"Yellow",0,0,0);
		players[10] = new FootballPlayer("Neymar",22,"Yellow",0,0,0);
		players[11] = new FootballPlayer("ABC",22,"Yellow",0,0,0);
		
	}
	
	public void acceptRecord() {
		
	}

	public boolean addGoal(String name, Players [] player) {
		// TODO Auto-generated method stub
		for (int i = 0;  i< player.length ;  i++) {
			if (player[i] != null && player[i] instanceof FootballPlayer &&  player[i].getName().equals(name)) {
				FootballPlayer football = (FootballPlayer) player[i];
				football.setGoalsScored(football.getScore() + 1);
				return true;
			}
		}
		return false;
	}
	
	public boolean addAssist(String name, Players [] player) {
		// TODO Auto-generated method stub
		for (int i = 0;  i< player.length ;  i++) {
			if (player[i] != null && player[i] instanceof FootballPlayer &&  player[i].getName().equals(name)) {
				FootballPlayer football = (FootballPlayer) player[i];
				football.setAssists(football.getAssists()+1);
				return true;
			}
		}
		return false;
	}

	public void showScore(Players []  player) {
		// TODO Auto-generated method stub
		int score_green = 0;
		int score_blue = 0;
		int score_yellow = 0;
		int score_red = 0;
		for (int i = 0;  i< player.length ;  i++) {
			if (player[i] != null ) {
				player[i].play(); // Dynamic Method Dispatch
				
				String team = player[i].getTeam();
				switch (team) {
				case "Green":
					score_green += player[i].getScore();
					break;
				case "Blue":
					score_blue += player[i].getScore();
					break;
				case "Yellow":
					score_yellow += player[i].getScore();
					System.out.println("Done");
					break;
				case "Red":
					score_red += player[i].getScore();
					System.out.println("Done");
					break;
				default:
					//System.out.println(team);
				}
			}
		}
		String fwinner;
		if (score_red == score_yellow) {
			fwinner =  "Its a tie!";
		} else {
			fwinner = score_red > score_yellow ? "Team Red"  : "Team Yellow";
		}
		System.out.println("The winner of the football Team is " + fwinner);
		
		String cwinner;
		if (score_blue == score_green) {
			cwinner =  "Its a tie!";
		} else {
			cwinner = score_blue > score_green ? "Team Blue"  : "Team Green";
		}
		System.out.println("The winner of the cricket Team is " + cwinner);
		
	}

	public boolean addRuns(String name, Players [] player) {
		// TODO Auto-generated method stub
		for (int i = 0;  i< player.length ;  i++) {
			if (player[i] != null && player[i] instanceof CricketPlayer &&  player[i].getName().equals(name)) {
				CricketPlayer cricket = (CricketPlayer) player[i];
				cricket.setRunsScored(cricket.getScore() + 1);
				return true;
			}
		}
		return false;
	}
	
	public boolean addWicket(String name, Players [] player) {
		// TODO Auto-generated method stub
		for (int i = 0;  i< player.length ;  i++) {
			if (player[i] != null && player[i] instanceof CricketPlayer &&  player[i].getName().equals(name)) {
				CricketPlayer cricket = (CricketPlayer) player[i];
				cricket.setWicketsTaken(cricket.getWicketsTaken() + 1);
				return true;
			}
		}
		return false;
	}
	
	
}
