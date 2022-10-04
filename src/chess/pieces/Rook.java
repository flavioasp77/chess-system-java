package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		// above
		p.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// left
		p.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// right
		p.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// below
		p.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}
}





//package chess.pieces;
//
//import boardgame.Board;
//import boardgame.Position;
//import chess.ChessPiece;
//import chess.Color;
//
//public class Rook extends ChessPiece {
//
//	public Rook(Board board, Color color) {
//		super(board, color);
//	}
//	
//	@Override
//	public String toString() {
//		return "R";
//	}
//
//	@Override
//	public boolean[][] possibleMoves() {
//		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
//		
//		Position pos = new Position(0, 0);
//		
//		// above
//		pos.setValues(position.getRow() - 1, position.getColumn());
//		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
//			mat[pos.getRow()][pos.getColumn()] = true;
//			pos.setRow(pos.getRow() - 1);
//		}
//		if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
//			mat[pos.getRow()][pos.getColumn()] = true;
//		}
//		
//		// left
//		position.setValues(position.getRow(), position.getColumn() - 1);
//		while(getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
//			mat[position.getRow()][position.getColumn()] = true;
//			position.setColumn(position.getColumn() - 1);
//		}
//		if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
//			mat[position.getRow()][position.getColumn()] = true;
//		}
//		
//		// right
//		position.setValues(position.getRow(), position.getColumn() + 1);
//		while(getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
//			mat[position.getRow()][position.getColumn()] = true;
//			position.setColumn(position.getColumn() + 1);
//		}
//		if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
//			mat[position.getRow()][position.getColumn()] = true;
//		}
//		
//		// below
//		position.setValues(position.getRow() + 1, position.getColumn());
//		while(getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
//			mat[position.getRow()][position.getColumn()] = true;
//			position.setRow(position.getRow() + 1);
//		}
//		if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
//			mat[position.getRow()][position.getColumn()] = true;
//		}		
//		
//		return mat;
//	}
//}
