package com.cdac.players;

public class FootballPlayer extends Players {
	private int goalsScored;
	private int assists;
	
	public FootballPlayer(String name, int age, String team, int score, int goalsScored, int assists) {
		super(name, age, team, score);
		this.goalsScored = goalsScored;
		this.assists = assists;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.setScore(goalsScored);
		super.setScore(getScore() + assists * 5);
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	

}
