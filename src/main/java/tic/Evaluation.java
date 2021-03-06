package tic;

public enum Evaluation {
	  NOWINNER, /* valid board, but the game hasn't been won by either player yet */
	  XWINS, /* valid board, and the game was won by player X */
	  OWINS, /* valid board, and the game was won by player O */
	  UNREACHABLESTATE /* string describes a board, but not a board state that is reachable from a valid game */
	}
