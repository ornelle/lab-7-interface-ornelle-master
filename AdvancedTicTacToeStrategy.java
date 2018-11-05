
public class AdvancedTicTacToeStrategy implements ITicTacToeStrategy{

    public String getMove(TicTacToeBoard board)
    {
        for(int i=0; i< ROWS; i++)
        {
            for(int j=0; j<COLUMNS; j+=2)
            {
                if(board.isEmpty(i,j)) {
                    return String.valueOf(i + 1) + String.valueOf(j + 1);
                }
            }
        }
        return " "; }

    public String getName(){ return "AdvancedAI"; }
}
