package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		inicialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i += 1) {
			for (int j = 0; j < board.getColumns(); j +=1) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void inicialSetup() {
		board.plecePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.plecePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.plecePiece(new King(board, Color.WHITE), new Position(7, 4));
		board.plecePiece(new Rook(board, Color.BLACK), new Position(0, 7));
		
	}
}
