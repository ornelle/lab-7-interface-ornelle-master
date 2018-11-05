public class TicTacToeAI {
    public static void main (String [] args)
    {
        TicTacToeBoard ultimateB= new TicTacToeBoard();
        AdvancedTicTacToeStrategy advanced= new AdvancedTicTacToeStrategy();
        BasicTicTacToeStrategy basicAI= new BasicTicTacToeStrategy();

        while(true){
            System.out.println("Watch the ULTIMATE BATTLE!!! AI VS ADVANCED AI ");
            String adv= advanced.getMove(ultimateB);
            ultimateB.makeMove(adv, "x");
            System.out.println(ultimateB.toString());
            if (ultimateB.isOver()){
                System.out.println(advanced.getName());
                break;
            }
            //simple AI
            String bas= basicAI.getMove(ultimateB);
            ultimateB.makeMove(bas, "o");
            System.out.println(ultimateB.toString());
            if(ultimateB.isOver()){
                System.out.println(basicAI.getName());
                break;
            }

        }
    }
}
