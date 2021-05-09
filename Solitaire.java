package aufgabe3;

public class Solitaire {

	private Moves game;
	private State[][] field;
	{
		for(int row = 0; row < this.field.length; row++)
		{
			System.out.print(row+1+"|");
			for(int col = 0; col < this.field[row].length; col++)
			{
				if(this.field[row][col] == State.USED) System.out.print(col+1+" ");
				if(this.field[row][col] == State.USED) System.out.print("o ");
				else if(this.field[row][col] == State.NOT) System.out.print("  ");
				else System.out.print("x ");
			}
		int nrOfPossibleTos = 0;
		int fromRow;
		int fromCol;
		if(!possibleFrom(fromRow, fromCol)) return new Point[nrOfPossibleTos];
		
		if(fromRow > 1 && this.field[fromRow-1][fromCol] == State.USED && this.field[fromRow-2][fromCol] == State.FREE) nrOfPossibleTos++;
		if(fromRow < 5 && this.field[fromRow+1][fromCol] == State.USED && this.field[fromRow+2][fromCol] == State.FREE) nrOfPossibleTos++;
		if(fromCol < 5 && this.field[fromRow][fromCol+1] == State.USED && this.field[fromRow][fromCol+2] == State.FREE) nrOfPossibleTos++;
		if(fromCol > 1 && this.field[fromRow][fromCol-1] == State.USED && this.field[fromRow][fromCol-2] == State.FREE) nrOfPossibleTos++;
		boolean up = fromRow > 1 && this.field[fromRow-1][fromCol] == State.USED && this.field[fromRow-2][fromCol] == State.FREE;
	    boolean down=fromRow < 5 && this.field[fromRow+1][fromCol] == State.USED && this.field[fromRow+2][fromCol] == State.FREE;
	    boolean right=fromCol < 5 && this.field[fromRow][fromCol+1] == State.USED && this.field[fromRow][fromCol+2] == State.FREE;
	    boolean left=fromCol > 1 && this.field[fromRow][fromCol-1] == State.USED && this.field[fromRow][fromCol-2] == State.FREE;
		
		if(up) nrOfPossibleTos++;
		if(down) nrOfPossibleTos++;
		if(right) nrOfPossibleTos++;
		if(left) nrOfPossibleTos++;
		
		Point[] tos = new Point[nrOfPossibleTos];
		int index = 0;
		if(fromRow > 1 && this.field[fromRow-1][fromCol] == State.USED && this.field[fromRow-2][fromCol] == State.FREE)
			{
				tos[index] = new Point(fromRow-2, fromCol);
				index++;
			}
		if(fromRow < 5 && this.field[fromRow+1][fromCol] == State.USED && this.field[fromRow+2][fromCol] == State.FREE) 
			{
				tos[index] = new Point(fromRow+2, fromCol);
				index++;
			}
		if(fromCol < 5 && this.field[fromRow][fromCol+1] == State.USED && this.field[fromRow][fromCol+2] == State.FREE) 
			{
				tos[index] = new Point(fromRow, fromCol+2);
				index++;
			}
		if(fromCol > 1 && this.field[fromRow][fromCol-1] == State.USED && this.field[fromRow][fromCol-2] == State.FREE) tos[index] = new Point(fromRow, fromCol-2);
		if(up) tos[index++] = new Point(fromRow-2, fromCol);
		if(down) tos[index++] = new Point(fromRow+2, fromCol);
		if(right) tos[index++] = new Point(fromRow, fromCol+2);
		if(left) tos[index] = new Point(fromRow, fromCol-2);
		
		return tos;
	}
	
	public boolean moveFirstPossible()
	{
		System.out.println("Moving the first possible move from the following list of possible moves:");
		System.out.println("Make the first possible move from the following list of possible ones:");
		if(!moveFirstPossible()) return false;
		else {
			Moves possibleMoves = this.possibleMoves();
			possibleMoves.printMoves();
			try {
				Move move = possibleMoves.getMoveAtIndex(0);
				this.move(move);
			
				return true;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Zug nicht moeglich!");
				return false;
			}
			Move move = possibleMoves.getMoveAtIndex(0);
			this.move(move);
			return true;
		}
	}
private Moves possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}
private boolean possibleFrom(int fromRow, int fromCol) {
		// TODO Auto-generated method stub
		return false;
	}
private void move(Move move) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		Solitaire game = new Solitaire();
		System.err.println("      START");
		System.err.println("    START");
		System.out.println();
		game.print();
		System.out.println();
		int zug=1;
		int zug1 =1;
		while(game.moveFirstPossible())
		{
			System.err.println("Nachdem "+zug1+"en Zug:");
			System.err.println("After "+ zug1+". move:");
			System.out.println();
			zug1++;
			game.print();
			game.print();	
		}
		System.out.println("Kein moeglicher Zug");
	}

	void print() {
		
	

		System.out.println("No possible move");
		game.printMoves();
		
	}
}
