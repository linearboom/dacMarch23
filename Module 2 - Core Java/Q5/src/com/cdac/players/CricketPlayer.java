package com.cdac.players;

public class CricketPlayer extends Players {
	
	private int runsScored;
	private int wicketsTaken;
	
	
	
	public CricketPlayer(String name, int age, String team, int score, int runsScored, int wicketsTaken) {
		super(name, age, team, score);
		this.runsScored = runsScored;
		this.wicketsTaken = wicketsTaken;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.setScore(runsScored);
		super.setScore((super.getScore() +  wicketsTaken * 10 ));
	
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	
	

}
