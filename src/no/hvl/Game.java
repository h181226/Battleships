package no.hvl;

public class Game {
	//Objektvariabler
	private Player hPlayer;
	private Player aiPlayer;
	
	//Konstruktør
	public Game(String hName, int size) {
		Board board = new Board(size);
		hPlayer = new HumanPlayer(board, hName);
		aiPlayer = new AIPlayer(board);
	}
	
	//Metoder
	
	/**
	 * toString metode
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
