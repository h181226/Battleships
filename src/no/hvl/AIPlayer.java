package no.hvl;

public class AIPlayer implements Player{
	
	private Board board;
	
	public AIPlayer() {
		this(null);
	}
	
	public AIPlayer(Board board) {
		board = this.board;
	}

}
