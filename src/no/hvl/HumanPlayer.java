package no.hvl;

public class HumanPlayer implements Player{
	
	private Board board;
	private String name;
	
	public HumanPlayer() {
		this(null, "");
	}
	
	public HumanPlayer(Board board, String name) {
		this.name = name;
		this.board = board;
	}

}
