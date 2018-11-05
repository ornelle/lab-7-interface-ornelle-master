/**
   Mock strategy for a computer to pick the next move
   on a 3 x 3 tic-tac-toe board. This strategy
   searches for the first unoccupied square.
*/
public class BasicTicTacToeStrategy implements ITicTacToeStrategy
{
  public String getMove(TicTacToeBoard b)
  {
    for (int i=0; i< ROWS; i++)
    {
      for(int j=0; j< COLUMNS; j++)
      {
        if( b.isEmpty(i,j))
        {
          return String.valueOf(i+1)+ String.valueOf(j+1);
        }

      }
    }

    return null;
  }

  public String getName()
  {
    //default return null;
    return "ornelle";
  }

}
