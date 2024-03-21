package djh.learn.dP.strategyDesignPattern;

import djh.learn.dP.strategyDesignPattern.model.Ballon;
import djh.learn.dP.strategyDesignPattern.model.Clowns;
import djh.learn.dP.strategyDesignPattern.model.SquareBallon;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.print("Ballon Tap Score :: ");
        scoreBoard.sb = new Ballon();
        scoreBoard.showScore(2, 10);

        System.out.print("Clown Tap Score :: ");
        scoreBoard.sb = new Clowns();
        scoreBoard.showScore(2, 10);

        System.out.print("SquareBallon Tap Score :: ");
        scoreBoard.sb = new SquareBallon();
        scoreBoard.showScore(2, 10);
    }
}