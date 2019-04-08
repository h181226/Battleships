package no.hvl;

import java.util.ArrayList;

public class Board {

	private char[][] board;
	private ArrayList<Ship> ships;

	public Board() {
		this(8);
	}

	public Board(int size) {
		board = new char[size][size];
		ships = new ArrayList<Ship>();
		createBoard(size);
		createShips();
	}

	private void createBoard(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = '-';
			}
		}
	}

	private void createShips() {
		ships.add(new Carrier());
		ships.add(new Battleship());
		ships.add(new Destroyer());
		ships.add(new PatrolBoat());
		ships.add(new Submarine());
	}
}
